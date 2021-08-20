package dominio;

public class Planta implements Objeto{
	String color;
	String nombrePlanta;
	Boolean regado;
	// constructores
	Planta() {this.inicializar();}
	Planta(String nombre) {this.inicializar(nombre);}
	Planta(String nombre, String color) {this.inicializar(nombre, color);}
	Planta(String nombre, String color, Boolean regado) {this.inicializar(nombre, color, regado);}
	// métodos de la clase
	private void inicializar() {
		this.inicializarObjeto();
		this.defaultNombre();
		this.defaultColor();
		this.defaultRiego();		
	}
	private void inicializar(String nombre) {
		this.inicializarObjeto();
		this.setNombre(nombre);
		this.defaultRiego();
		this.defaultColor();
	}
	private void inicializar(String nombre, String color) {
		this.inicializarObjeto();
		this.setNombre(nombre);
		this.setColor(color);
		this.defaultRiego();
	}
	private void inicializar(String nombre, String color, Boolean regado) {
		this.inicializarObjeto();
		this.setNombre(nombre);
		this.setColor(color);
		this.setRegado(regado);
	}
	private void inicializarObjeto() {
		this.mensajeCreado();
	}
	private void defaultColor() {this.setColor("Verde");}
	private void defaultNombre() {this.setNombre("Sin nombre");}
	private void defaultRiego() {this.setRegado(false);}
	protected void serRegado() {regado = true;}
	protected void secarse() {regado = false;}
	// getters & setters
	protected String getColor() {return color;}
	protected String getNombre() {return nombrePlanta;}
	protected Boolean getRegado() {return regado;}
	protected void setColor(String color) {this.color = color;}
	protected void setNombre(String nombre) {this.nombrePlanta = nombre;}
	protected void setRegado(Boolean regado) {this.regado = regado;}
	@Override
	public void mensajeCreado() {
		Util.Escribir(femenino+"planta.");
	}
}
