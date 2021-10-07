import java.util.ArrayList;
/**
 * Delegación 
 * @author Diego_Castells 
 * @author Daniel_Dell_arciprete 
 */
public class Delegación {
	private String pais;
	private int[] medallas;
	private ArrayList<Equipo> equipos;

	public Delegación(){}
	public Delegación(String Pais){
		int i;
		medallas=new int[3];
		for(i=0;i<3;i++) {	medallas[i]=0;  }
		this.pais=Pais; 
		equipos=new ArrayList<Equipo>();
	}

public void SetPais(String Pais){
	pais=Pais;
}

public String GetPais(){
	return pais;
}

/**
* el metodo SetMedallas devuelve el vector con cantidad de medallas por delegacion(oro,plata,bronce) en ese orden segun cada posición
*/
public void SetMedallas( int[] medal){
	int i;
	for (i=0;i>medal.length;i++) { 
		this.medallas[i]=medal[i];
  }
}

/**
* el metodo GetMedallas devuelve el vector con cantidad de medallas por delegacion(oro,plata,bronce) en ese orden segun cada posición
* @return (vector de medallas)
*/
public int[] GetMedallas(){
	return medallas; 
}

/**
* el metodo SetEquipos almacena en la lista un equipo
*/
public void SetEquipos( Equipo equipo ){
	equipos.add(equipo);
}

/**
* el metodo GetEquipos devuelve la lista con los equipos
* @return (lista de equipo)
*/
public ArrayList<Equipo> GetEquipos(){
	return equipos;
}

public void eliminar( Equipo equipo ){}

public void eliminar(){}

/**
* el metodo total de equipo por delegacion devuelve la cantidad de equipos que hay por pais
* @return (Nro de de equipos por paos)
*/
public int tot_equipo_por_delegacion(ArrayList<Equipo> equipos) {
	return equipos.size();
}

}