package dominio;

public class Regadera extends NombreClase{
	Boolean tieneAgua;
	Regadera () {this.inicializar();}
	Regadera (Boolean tieneAgua){this.inicializar(tieneAgua);}
	private Boolean defaultAgua() {return false;}
	private void inicializar(Boolean tieneAgua) {this.inicializar(tieneAgua);}
	private void inicializar() { this.inicializar(this.defaultAgua());}
	protected Boolean getTieneAgua() {return tieneAgua;}
	protected void setTieneAgua(Boolean tieneAgua) {this.tieneAgua = tieneAgua;}
	public void llenar(Regador regador) {
		this.MensajeLleno(regador);
		this.tieneAgua = true;
	}
	public void Usar(Regador regador) {
		this.MensajeVacio(regador);
		this.tieneAgua = false;
	}
	private void MensajeVacio (Regador regador) {
		Util.Escribir("Regadera ha sido utilizada por "+regador.getNombre()+" y se encuentra vacía.");
	}
	private void MensajeLleno (Regador regador) {
		Util.Escribir("Regadera ha sido llenada por "+regador.getNombre()+".");
	}
	
}
