/**
 * EntrenadorEquipo 
 * @author Diego_Castells 
 * @author Daniel_Dell_arciprete 
 */
public class EntrenadorEquipo {
	private String nombre;
	private String apellido;
	
	public EntrenadorEquipo(){}
	public EntrenadorEquipo(String Nombre,String Apellido){
		nombre=Nombre;
		apellido=Apellido;
	}
	
	/**  
	*almacena el nombre del entrenador del equipo
 	*/
	public void SetNombre(String Nombre){
		this.nombre=Nombre;
	}
	
	/**  
	*almacena el nombre del entrenador del equipo
	*@return (retorna el nombre del entrenador)
	*/
	public String GetNombre(){
		return nombre;
	}
	
	/**  
	*almacena el apellido del entrenador del equipo 
	*/
	public void SetApellido(String Apellido){
		apellido=Apellido;
	}
	
	/**  
	*almacena el nombre del entrenador del equipo
	*@return (retorna el apellido del entrenador)
	*/
	public String GetApellido(){ 
		return apellido;
	}
	
}
