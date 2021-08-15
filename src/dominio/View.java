package dominio;

public class View {
	public static void Nombre(String nombre) {Util.Escribir("Nombre de planta: " + nombre);}
	public static void Color(String color) {Util.Escribir("Color de planta: " + color);}
	public static void EstadoDeRiego(Boolean estado) {
		String estadoDeRiego;
		if (estado) {
			estadoDeRiego = "Regado";
		}
		else {
			estadoDeRiego = "No regado";
		}
		Util.Escribir("Estado de planta: " + estadoDeRiego);
	}
	public static void MostrarPlanta(Planta estaPlanta) {
		Nombre(estaPlanta.getNombre());
		Color(estaPlanta.getColor());
		EstadoDeRiego(estaPlanta.getRegado());
		Util.Raya();
		Util.Linea();
	}
}
