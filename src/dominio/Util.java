package dominio;

public class Util {
	public static void Escribir(String esto) {System.out.println(esto);}
	public static void Linea() {System.out.println();}
	public static void Raya(int cantidadCaracteres) {Escribir(Guiones(cantidadCaracteres));}
	public static void Raya() {Escribir(Guiones());}
	private static String Guiones() {return Guiones(50);}
	private static String Guiones(int cantidad) {
		String texto = "";
		for (int x = 0; x < cantidad; x = x + 1) {texto += "-";}
		return texto;
	}
}
