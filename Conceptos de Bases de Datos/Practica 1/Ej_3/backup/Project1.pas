program Ej_3;
type
  planta = record
    cod: integer;
    n_b: string[50];
    n_c: string[50];
    altura: real;
    descripcion: string[100];
    zona: string[50];
  end;

  archivoPlanta = file of planta;

procedure cargarArchivo(var f: archivoPlanta);
var
  aux: planta;
begin
     reset(f);

     aux.cod:=1;
     write(f,aux);
     aux.cod:=2;
     write(f,aux);
     aux.cod:=3;
     write(f,aux);
     aux.cod:=4;
     write(f,aux);
     aux.cod:=5;
     write(f,aux);
     aux.cod:=6;
     write(f,aux);
     aux.cod:=7;
     write(f,aux);
     aux.cod:=8;
     write(f,aux);

     close(f)
end;

procedure imprimirArchivo(var f:archivoPlanta);
var
  aux: planta;
begin
     reset(f);
     while (not eof(f)) do
     begin
          read(f,aux);
          writeln(aux.cod);
     end;

     close(f);
end;

var
   f1: archivoPlanta;

begin

  assifn(f1,'plantas');
  rewrite(f1);
  cargarArchivo(f1);
  imprimirArchivo(f1);


  Close(archivo);
end.

