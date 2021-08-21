package dominio;
import abstracts.Objeto;
import abstracts.Persona;
import helper.Util;

public class Regador extends Persona{
	// constructores
	public Regador() {
		this.inicializar(this.nombreDefault());
	}

	public Regador(String nombre) {
		this.inicializar(nombre);
	}

	public Regador(String nombre, Boolean sexo) {
		this.inicializar(nombre, sexo);
	}

	// métodos de la clase
	private String nombreDefault() {
		return "Sin nombre";
	}

	private void inicializar(String nombre) {
		this.setNombre(nombre);
		this.setSexo(true);
		this.mensajeCreado();
	}

	private void inicializar(String nombre, Boolean sexo) {
		this.setNombre(nombre);
		this.setSexo(sexo);
		this.mensajeCreado();
	}

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
	public Boolean getSexo() {
		return sexo;
	}

	public void setSexo(Boolean sexo) {
		this.sexo = sexo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public void mensajeCreado() {
		if(sexo) {
			Util.escribir(Util.mensaje_masculino() + "regador.");
		}
		else{
			Util.escribir(Util.mensaje_femenino() + "regadora.");
		}
	}
	
	
}
