
#include <stdio.h>
#include <stdlib.h>
#include <string.h>


unsigned int decBin(unsigned int, unsigned int); //pasa una el valor de una variable entera a binario en la misma variable
unsigned long long calc_Sup(unsigned int); //calcula la superficie de un circulo
unsigned long long transf(unsigned long long); //cambiar base 2 fraccionaria a base 2 entera
void binEnt(unsigned long long); // muestra la superficie en base 10

int main(){

    char               radio_aux[5]; //almacena la parte fraccional del numero ingresado por el usuario
    unsigned int       radio_ent;
    unsigned int       radio_frac[5]; //almacena la parte fraccional al procesar radio_aux
    unsigned int       radio_ent32 = 0; //almacena la parte entera de 32b
    unsigned int       radio_frac32 = 0; //almacena la parte fraccional de 32b
    unsigned int       radio; //almacena el numero decimal en 32b
    unsigned long long superficie = 0; //almacena la superficie en 64b
    int                aux = 1; // "booleano de confirmacion para el ingreso de datos"

    //----------------------|Carga de valores|-----------------------------

    while(aux){
        printf("Ingrese el valor del radio, r (r<1023,99999 y r>=0,00199). Use como separador el punto ('.') \n");
        scanf("%u.%s", &radio_ent, radio_aux);
        if(radio_ent > 1023) {
                aux = 1;
                printf("Parte entera mas chica\n");
        } else if (radio_ent == 1023 && strcmp(radio_aux, "99999") > 0) {
                printf("Parte decimal mas chica\n");
                aux = 1;
            } else if(radio_ent < 0 ) {
                    printf("Parte entera mas grande\n");
                    aux = 1;
                } else if(radio_ent == 0 && strcmp(radio_aux, "00199") < 0) {
                        printf("Parte decimal mas grande\n");
                        aux = 1;
                    } else aux = 0;
    }

    //-----------|inicializacion y carga del fraccional|---------------------

    int i;
    for (i = 0; i < 5; i++){
        radio_frac[i] = 0;
    }
    int j = 0;
    while(radio_aux[j] != '\0'){
        radio_frac[j] = (unsigned int) radio_aux[j] - 48;
        j++;
    }

    //--------------|fraccional de vector >> integer|-------------------------

    int a;
    int f = 10000;
    for (a = 0; a< 5; a++){
        radio_frac32 += radio_frac[a] * f;
        f /= 10;
    }
    radio = decBin(radio_frac32, radio_ent);

    //------------------|calculo de superficie|-------------------------------

    superficie = calc_Sup(radio);
    binEnt(superficie);

    return 0;
}

unsigned int decBin(unsigned int dig,  unsigned int radio_ent)
{
    unsigned int potencia = 65536; //2^16
    unsigned int aux = dig;
    unsigned int decimal = 0;

    radio_ent = radio_ent << 17;

    while(aux != 0  &&  potencia != 0){ //si es mayor a 100000 se pone 1 * potencia
        aux *= 2;
        if(aux >= 100000){
            decimal += potencia;
            aux= aux - 100000;
        }
        potencia = potencia / 2;
    }
    unsigned int radio = (radio_ent | decimal);//hacemos un or para que se unir ambas partes

    return radio;
}

unsigned long long calc_Sup(unsigned int rad)
{
    unsigned long long pi_64 = 0b0000000000000000000000000000000000000000000001100100100001111110; //3.14159
    unsigned long long rad_64 = rad;

    unsigned long long resultado = pi_64 * rad_64;
    resultado = resultado >> 17;

    return (resultado * rad_64);;
}

unsigned long long transf(unsigned long long num)
{
    long long int c;
    long long unsigned int k;
    int j=0;
    int i;
    unsigned long long decimal=0;
    unsigned long long potencias[34];

    potencias[0] = 500000000000; //inicializacion del vector de potencias fraccionarias de 2
    for (i = 1;i < 34; i++) potencias[i] = potencias[i-1] / 2;

    for (c = 63; c >= 0; c--) //conversion de base
    {
        k = num >> c;
        if (k & 1) decimal += potencias[j];
        j++;
    }

    return decimal;
}

void binEnt(unsigned long long num)
{
    unsigned long long entero = num >> 34; //acomodamos los bits para su representacion en enteros
    unsigned long long decimal = num << 30;

    printf("\nSuperficie: %u.%llu\n", entero, transf(decimal));

}




