package beans.herencia.persona.dao;

import beans.herencia.persona.entities.Personae;

public interface PersonaeDAO {

	public void guardarPersonae(Personae persona);
	
	public Personae getPersonae(String nombre);
}
