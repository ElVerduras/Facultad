import java.util.ArrayList;
/**
 * Equipo 
 * @author Diego_Castells 
 * @author Daniel_Dell_arciprete 
 */
public class Equipo {
	private String disciplina;
	private EntrenadorEquipo entrenador;
	private ArrayList<Deportista> deportistas;
 	
public Equipo() {}
public Equipo(int n_deportista,String Disciplina) {
	disciplina=Disciplina;
	entrenador=new EntrenadorEquipo();
	deportistas=new ArrayList<Deportista>();
}

/**  
**almacena los datos del entrenador
*/
public void SetEntrenador(EntrenadorEquipo Entrenador){
	this.entrenador=Entrenador;
}

/**  
* retorna los datos del entrenador
*@return (retorna el entrenador)
*/
public EntrenadorEquipo GetEntrenador(){
	return entrenador;
}

/**  
* almacena los datos de cada disciplina
*/
public void SetDisciplina(String Disciplina){
	disciplina=Disciplina;
}

/**  
* retorna la disciplina del equipo
* @return (retorna la disciplina)
*/
public String GetDisciplina(){
	return disciplina;
}

/**  
* almacena un deportista en el equipo
*/
public void SetDeportista(Deportista Deportist){
	deportistas.add(Deportist);
}

/**  
* retorna la lista de deportistas del equipo
* @return (retorna lista de deportistas)
*/
public ArrayList<Deportista> GetDeportista(){
	return deportistas;
}

/**
* el metodo total de participantes por equipo devuelve la cantidad de deportistas que hay en un equipo
* @return (Nro de de deportistas por equipo)
*/
public int tot_paticipantes_por_equipo(ArrayList<Deportista> deportistas) {
	return deportistas.size();
}

}
