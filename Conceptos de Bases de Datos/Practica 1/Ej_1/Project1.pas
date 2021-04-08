program Project1;

var
  nombreArchivo: string[15];
  archivo: Text;
  material: string[20];


begin
  writeln('Ingresar nombre del archivo a crear ');
  readln(nombreArchivo);
  Assign(archivo,nombreArchivo);
  Rewrite(archivo);

  repeat
    writeln('Ingresar nombre del material ');
    readln(material);
    writeln(archivo, material);
  until (material = 'cemento');

  Close(archivo);
end.

