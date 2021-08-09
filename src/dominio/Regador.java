package dominio;

public class Regador {
	String nombre;
	
	Regador () {
		this.MensajeCreado();
		this.setNombre("Sin nombre");
	}
	
	Regador (String nombre) {
		this.MensajeCreado();
		this.setNombre(nombre);
	}
	
	private void MensajeCreado () {
		Util.Escribir("Un nuevo regador ha sido creado.");
	}

	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	protected void llenarRegadera(Regadera regadera) {
		regadera.llenar(this);
	}
	
	protected Boolean regarPlanta(Planta planta, Regadera regadera) {
		if (regadera.getTieneAgua()) {
			this.MensajeRiego(planta);
			planta.serRegado();
			regadera.usar(this);
			return true;
		}
		return false;
	}
	
	private void MensajeRiego(Planta planta) {
		String mensaje = "El regador "+this.getNombre()+" ha regado la planta "+planta.getNombre()+".";
		Util.Escribir(mensaje);
	}
}
