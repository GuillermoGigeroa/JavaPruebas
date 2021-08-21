package abstracts;

public abstract class Objeto {
	public String nombreObjeto;
	public Boolean genero; // femenino == false
	
	// constructores
	public Objeto() {
		nombreObjeto = "Sin nombre";
	}
	public Objeto(String nombre) {
		nombreObjeto = nombre;
	}
	public Objeto(String nombre, Boolean genero) {
		nombreObjeto = nombre;
		this.genero = genero;
	}
	
	// métodos de la clase
	public abstract void mensajeCreado();
	
	//getters y setters
	protected Boolean getGenero() {
		return genero;
	}
	protected void setGenero(Boolean genero) {
		this.genero = genero;
	}
	protected String getNombreObjeto() {
		return nombreObjeto;
	}
	protected void setNombreObjeto(String nombreObjeto) {
		this.nombreObjeto = nombreObjeto;
	}
}
