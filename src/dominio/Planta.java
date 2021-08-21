package dominio;
import abstracts.Objeto;
import helper.Util;

public class Planta extends Objeto {
	private String color;
	private String nombrePlanta;
	private Boolean regado;
	private static final String defaultColor = "Verde";
	private static final String defaultNombre = "Sin nombre";
	private static final Boolean defaultRiego = false;

	// constructores
	public Planta() {
		super("planta");
		this.inicializar(defaultNombre, defaultColor, defaultRiego);
	}

	public Planta(String nombre) {
		super("planta");
		this.inicializar(nombre, defaultColor, defaultRiego);
	}
	
	public Planta(Boolean regado) {
		super("planta");
		this.inicializar(defaultNombre, defaultColor, regado);
	}

	public Planta(String nombre, String color) {
		super("planta");
		this.inicializar(nombre, color, defaultRiego);
	}

	public Planta(String nombre, String color, Boolean regado) {
		super("planta");
		this.inicializar(nombre, color, regado);
	}

	// métodos de la clase
	private void inicializar(String nombre, String color, Boolean regado) {
		this.setNombre(nombre);
		this.setColor(color);
		this.setRegado(regado);
		this.mensajeCreado();
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
		Util.mensaje_femenino(super.getNombreObjeto());
	}
}
