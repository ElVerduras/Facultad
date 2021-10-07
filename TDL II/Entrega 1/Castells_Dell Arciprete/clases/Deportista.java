import java.util.ArrayList;
/**
 * Deportista 
 * @author Diego_Castells 
 * @author Daniel_Dell_arciprete 
 */
public class Deportista {
	private String nombre;
	private String apellido;
	private ArrayList<Medal> medallas;
	
	public Deportista() {}
	public Deportista(String Nombre,String Apellido){
		nombre=Nombre;
		apellido=Apellido;
		medallas = new ArrayList<Medal>();
	}
	
	/**
	* el metodo SetNombre almacena el nombre del deportista
	*/
	public void SetNombre(String Nombre){
		this.nombre=Nombre;
	}
	
	/**
	* el metodo GetNombre devuelve el nombre del deportista
	* @return (nombre)
	*/
	public String GetNombre(){
		return nombre;
	}
	
	/**
	* el metodo SetApellido almacena el apellido del deportista
	*/
	public void SetApellido(String Apellido){
		apellido=Apellido;
	}
	
	/**
	* el metodo GetApellido devuelve el apellido del deportista
	* @return (apellido)
	*/
	public String GetApellido(){ 
		return apellido;
	}
	
	/**
	* el metodo GetMedallas devuelve la lista de medallas
	* @return (lista de medallas)
	*/
	public void SetMedallas(Medal medalla){
		medallas.add(medalla);
	}
	
	/**
	* el metodo GetMedallas devuelve la a lista de medallas
	* @return (lista de medallas)
	*/
	public ArrayList<Medal> GetMedallas(){
		return medallas;
	}
	
	
	/**
	* el metodo devuelve el total de medallas por paricipantes 
	* @return (Nro de de equipos por paos)
	*/
	public int tot_medalla_por_paticipantes(ArrayList<Medal> medallas ) {
		return medallas.size();
	}
	
	
}
