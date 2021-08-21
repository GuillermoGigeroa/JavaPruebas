package dominio;
import abstracts.Persona;
import helper.Util;

public class Tirador extends Persona {
	// constructores
	public Tirador () {
		super();
		mensajeCreado();
	}
	
	public Tirador (String nombre) {
		super(nombre);
		mensajeCreado();
	}
	
	public Tirador (Boolean sexo) {
		super(sexo);
		mensajeCreado();
	}
	
	public Tirador (String nombre, Boolean sexo) {
		super(nombre, sexo);
		mensajeCreado();
	}

	// métodos de la clase
	@Override
	public void mensajeCreado() {
		if(sexo) {
			Util.mensaje_masculino("tirador");
		}
		else{
			Util.mensaje_femenino("tiradora");
		}
	}

	// getters y setters
	public void setNombre(String nombre) {
		super.setNombre(nombre);
	}
	
	public String getNombre() {
		return super.getNombre();
	}
	
	public void setSexo(Boolean sexo) {
		super.setSexo(sexo);
	}
	

	public Boolean getSexo() {
		return super.getSexo();
	}
	
}
