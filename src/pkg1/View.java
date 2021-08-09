package pkg1;

public class View {
	public static void Color(String color) {
		String texto = "Color de planta: "+color;
		Util.Escribir(texto);
	}
	
	public static void Nombre(String nombre) {
		String texto = "Nombre de planta: "+nombre;
		Util.Escribir(texto);
	}
	
	public static void MostrarPlanta(Planta estaPlanta) {
		Nombre(estaPlanta.getNombre());
		Color(estaPlanta.getColor());
		Util.Linea();
	}
}
