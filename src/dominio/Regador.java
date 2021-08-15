package dominio;

public class Regador extends Objeto{
	String nombre;
	// constructores
	Regador () {this.inicializar();}
	Regador (String nombre) {this.inicializar(nombre);}
	// métodos de la clase
	private void inicializar() {
		this.inicializarObjeto();
		this.defaultNombre();
	}
	private void inicializar(String nombre) {
		this.inicializarObjeto();
		this.setNombre(nombre);
	}
	private void inicializarObjeto() {
		super.inicializar("Regador", true);
		super.mensajeCreado();
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
	protected String getNombre() {return nombre;}
	protected void setNombre(String nombre) {this.nombre = nombre;}
}
