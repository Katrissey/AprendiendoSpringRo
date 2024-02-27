package beans.herencia.persona.impl;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;

import beans.herencia.persona.dao.PersonaEntityDAO;
import beans.herencia.persona.entities.PersonaEntity;

public class PersonaCommand implements PersonaEntityDAO {

	private SessionFactory sessionFactory;
	private HibernateTemplate template;
	
	public PersonaCommand(){
		
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
		template=new HibernateTemplate(sessionFactory);
	}


	public void guardarPersonaEntity(PersonaEntity persona) {
		template.save(persona);
	}


	public PersonaEntity getPersonaEntity(String nombre) {
		String query = "from PersonaEntity where personaentity = ?";
		return (PersonaEntity) template.find(query, nombre).get(0);
	}

}
