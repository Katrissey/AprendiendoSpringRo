package beans.herencia.persona;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import beans.log4jnuestro.LogGetafe;


public class Persona {
	
	@Autowired
	private LogGetafe logGetafe;
	
	@Autowired //Para que se inyecte directamente este objeto desde el bean del .xml
	private ServicioPrensa servicioPrensa;
	
	private String nombre;
	private String apellidos;
	private String dni;
	private String genero;
	
	private String tipoSuscripcion; //Free, basic, premium
	
	public void solicitarLectura () {
	List<String> periodicos = servicioPrensa.mostrarPrensa(tipoSuscripcion);
	logGetafe.info("Estos son los periódicos que puedes leer");
	for (String periodico : periodicos) {
		logGetafe.info(periodico);
		
	}
	}

	public void leer (String titulo) {
	servicioPrensa.leerPeriodico(titulo);
	}
	
	
	/**
	 * @param nombre
	 * @param apellidos
	 * @param dni
	 */
	public Persona(String nombre, String apellidos, String dni) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
	}



	/**
	 * @param servicioPrensa
	 * @param nombre
	 * @param apellidos
	 * @param dni
	 * @param genero
	 * @param tipoSuscripcion
	 */
	public Persona(ServicioPrensa servicioPrensa, String nombre, String apellidos, String dni, String genero,
			String tipoSuscripcion) {
		super();
		this.servicioPrensa = servicioPrensa;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.genero = genero;
		this.tipoSuscripcion = tipoSuscripcion;
	}



	/**
	 * @param logGetafe
	 * @param servicioPrensa
	 * @param nombre
	 * @param apellidos
	 * @param dni
	 * @param genero
	 * @param tipoSuscripcion
	 */
	public Persona(LogGetafe logGetafe, ServicioPrensa servicioPrensa, String nombre, String apellidos, String dni,
			String genero, String tipoSuscripcion) {
		super();
		this.logGetafe = logGetafe;
		this.servicioPrensa = servicioPrensa;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.genero = genero;
		this.tipoSuscripcion = tipoSuscripcion;
	}



	/**
	 * 
	 */
	public Persona() {
		super();
	}
	/**
	 * @param nombre
	 * @param apellidos
	 * @param dni
	 * @param genero
	 */
	public Persona(String nombre, String apellidos, String dni, String genero) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.genero = genero;
	}
	
	
	/**
	 * @return the logGetafe
	 */
	public LogGetafe getLogGetafe() {
		return logGetafe;
	}


	/**
	 * @param logGetafe the logGetafe to set
	 */
	public void setLogGetafe(LogGetafe logGetafe) {
		this.logGetafe = logGetafe;
	}



	/**
	 * @return the servicioPrensa
	 */
	public ServicioPrensa getServicioPrensa() {
		return servicioPrensa;
	}



	/**
	 * @param servicioPrensa the servicioPrensa to set
	 */
	public void setServicioPrensa(ServicioPrensa servicioPrensa) {
		this.servicioPrensa = servicioPrensa;
	}



	/**
	 * @return the tipoSuscripcion
	 */
	public String getTipoSuscripcion() {
		return tipoSuscripcion;
	}



	/**
	 * @param tipoSuscripcion the tipoSuscripcion to set
	 */
	public void setTipoSuscripcion(String tipoSuscripcion) {
		this.tipoSuscripcion = tipoSuscripcion;
	}



	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}
	/**
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}
	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}
	/**
	 * @return the genero
	 */
	public String getGenero() {
		return genero;
	}
	/**
	 * @param genero the genero to set
	 */
	public void setGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "Persona [" + (logGetafe != null ? "logGetafe=" + logGetafe + ", " : "")
				+ (nombre != null ? "nombre=" + nombre + ", " : "")
				+ (apellidos != null ? "apellidos=" + apellidos + ", " : "") + (dni != null ? "dni=" + dni + ", " : "")
				+ (genero != null ? "genero=" + genero + ", " : "")
				+ (tipoSuscripcion != null ? "tipoSuscripcion=" + tipoSuscripcion : "") + "]";
	}
	
	
	

}
