package dominio;

public class Regador implements Objeto{
	String nombre;
	Boolean sexo; //femenino = false
	// constructores
	Regador () {this.inicializar();}
	Regador (String nombre) {this.inicializar(nombre);}
	Regador (String nombre, Boolean sexo) {this.inicializar(nombre,sexo);}
	// métodos de la clase
	private void inicializar() {
		this.inicializarObjeto();
		this.defaultNombre();
	}
	private void inicializar(String nombre) {
		this.inicializarObjeto();
		this.setNombre(nombre);
	}
	private void inicializar(String nombre, Boolean sexo) {
		this.inicializarObjeto();
		this.setNombre(nombre);
		this.setSexo(sexo);
	}
	private void inicializarObjeto() {
		this.mensajeCreado();
	}
	protected Boolean regarPlanta(Planta planta, Regadera regadera) {
		if (regadera.getTieneAgua()) {
			this.MensajeRiego(planta);
			planta.serRegado();
			regadera.Usar(this);
			return true;
		}
		return false;
	}	
	private void defaultNombre() {this.setNombre("Sin nombre");}
	protected void llenarRegadera(Regadera regadera) {regadera.Llenar(this);}
	private void MensajeRiego(Planta planta) {Util.Escribir("El regador "+this.getNombre()+" ha regado la planta "+planta.getNombre()+".");}
	// getters & setters
	protected Boolean getSexo() {return sexo;}
	protected void setSexo(Boolean sexo) {this.sexo = sexo;}
	protected String getNombre() {return nombre;}
	protected void setNombre(String nombre) {this.nombre = nombre;}
	@Override
	public void mensajeCreado() {
		Util.Escribir(masculino+"regador.");
	}
}
