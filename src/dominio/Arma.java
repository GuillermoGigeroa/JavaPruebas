package dominio;

import abstracts.Objeto;
import helper.Util;

public class Arma extends Objeto {
	private static final String nombreObjeto = "arma";
	private static final Boolean generoObjeto = false;
	private Cargador cargador = null;

	// constructores
	public Arma() {
		super(nombreObjeto, generoObjeto);
		mensajeCreado();
	}

	public Arma(String nombre) {
		super(nombre, generoObjeto);
		mensajeCreado();
	}

	public Arma(Boolean genero) {
		super(nombreObjeto, genero);
		mensajeCreado();
	}

	public Arma(String nombre, Boolean genero) {
		super(nombre, genero);
		mensajeCreado();
	}

	// métodos de la clase
	@Override
	public void mensajeCreado() {
		Util.mensaje_femenino(super.getNombreObjeto());
	}

	public Boolean tieneCargador() {
		if (cargador == null) {
			return false;
		}
		return true;
	}

	public void ponerCargador(Cargador esteCargador) {
		cargador = esteCargador;
		cargador.meterEnArma();
	}

	public Cargador sacarCargador() {
		cargador.sacarDeArma();
		Cargador esteCargador = cargador;
		cargador = null;
		return esteCargador;
	}

	public void disparar() {
		if (tieneCargador()) {
			if (cargador.sacarBala()) {
				Util.escribir("El arma " + super.getNombreObjeto() + " dispara y se escucha un estruendo.");
			} else {
				Util.escribir("El arma no tiene balas.");
			}
		} else {
			Util.escribir("El arma no tiene cargador.");
		}
	}

}
