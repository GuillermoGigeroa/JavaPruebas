package pkg1;

public class Main {

	public static void main(String[] args) {
		Planta planta1 = new Planta("Bebecita", "Amarillo");
		Planta planta2 = new Planta("Planta2");
		Planta planta3 = new Planta();
		// Incluir regador que reciba la planta y la pueda regar. Y esto modifique el
		// estado de la planta
		// prueba de push con python
		View.MostrarPlanta(planta1);
		View.MostrarPlanta(planta2);
		View.MostrarPlanta(planta3);
	}

}
