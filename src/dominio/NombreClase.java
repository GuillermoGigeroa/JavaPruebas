package dominio;

public abstract class NombreClase {
	private String nombre;
	private Boolean genero; // genero ---> masculino // !genero ---> femenino
	// métodos de la clase
	protected void inicializar (String nombre, Boolean genero) {
		this.setNombre(nombre);
		this.setGenero(genero);
	}
	protected void MensajeCreado() {
		if (this.genero)
		{Util.Escribir("Un nuevo "+this.nombre+" se ha creado.");}
		else
		{Util.Escribir("Una nueva "+this.nombre+" se ha creado.");}
	}
	// getters & setters
	protected String getNombre() {return this.nombre;}
	protected void setNombre(String nombre) {this.nombre = nombre;}
	protected Boolean getGenero() {return this.genero;}
	protected void setGenero(Boolean genero) {this.genero = genero;}
}
