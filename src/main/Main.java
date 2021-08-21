package main;
import dominioPlantas.*;
import helper.Util;
import helper.View;

public class Main {
	public static void main(String[] args) {
		Objeto planta1 = new Planta("Bebecita", "Amarillo");
		Objeto planta2 = new Planta("Bebelin");
		Regador regador1 = new Regador("Guillermina",false);
		Regador regador2 = new Regador("Guillermo",true);
		Objeto regadera = new Regadera();

		Util.raya();
		View.MostrarPlanta(planta1);
		View.MostrarPlanta(planta2);

		regador1.llenarRegadera(regadera);
		regador1.regarPlanta(planta1, regadera);

		regador2.llenarRegadera(regadera);
		regador2.regarPlanta(planta2, regadera);

		Util.raya();
		View.MostrarPlanta(planta1);
		View.MostrarPlanta(planta2);
	}
}

