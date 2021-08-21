package helper;

public class Util {
	public static void mensaje_masculino(String nombreObjeto) {
		escribir("Se ha creado un nuevo " + nombreObjeto + ".");
	}

	public static void mensaje_femenino(String nombreObjeto) {
		escribir("Se ha creado una nueva " + nombreObjeto + ".");
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
