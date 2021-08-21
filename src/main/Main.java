package main;
import abstracts.*;
import dominio.*;
import helper.*;

public class Main {
	public static void ejemploPlantas() {
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
	public static void main(String[] args) {
		//ejemploPlantas();
		Objeto ak47 = new Arma("Ak47",false);
		((Arma) ak47).disparar();
		//Crear cargadores, cantidad de balas, disparo, bala
	}
}

