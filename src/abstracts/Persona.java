package abstracts;

public abstract class Persona {
	public abstract void mensajeCreado();
	public String nombre;
	public Boolean sexo; // femenino = false
	public Persona () {
		setNombre("Sin nombre");
		setSexo(true);
	}
	public Persona (String nombre) {
		setNombre(nombre);
		setSexo(true);
	}
	public Persona (Boolean sexo) {
		setNombre("Sin nombre");
		setSexo(sexo);
	}
	public Persona (String nombre, Boolean sexo) {
		setNombre(nombre);
		setSexo(sexo);
	}
	protected String getNombre() {
		return nombre;
	}
	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}
	protected Boolean getSexo() {
		return sexo;
	}
	protected void setSexo(Boolean sexo) {
		this.sexo = sexo;
	}
}
