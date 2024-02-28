package beans.herencia.persona.entities;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table (name = "TB_PERSONAE")
public class Personae {
	
	@Id
	@SequenceGenerator(name="PERSONEGEN", sequenceName="PERSONE_GEN", initialValue=1, allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PERSONEGEN")
	@Column(name="ID", nullable = false, updatable = false)
	private long id;
	@Column(length = 20) 
	private String nombre;
	@Column(length = 20)
	private String apellidos;
	
	private String tipoSuscripcion;
	
//	@Autowired
//	ServicioPrensa servicioPrensa;
	//En este caso, como no queremos el servicio de prensa en la tabla, en vez de hacer el @Autowired aquí,
	//lo inyectaremos en cada persona de otra manera. Nos crearemos otra clase que recibirá a cada persona
	//y será ahí donde se le asignará el servicio de prensa a cada persona. Mañana nos lo enseñará el profe.
	
	/**
	 * 
	 */
	public Personae() {
		super();
	}

	/**
	 * @param nombre
	 * @param apellidos
	 * @param tipoSuscripcion
	 */
	public Personae(String nombre, String apellidos, String tipoSuscripcion) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.tipoSuscripcion = tipoSuscripcion;
	}

	/**
	 * @param nombre
	 * @param apellidos
	 */
	public Personae(String nombre, String apellidos) {
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

	@Override
	public String toString() {
		return "Personae [id=" + id + ", " + (nombre != null ? "nombre=" + nombre + ", " : "")
				+ (apellidos != null ? "apellidos=" + apellidos + ", " : "")
				+ (tipoSuscripcion != null ? "tipoSuscripcion=" + tipoSuscripcion : "") + "]";
	}

}
