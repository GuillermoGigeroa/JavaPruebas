package dominio;

public class Regadera implements Objeto{
	Boolean tieneAgua;
	Regadera () {this.inicializar();}
	Regadera (Boolean tieneAgua){this.inicializar(tieneAgua);}
	private Boolean defaultAgua() {return false;}
	private void inicializar() { this.inicializar(this.defaultAgua());}
	private void inicializar(Boolean tieneAgua) {
		this.inicializarObjeto();
		this.setTieneAgua(tieneAgua);
	}
	private void inicializarObjeto() {
		
	}
	protected Boolean getTieneAgua() {return tieneAgua;}
	protected void setTieneAgua(Boolean tieneAgua) {this.tieneAgua = tieneAgua;}
	public void Llenar(Regador regador) {
		this.tieneAgua = true;
		this.Mensaje(regador);
	}
	public void Usar(Regador regador) {
		this.tieneAgua = false;
		this.Mensaje(regador);
	}
	private void Mensaje(Regador regador) {
		if(this.tieneAgua) {Util.Escribir("Regadera ha sido llenada por "+regador.getNombre()+".");}
		else {Util.Escribir("Regadera ha sido utilizada por "+regador.getNombre()+" y se encuentra vac�a.");}
	}
	@Override
	public void mensajeCreado() {
		Util.Escribir(femenino+"regadera.");
	}
}
