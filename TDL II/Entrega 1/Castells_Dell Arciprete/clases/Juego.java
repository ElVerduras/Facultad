import java.util.ArrayList;

/**
 * Juego 
 * author Diego_Castells 
 * author Daniel_Dell_arciprete 
 */
public class Juego {
	private String nombre;
	private ArrayList<Delegación> delegación; 
	private ArrayList<Disciplina> disciplina; 
	

public Juego(){}
public Juego(String Nombre,ArrayList<Delegación> delegación){
	nombre=Nombre;
	delegación=new ArrayList<Delegación>();
	disciplina=new ArrayList<Disciplina>();
}
/**
* el metodo SetNombre almacena el nombre del equipo
*/
public void SetNombre(String Nombre){
	nombre=Nombre;
}
/**
* el metodo GetNombre devuelve el nombre del equipo
* @return (Nombre del juego)
*/
public String GetNombre(){ 
	return nombre;
}

public void SetCompetencia(Delegación delegacion){
	delegación.add(delegacion);
}

public ArrayList<Delegación> GetCompetencia(){
	return delegación;
}

public int tot_comp_por_paticipantes(ArrayList<Delegación> delegación ) {
	return delegación.size();
}
/**
* el metodo SetDisciplina agrega una disciplinas a la lista 
* @return (lista de disciplinas)
*/
public void SetDisciplina(Disciplina discipline){
	disciplina.add(discipline);
}

/**
* el metodo GetDisciplina devuelve la lista de disciplinas
* @return (lista de disciplinas)
*/
public ArrayList<Disciplina> GetDisciplina(){
	return disciplina;
}

/**
* el metodo total de equipo por delegacion devuelve la cantidad de equipos que hay por pais
* @return (Nro de de equipos por paos)
*/
public int tot_disc_por_juego(ArrayList<Disciplina> disciplina ) {
	return disciplina.size();
}


}