package app.modelo;

public class Agenda {
	private int id;
	private String nombre;
	private String email;
	private String telefono;
	
	public Agenda() {
		// TODO Auto-generated constructor stub
	}

	public Agenda(int id, String nombre, String email, String telefono) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.email = email;
		this.telefono = telefono;
	}

	public int getid() {
		return id;
	}

	public void setid(int id) {
		this.id = id;
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
		return "Agenda: " + "\n" + 
				"  [ID CONTACTO: " + id +
				", NOMBRE: " + nombre + 
				", EMAIL: " + email + 
				", TELEFONO: " + telefono
				+ "]";
		
		
	}
	
	

}
