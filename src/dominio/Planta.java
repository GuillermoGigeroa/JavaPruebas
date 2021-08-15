package dominio;

public class Planta extends Objeto{
	String color;
	String nombre;
	Boolean regado;
	// constructores
	Planta() {this.inicializar();}
	Planta(String nombre) {this.inicializar(nombre);}
	Planta(String nombre, String color) {this.inicializar(nombre, color);}
	Planta(String nombre, String color, Boolean regado) {this.inicializar(nombre, color, regado);}
	// métodos de la clase
	private void inicializar() {
		this.inicializarObjeto();
		this.defaultTodo();
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
		super.inicializar("planta", false);
		super.mensajeCreado();
	}
	private void defaultTodo() {
		this.defaultNombre();
		this.defaultColor();
		this.defaultRiego();		
	}
	private void defaultColor() {this.setColor("Verde");}
	private void defaultNombre() {this.setNombre("Sin nombre");}
	private void defaultRiego() {this.setRegado(false);}
	protected void serRegado() {this.regado = true;}
	protected void secarse() {this.regado = false;}
	// getters & setters
	protected String getColor() {return this.color;}
	protected String getNombre() {return this.nombre;}
	protected Boolean getRegado() {return this.regado;}
	protected void setColor(String color) {this.color = color;}
	protected void setNombre(String nombre) {this.nombre = nombre;}
	protected void setRegado(Boolean regado) {this.regado = regado;}
}
