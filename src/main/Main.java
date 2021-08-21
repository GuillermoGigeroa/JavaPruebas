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
	public static void ejemploArmas() {
		Arma ak47 = new Arma();
		Tirador tirador = new Tirador("Guille",true);
		Cargador cargador = new Cargador();
		cargador.agregarBalas(10);
		tirador.cargarArma(ak47, cargador);
		tirador.dispararArma(ak47,12);
		// Pasar Arma a abstract y agregar distintas armas y daño
		// Crear cargadores especificos para cada arma
	}
	public static void main(String[] args) {
		//ejemploPlantas();
		ejemploArmas();
	}
}

