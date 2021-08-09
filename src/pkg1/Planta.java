package pkg1;

public class Planta {
	private String color;
	private String nombre;
	Planta () {
		defaultColor();
		defaultNombre();
	}
	Planta (String nombre) {
		this.nombre = nombre;
		defaultColor();
	}
	Planta (String nombre, String color) {
		this.nombre = nombre;
		this.color = color;
	}
	private void defaultColor() {
		this.color = "Verde";
	}
	private void defaultNombre() {
		this.nombre = "Sin nombre";
	}
	protected void setColor(String color) {
		this.color = color;
	}
	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}
	protected String getColor() {
		return this.color;
	}
	protected String getNombre() {
		return this.nombre;
	}
}
