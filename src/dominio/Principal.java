package dominio;

public class Principal {

	public static void main(String[] args) {
		Planta planta1 = new Planta("Bebecita", "Amarillo");
		Planta planta2 = new Planta("Bebelin");
		Regador regador = new Regador("Guille");
		Regadera regadera = new Regadera();
		
		Util.Raya();
		View.MostrarPlanta(planta1);
		View.MostrarPlanta(planta2);
		
		regador.llenarRegadera(regadera);
		regador.regarPlanta(planta1, regadera);
		
		regador.llenarRegadera(regadera);
		regador.regarPlanta(planta2, regadera);
		
		Util.Raya();
		View.MostrarPlanta(planta1);
		View.MostrarPlanta(planta2);
	}

}
