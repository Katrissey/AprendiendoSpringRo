package beans.herencia.persona.dao;

import beans.herencia.persona.entities.PersonaEntity;
import beans.profe.bbdd.hibernate.entities.Usuario;

public interface PersonaEntityDAO {

	public void guardarPersonaEntity(PersonaEntity persona);
	
	public PersonaEntity getPersonaEntity(String nombre);
}
