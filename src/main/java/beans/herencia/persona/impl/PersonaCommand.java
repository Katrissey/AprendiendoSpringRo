package beans.herencia.persona.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;

import beans.herencia.persona.dao.PersonaeDAO;
import beans.herencia.persona.entities.Personae;
import beans.profe.ejercicios.herenciaprensa.ServicioPrensa;

//También se puede hacer con anotaciones en vez de creando un bean en el xml:
//@Component(value="personacomand") y además debemos meter, si usamos esto, el <context: component-scan base.package="ruta de paquete en el que se encuentra esta clase"</component...>, específico para que SPRING reconozca esta anotación como si fuera un bean y cree objeto de esta clase
public class PersonaCommand implements PersonaeDAO {

	//private SessionFactory sessionFactory;
	
	@Autowired
	private HibernateTemplate template; //Para inyectarlo ha de haberse creado con un bean en el xml, es decir, que lo haya creado SPRING
	//Es lo mismo que el EntityManager pero a través de SPRING, de hecho, se conecta internamente al EntityManager
	
	@Autowired
	private ServicioPrensa servicioPrensa; //Ya está creado el objeto y lo podemos usar en el main, pero lo podemos hacer aquí porque esta clase, sea con anotaciones o a través de xml, es un bean y, entonces, SÍ ESTÁ GESTIONADA POR SPRING, por eso en el main no nos lo inyectaría, ya que el main NO es un bean y, por tanto, SPRING no nos lo puede  reconocer
	
	public PersonaCommand(){ //Estos frameworks prácticamente nos exigen que haya constructor vacío
		
	}

//	public SessionFactory getSessionFactory() {
//		return sessionFactory;
//	}
//
//	public void setSessionFactory(SessionFactory sessionFactory) {
//		this.sessionFactory = sessionFactory;
//		template=new HibernateTemplate(sessionFactory);
//	}  Lo comentamos y lo hacemos con @Autowired y desde el xml, donde creamos un bean de "HibernateTemplate", porque usar "new" no es una buena práctica
//Si no está en el contexto de SPRING, para SPRING no existe y no podemos hacer nada con ello.

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

	public void guardarPersonae(Personae persona) { //Le pasamos el objeto y lo guardamos
		template.save(persona); //Método save es del HibernateTemplate
	}


	public Personae getPersonae(String nombre) {
		String query = "from Personae where nombre = ?"; //recordar que hemos de poner el nombre de la clase, NO el de la tabla, por eso "Personae" y el nombre del atributo por el que queremos buscar
		return (Personae) template.find(query, nombre).get(0); //este get(0) hace que sólo nos devuelva un valor en caso de que hubiera varias personas con el mismo nombre
	}

}
