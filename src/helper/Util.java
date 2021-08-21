package helper;

public class Util {
	public static String mensaje_masculino() {
		return "Se ha creado un nuevo ";
	}
	public static String mensaje_femenino() {
		return "Se ha creado una nueva ";
	}
	public static void escribir(String esto) {
		System.out.println(esto);
	}

	public static void lineaVacia() {
		System.out.println();
	}

	public static void raya(int cantidadCaracteres) {
		escribir(guiones(cantidadCaracteres));
	}

	public static void raya() {
		escribir(guiones());
	}

	private static String guiones() {
		return guiones(50);
	}

	private static String guiones(int cantidad) {
		String texto = "";
		for (int x = 0; x < cantidad; x = x + 1) {
			texto += "-";
		}
		return texto;
	}
}
