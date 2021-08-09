package dominio;

public class Util {
	public static void Escribir(String esto) {
		System.out.println(esto);
	}

	public static void Linea() {
		System.out.println();
	}
	
	public static void Raya() {
		String raya = "";
		int cantidad = 50;
		for (int x = 0; x < cantidad; x = x+1) {
			raya += "-";
		}
		System.out.println(raya);
	}
	
	public static void Raya(int cantidad) {
		String raya = "";
		for (int x = 0; x < cantidad; x = x+1) {
			raya += "-";
		}
		System.out.println(raya);
	}
}
