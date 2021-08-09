package dominio;

public class Planta {
	String color;
	String nombre;
	Boolean regado;

	Planta() {
		this.MensajeCreado();
		this.defaultNombre();
		this.defaultColor();
		this.defaultRiego();
	}

	Planta(String nombre) {
		this.MensajeCreado();
		this.nombre = nombre;
		this.defaultColor();
		this.defaultRiego();
	}

	Planta(String nombre, String color) {
		this.MensajeCreado();
		this.nombre = nombre;
		this.color = color;
		this.defaultRiego();
	}

	Planta(String nombre, String color, Boolean regado) {
		this.MensajeCreado();
		this.nombre = nombre;
		this.color = color;
		this.regado = regado;
	}
	
	private void MensajeCreado() {
		Util.Escribir("Una nueva planta ha sido creada.");
	}

	private void defaultColor() {
		this.setColor("Verde");
	}

	private void defaultNombre() {
		this.setNombre("Sin nombre");
	}

	private void defaultRiego() {
		this.setRegado(false);
	}

	protected void serRegado() {
		this.regado = true;
	}

	protected void seco() {
		this.regado = false;
	}

	protected String getColor() {
		return this.color;
	}

	protected String getNombre() {
		return this.nombre;
	}

	protected Boolean getRegado() {
		return this.regado;
	}
	
	protected void setColor(String color) {
		this.color = color;
	}
	
	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	protected void setRegado(Boolean regado) {
		this.regado = regado;
	}
}
