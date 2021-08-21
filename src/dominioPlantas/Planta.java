package dominioPlantas;
import helper.Util;

public class Planta extends Objeto {
	private String color;
	private String nombrePlanta;
	private Boolean regado;

	// constructores
	public Planta() {
		this.inicializar(defaultNombre(), defaultColor(), defaultRiego());
	}

	public Planta(String nombre) {
		this.inicializar(nombre, defaultColor(), defaultRiego());
	}

	public Planta(String nombre, String color) {
		this.inicializar(nombre, color, defaultRiego());
	}

	public Planta(String nombre, String color, Boolean regado) {
		this.inicializar(nombre, color, regado);
	}

	// métodos de la clase
	private void inicializar(String nombre, String color, Boolean regado) {
		this.setNombre(nombre);
		this.setColor(color);
		this.setRegado(regado);
		this.mensajeCreado();
	}

	private String defaultColor() {
		return "Verde";
	}

	private String defaultNombre() {
		return "Sin nombre";
	}

	private Boolean defaultRiego() {
		return false;
	}

	public void serRegado() {
		regado = true;
	}

	public void secarse() {
		regado = false;
	}

	// getters & setters
	public String getColor() {
		return color;
	}

	public String getNombre() {
		return nombrePlanta;
	}

	public Boolean getRegado() {
		return regado;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setNombre(String nombre) {
		this.nombrePlanta = nombre;
	}

	public void setRegado(Boolean regado) {
		this.regado = regado;
	}
	
	@Override
	public void mensajeCreado() {
		Util.escribir(Util.mensaje_femenino() + "planta.");
	}
}
