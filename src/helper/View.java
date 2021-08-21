package helper;

import dominioPlantas.Objeto;
import dominioPlantas.Planta;

public class View {
	public static void Nombre(String nombre) {
		Util.escribir("Nombre de planta: " + nombre);
	}

	public static void Color(String color) {
		Util.escribir("Color de planta: " + color);
	}

	public static void EstadoDeRiego(Boolean estado) {
		String estadoDeRiego;
		if (estado) {
			estadoDeRiego = "Regado";
		} else {
			estadoDeRiego = "No regado";
		}
		Util.escribir("Estado de planta: " + estadoDeRiego);
	}

	public static void MostrarPlanta(Objeto planta) {
		Planta estaPlanta = (Planta) planta;
		Nombre(estaPlanta.getNombre());
		Color(estaPlanta.getColor());
		EstadoDeRiego(estaPlanta.getRegado());
		Util.raya();
		Util.lineaVacia();
	}
}
