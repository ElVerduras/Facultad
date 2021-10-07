package Tokyo_2021_Package;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.ArrayList;
import java.util.Scanner;

public class Mainsito {

  public static void main(String[] args) {
	  
	Scanner in = new Scanner(System.in);
    
    Connection con = null;
  
    try {
      
      con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Tokyo2021","root", "1234");
      Statement sent = con.createStatement();
      
      ResultSet resul = sent.executeQuery("SELECT * from disciplina");
      
     // // PreparedStatement p_sent = con.prepareStatement("INSERT INTO atleta_en_disciplina VALUES (?,?)");
      
      String auxCarga = "si";
      
      int idDeportista = 1;
      
      while (!(auxCarga.equals("no"))) {
    	  
	      //solicita la carga del deportista
	      System.out.println("Ingresar Apellido, Nombre, email, telefono");
	      Deportista dep = new Deportista(idDeportista,in.nextLine(),in.nextLine(),in.nextLine(),in.nextLine());
	      
	      //imprime las disciplinas
		  while (resul.next()) {  
			  
			  System.out.println(resul.getString("id") + " - " + resul.getString("nombre") );
	     
		  }
		 
	      
	      //creación e inicializacion del vector de disciplinas (solo guarda los IDs)
	      int[] idDisciplina = {0,0,0,0,0,0,0,0,0,0};
	      int auxVector = 0;
	      
	      //carga de las disciplinas
	      System.out.println("Ingresar id de la disciplina a competir [ingresar id 11 para salir]");
	      idDisciplina[auxVector] = in.nextInt();
	      while (idDisciplina[auxVector] != 11 && auxVector <= 10) {
	    	 
	    	  System.out.println("Ingresar id de la disciplina a competir [ingresar id 11 para salir]");
	    	  auxVector++;
	    	  idDisciplina[auxVector] = in.nextInt();
	    	 	  
	      }
	      
	      //muestra en pantalla los datos cargados
	      System.out.println("Esta informacion es correcta?n/");
	      System.out.println(dep.toString());
	      System.out.println("n/Disciplinas inscriptas");
	      for (int i=0; i<=auxVector; i++) {
	    	  
	    	  System.out.println(idDisciplina[i]);
	      
	      }
	      
	      //confirmacion de los datos cargados
	      System.out.println("Desea continuar? [si (1) - no (0)]");
	      int auxConfirmacion = in.nextInt();
	      
	      //da de alta los datos en la base de datos
	      if (auxConfirmacion == 1) {
	    	  
	    	  String query = "INSERT INTO deportista VALUES (" + dep.toString() + ")" ;	  
	 	      int res = sent.executeUpdate(query);
	 	      
	 	    // // p_sent.clearParameters();
	 	    // // p_sent.setInt(1,idDeportista);
	 	      
	 	      for (int i=0; i<=auxVector; i++) {
	 	    	  
	 	    	// // p_sent.setInt(2, idDisciplina[i]);
	 	    	  
	 	    	 query = "INSERT INTO atleta_en_disciplina VALUES (" + idDeportista + ", " + idDisciplina[i] + ")";
	 	         res = sent.executeUpdate(query); 
	 	         
		      }
	 	      
	 	   // // res = p_sent.executeUpdate();
	 	     
	 	     //se aumenta el id de deportista 
	 	     System.out.println("1");
	 	     idDeportista++;
	 	     System.out.println("2");
	 	     
	      }
	      
	      System.out.println("3");
	      System.out.println("Desea continuar agregando deportistas? [si - no]");
	      System.out.println("4");
	      auxCarga = in.nextLine();
	      System.out.println("5");
	      
      }
      
      System.out.println("6");
      
      sent.close();
      con.close();
      
    } 
      
    catch (SQLException e) {
    System.out.println("no se pudo conectar a la BD");
  
  }
}
}


