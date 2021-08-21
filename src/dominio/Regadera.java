package dominio;
import abstracts.Objeto;
import helper.Util;

public class Regadera extends Objeto {
	private Boolean tieneAgua;

	public Regadera() {
		super("regadera");
		setTieneAgua(false);
		mensajeCreado();
	}

	public Regadera(Boolean tieneAgua) {
		super("regadera");
		setTieneAgua(tieneAgua);
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
		Util.mensaje_femenino(super.getNombreObjeto());
	}
}
