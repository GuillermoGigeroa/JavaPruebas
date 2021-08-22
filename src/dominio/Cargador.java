package dominio;

import abstracts.Objeto;
import helper.Util;

public class Cargador extends Objeto {
	private int cantidadBalas;
	public static final int maxBalas = 12;
	private Boolean enUso;

	// Constructores
	public Cargador() {
		enUso = false;
		cantidadBalas = 0;
	}

	// Métodos de la clase
	public Boolean agregarBala() {
		if (enUso) {
			return false;
		}
		if (cantidadBalas + 1 <= maxBalas) {
			cantidadBalas = cantidadBalas + 1;
			return true;
		}
		return false;
	}

	public void agregarBalas(int cantidad) {
		for (int x = 0; x < cantidad; x++) {
			agregarBala();
		}
	}

	public Boolean sacarBala() {
		if (cantidadBalas - 1 >= 0) {
			cantidadBalas = cantidadBalas - 1;
			return true;
		}
		return false;
	}

	public void meterEnArma() {
		enUso = true;
	}

	public void sacarDeArma() {
		enUso = false;
	}

	// Getters y setters
	protected int getCantidadBalas() {
		return cantidadBalas;
	}

	protected void setCantidadBalas(int cantidadBalas) {
		this.cantidadBalas = cantidadBalas;
	}

	@Override
	public void mensajeCreado() {
		Util.mensaje_masculino("cargador");
	}

}
