package dominio;

public class Planta extends NombreClase{
	String color;
	String nombre;
	Boolean regado;
	// constructores
	Planta() {this.Inicializar();}
	Planta(String nombre) {this.Inicializar(nombre);}
	Planta(String nombre, String color) {this.Inicializar(nombre, color);}
	Planta(String nombre, String color, Boolean regado) {this.Inicializar(nombre, color, regado);}
	// métodos de la clase
	private void Inicializar() {
		super.inicializar("Planta", false);
		super.MensajeCreado();
		this.defaultTodo();
	}
	private void Inicializar(String nombre) {
		super.inicializar("Planta", false);
		super.MensajeCreado();
		this.setNombre(nombre);
		this.defaultRiego();
		this.defaultColor();
	}
	private void Inicializar(String nombre, String color) {
		super.inicializar("Planta", false);
		this.setNombre(nombre);
		this.setColor(color);
		this.defaultRiego();
		super.MensajeCreado();
	}
	private void Inicializar(String nombre, String color, Boolean regado) {
		super.inicializar("Planta", false);
		this.setNombre(nombre);
		this.setColor(color);
		this.setRegado(regado);
		super.MensajeCreado();
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
