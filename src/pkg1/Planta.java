package pkg1;

public class Planta {
	private String color;
	private String nombre;
	private Boolean regado;

	Planta() {
		this.defaultNombre();
		this.defaultColor();
		this.defaultRiego();
	}

	Planta(String nombre) {
		this.nombre = nombre;
		this.defaultColor();
		this.defaultRiego();
	}

	Planta(String nombre, String color) {
		this.nombre = nombre;
		this.color = color;
		this.defaultRiego();
	}

	Planta(String nombre, String color, Boolean regado) {
		this.nombre = nombre;
		this.color = color;
		this.regado = regado;
	}

	private void defaultColor() {
		this.color = "Verde";
	}

	private void defaultNombre() {
		this.nombre = "Sin nombre";
	}

	private void defaultRiego() {
		this.regado = false;
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
}
