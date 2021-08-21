package dominioPlantas;
import helper.Util;

public class Regadera extends Objeto {
	private Boolean tieneAgua;

	public Regadera() {
		this.inicializar(defaultAgua());
	}

	public Regadera(Boolean tieneAgua) {
		this.inicializar(tieneAgua);
	}

	private Boolean defaultAgua() {
		return false;
	}

	private void inicializar(Boolean tieneAgua) {
		this.setTieneAgua(tieneAgua);
		this.mensajeCreado();
	}

	public Boolean getTieneAgua() {
		return tieneAgua;
	}

	public void setTieneAgua(Boolean tieneAgua) {
		this.tieneAgua = tieneAgua;
	}

	public void Llenar(Regador regador) {
		this.tieneAgua = true;
		this.Mensaje(regador);
	}

	public void Usar(Regador regador) {
		this.tieneAgua = false;
		this.Mensaje(regador);
	}

	private void Mensaje(Regador regador) {
		if (this.tieneAgua) {
			Util.escribir("Regadera ha sido llenada por " + regador.getNombre() + ".");
		} else {
			Util.escribir("Regadera ha sido utilizada por " + regador.getNombre() + " y se encuentra vac�a.");
		}
	}

	@Override
	public void mensajeCreado() {
		Util.escribir(Util.mensaje_femenino()+ "regadera.");
	}
}
