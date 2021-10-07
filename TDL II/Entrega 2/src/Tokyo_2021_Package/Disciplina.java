package Tokyo_2021_Package;

import java.util.Arrays;

public class Disciplina {
	private int id;
	private String[] nombre;
	
	public Disciplina() {}
	public Disciplina(int id, String[] nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String[] getNombre() {
		return nombre;
	}
	public void setNombre(String[] nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		return "Disciplina [id=" + id + ", nombre=" + Arrays.toString(nombre) + "]";
	}
	
	
	

}
