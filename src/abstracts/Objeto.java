package abstracts;

public abstract class Objeto {
	public String nombreObjeto;
	public Objeto() {
		nombreObjeto = "Sin nombre";
	}
	public Objeto(String nombre) {
		nombreObjeto = nombre;
	}
	protected String getNombreObjeto() {
		return nombreObjeto;
	}
	protected void setNombreObjeto(String nombreObjeto) {
		this.nombreObjeto = nombreObjeto;
	}
	public abstract void mensajeCreado();
}
