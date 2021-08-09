package pkg1;

public class Main {

	public static void main(String[] args) {
		Planta planta1 = new Planta("Bebecita", "Amarillo");
		Planta planta2 = new Planta("Planta2");
		Planta planta3 = new Planta();

		View.MostrarPlanta(planta1);
		View.MostrarPlanta(planta2);
		View.MostrarPlanta(planta3);
	}

}
