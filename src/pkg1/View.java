package pkg1;

public class View {
	public static void Nombre(String nombre) {
		String texto = "Nombre de planta: " + nombre;
		Util.Escribir(texto);
	}

	public static void Color(String color) {
		String texto = "Color de planta: " + color;
		Util.Escribir(texto);
	}

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
		Util.Linea();
	}
}
