package dominio;
import abstracts.Objeto;
import abstracts.Persona;
import helper.Util;

public class Regador extends Persona{
	// constructores
	public Regador() {
		super();
		mensajeCreado();
	}
	
	public Regador(Boolean sexo) {
		super(sexo);
		mensajeCreado();
	}

	public Regador(String nombre) {
		super(nombre);
		mensajeCreado();
	}

	public Regador(String nombre, Boolean sexo) {
		super(nombre,sexo);
		mensajeCreado();
	}

	// métodos de la clase

	public Boolean regarPlanta(Objeto O_planta, Objeto O_regadera) {
		Planta planta = (Planta) O_planta;
		Regadera regadera = (Regadera) O_regadera;
		if (regadera.getTieneAgua()) {
			this.MensajeRiego(planta);
			planta.serRegado();
			regadera.Usar(this);
			return true;
		}
		return false;
	}

	public void llenarRegadera(Objeto O_regadera) {
		Regadera regadera = (Regadera) O_regadera;
		regadera.Llenar(this);
	}

	private void MensajeRiego(Planta planta) {
		Util.escribir(getNombre() + " ha regado la planta " + planta.getNombre() + ".");
	}
	
	// getters & setters
	
	public String getNombre() {
		return super.getNombre();
	}
	
	public void setNombre(String nombre) {
		super.setNombre(nombre);
	}
	
	public Boolean getSexo() {
		return super.getSexo();
	}
	
	public void setSexo(Boolean sexo) {
		super.setSexo(sexo);
	}

	@Override
	public void mensajeCreado() {
		if(sexo) {
			Util.mensaje_masculino("regador");
		}
		else{
			Util.mensaje_femenino("regadora");
		}
	}
	
	
}
