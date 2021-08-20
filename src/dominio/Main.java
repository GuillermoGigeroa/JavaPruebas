package dominio;

public class Main {
	public static void main(String[] args) {
		Objeto planta1 = new Planta("Bebecita", "Amarillo");
		Objeto planta2 = new Planta("Bebelin");
		Regador regador = new Regador("Guille",false);
		Objeto regadera = new Regadera();

		Util.raya();
		View.MostrarPlanta(planta1);
		View.MostrarPlanta(planta2);

		regador.llenarRegadera(regadera);
		regador.regarPlanta(planta1, regadera);

		regador.llenarRegadera(regadera);
		regador.regarPlanta(planta2, regadera);

		Util.raya();
		View.MostrarPlanta(planta1);
		View.MostrarPlanta(planta2);
	}
}
