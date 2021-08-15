package dominio;

public abstract class Objeto {
	private String nombreClase;
	private Boolean genero; // genero ---> masculino // !genero ---> femenino
	// métodos de la clase
	protected void inicializar (String nombre, Boolean genero) {
		this.setNombreClase(nombre);
		this.setGenero(genero);
	}
	protected void mensajeCreado() {
		if (this.genero)
		{Util.Escribir("Un nuevo "+nombreClase+" se ha creado.");}
		else
		{Util.Escribir("Una nueva "+nombreClase+" se ha creado.");}
	}
	// getters & setters
	protected String getNombreClase() {return nombreClase;}
	protected void setNombreClase(String nombre) {nombreClase = nombre;}
	protected Boolean getGenero() {return genero;}
	protected void setGenero(Boolean genero) {this.genero = genero;}
}
