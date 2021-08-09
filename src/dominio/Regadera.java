package dominio;

public class Regadera {
	Boolean tieneAgua;
	
	Regadera () {
		this.MensajeCreado();
		this.setTieneAgua(false);
	}
	
	Regadera (Boolean tieneAgua){
		this.MensajeCreado();
		this.setTieneAgua(tieneAgua);
	}
	
	private void MensajeCreado () {
		Util.Escribir("Una nueva regadera ha sido creada.");
	}
	
	protected Boolean getTieneAgua() {
		return tieneAgua;
	}

	protected void setTieneAgua(Boolean tieneAgua) {
		this.tieneAgua = tieneAgua;
	}
	
	public void llenar(Regador regador) {
		this.MensajeLleno(regador);
		this.tieneAgua = true;
	}
	
	public void usar(Regador regador) {
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
