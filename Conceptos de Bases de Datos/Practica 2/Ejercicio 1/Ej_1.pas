program Ej_1;
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

procedure borrar(var f1, f2:archivoPlanta);
var
  aux: planta;
  cod_borrar: integer;

begin
     readln(cod_borrar);
     while (cod_borrar <> -1) do
     begin
          reset(f1);
          read(f1,aux);
          while ((not eof(f1)) and (cod_borrar <> aux.cod))do
          begin
               read(f1,aux);
          end;
          if(cod_borrar = aux.cod)then
          begin
            seek(f1, filePos(f1) - 1);
            aux.cod := -1;
            write(f1,aux);
          end;
          readln(cod_borrar);
     end;

     reset(f1);
     reset(f2);

     while (not eof(f1)) do
     begin
          read(f1,aux);
          if (aux.cod <> -1) then write(f2,aux);
     end;

     close(f1);
     close(f2);

end;

procedure borrar2(var f1:archivoPlanta);
var
  aux: planta;
  codigoBorrar: integer;
  posb: integer;
begin
     readln(codigoBorrar);

     while (codigoBorrar <> -1 )do
     begin
          reset(f1);
          aux.cod := -999;
          while ((not eof(f1)) and (aux.cod <> codigoBorrar)) do
          begin
               read(f1,aux);
          end;
          if (aux.cod = codigoBorrar) then
          begin

            if (not eof(f1)) then
            begin
              posB := filePos(f1) - 1;
              seek(f1,filesize(f1)-1);
              read(f1,aux);
              seek(f1,filesize(f1)-1);
              truncate(f1);
              seek(f1,posB);
              write(f1,aux);
            end
            else
            begin
              seek(f1,filesize(f1)-1);
              truncate(f1);
            end;

          end;
          readln(codigoBorrar);

     end;

    close(f1);

end;

var
   f1, f2: archivoPlanta;

begin

  assign(f1,'plantas');
  assign(f2,'plantasBuenas');
  rewrite(f1);
  rewrite(f2);
  cargarArchivo(f1);
  imprimirArchivo(f1);

 // borrar(f1,f2);
  borrar2(f1);
  imprimirArchivo(f1);
  ///esta todo cerrado como el culo, abierto pero no cerrado a la vez
  reset(f1);
  close(f1);
  reset(f2);
  close(f2);
  readln();
end.


