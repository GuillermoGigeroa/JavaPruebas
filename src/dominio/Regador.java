package dominio;

public class Regador extends Persona{
	// constructores
	Regador() {
		this.inicializar();
	}

	Regador(String nombre) {
		this.inicializar(nombre);
	}

	Regador(String nombre, Boolean sexo) {
		this.inicializar(nombre, sexo);
	}

	// métodos de la clase
	private void inicializar() {
		this.setNombre("Sin nombre");
		this.setSexo(true);
		this.inicializarObjeto();
	}

	private void inicializar(String nombre) {
		this.setNombre(nombre);
		this.setSexo(true);
		this.inicializarObjeto();
	}

	private void inicializar(String nombre, Boolean sexo) {
		this.setNombre(nombre);
		this.setSexo(sexo);
		this.inicializarObjeto();
	}

	private void inicializarObjeto() {
		this.mensajeCreado();
	}

	protected Boolean regarPlanta(Objeto O_planta, Objeto O_regadera) {
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

	protected void llenarRegadera(Objeto O_regadera) {
		Regadera regadera = (Regadera) O_regadera;
		regadera.Llenar(this);
	}

	private void MensajeRiego(Planta planta) {
		Util.escribir("El regador " + this.getNombre() + " ha regado la planta " + planta.getNombre() + ".");
	}

	// getters & setters
	protected Boolean getSexo() {
		return sexo;
	}

	protected void setSexo(Boolean sexo) {
		this.sexo = sexo;
	}

	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
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
