program Ej_2;

var
  nombreArchivo: string[20];
  archivo: Text;
  promedio: real;
  min: integer;
  cantCiudades, num: integer;

begin
  min := 999;
  promedio := 0;
  cantCiudades := 0;
  writeln('Nombre de archivo a abrir ');
  readln(nombreArchivo);
  assign(archivo, nombreArchivo);
  reset(archivo);
  While not(EoF(archivo)) do begin
    readln(archivo, num);
    promedio := promedio + num;
    cantCiudades := cantCiudades + 1;
    if (min > num) then min := num;
    writeln('Cantidad de votantes: ', num);
  end;
  close(archivo);
  promedio := promedio/cantCiudades;
  writeln('--------------------');
  writeln('cantidad promedio total: ', promedio);
  writeln('cantidad minima de votantes: ', min);
end.

