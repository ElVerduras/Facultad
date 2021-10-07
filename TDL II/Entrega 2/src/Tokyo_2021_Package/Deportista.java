package Tokyo_2021_Package;

import java.util.Arrays;

public class Deportista {
	private int id;
	private String apellido;
	private String nombre;
	private String email;
	private String telefono;
	
	
	public Deportista() {}
	public Deportista(int id, String apellido, String nombre, String email, String telefono) {
		super();
		this.id = id;
		this.apellido = apellido;
		this.nombre = nombre;
		this.email = email;
		this.telefono = telefono;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
	@Override
	public String toString() {
		return id + ", '" + apellido + "', '" + nombre + "', '" + email
				+ "', '" + telefono + "'";
	}
	
	
	
	
	
	

}
