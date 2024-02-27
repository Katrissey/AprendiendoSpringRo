package beans.herencia.persona.entities;

import org.springframework.beans.factory.annotation.Autowired;

import beans.profe.ejercicios.herenciaprensa.ServicioPrensa;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table (name = "TB_PERSONAENTITY")
public class PersonaEntity {
	
	@Id
	@SequenceGenerator(name="PERSONENTITYGEN", sequenceName="PERSONENTITY_GEN", initialValue=1, allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PERSONENTITYGEN")
	private long id;
	@Column(length = 20) 
	private String nombre;
	@Column(length = 20)
	private String apellidos;
	
//	@Autowired
//	ServicioPrensa servicioPrensa;
	//En este caso, como no queremos el servicio de prensa en la tabla, en vez de hacer el @Autowired aquí,
	//lo inyectaremos en cada persona de otra manera. Nos crearemos otra clase que recibirá a cada persona
	//y será ahí donde se le asignará el servicio de prensa a cada persona. Mañana nos lo enseñará el profe.
	
	/**
	 * 
	 */
	public PersonaEntity() {
		super();
	}



	/**
	 * @param nombre
	 * @param apellidos
	 */
	public PersonaEntity(String nombre, String apellidos) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
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
	 * @return the id
	 */
	public long getId() {
		return id;
	}



	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}



	@Override
	public String toString() {
		return "PersonaEntity [id=" + id + ", " + (nombre != null ? "nombre=" + nombre + ", " : "")
				+ (apellidos != null ? "apellidos=" + apellidos : "") + "]";
	}
	
	

}
