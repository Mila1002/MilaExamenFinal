package app.modelo;

public class Agenda {
	private int idcontacto;
	private String nombre;
	private String email;
	private String telefono;
	
	public Agenda() {
		// TODO Auto-generated constructor stub
	}

	public Agenda(int idcontacto, String nombre, String email, String telefono) {
		super();
		this.idcontacto = idcontacto;
		this.nombre = nombre;
		this.email = email;
		this.telefono = telefono;
	}

	public int getIdcontacto() {
		return idcontacto;
	}

	public void setIdcontacto(int idcontacto) {
		this.idcontacto = idcontacto;
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
				"  [ID CONTACTO: " + idcontacto +
				", NOMBRE: " + nombre + 
				", EMAIL: " + email + 
				", TELEFONO: " + telefono
				+ "]";
		
		
	}
	
	

}
