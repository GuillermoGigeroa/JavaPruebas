package dominio;
import abstracts.Objeto;
import helper.Util;

public class Arma extends Objeto {
	private static final String nombreObjeto = "arma";
	private static final Boolean generoObjeto = false;
	
	// constructores
	public Arma () {
		super(nombreObjeto, generoObjeto);
		mensajeCreado();
	}
	
	public Arma (String nombre) {
		super(nombre, generoObjeto);
		mensajeCreado();
	}
	
	public Arma (Boolean genero) {
		super(nombreObjeto, genero);
		mensajeCreado();
	}
	
	public Arma (String nombre, Boolean genero) {
		super(nombre, genero);
		mensajeCreado();
	}
	
	// métodos de la clase
	@Override
	public void mensajeCreado() {
		Util.mensaje_femenino(super.getNombreObjeto());
	}
	
	public void disparar() {
		Util.escribir("Se escucha un disparo...");
	}
	
}
