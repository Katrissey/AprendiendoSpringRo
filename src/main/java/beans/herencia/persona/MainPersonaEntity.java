package beans.herencia.persona;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.herencia.persona.entities.PersonaEntity;
import beans.herencia.persona.impl.PersonaCommand;

public class MainPersonaEntity {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("ServicioPrensaHibernate.xml");
		PersonaCommand command=(PersonaCommand)context.getBean("command");
		PersonaEntity persona=new PersonaEntity();
		persona.setNombre("Juan");
		persona.setApellidos("Fernández");
		command.guardarPersonaEntity(persona);
		persona=new PersonaEntity();
		persona.setNombre("Alicia");
		persona.setApellidos("Rodríguez");
		command.guardarPersonaEntity(persona);
		
		persona=command.getPersonaEntity("Juan");
		System.out.println("Apellidos de "+ persona.getNombre() +" -> "+persona.getApellidos());
		System.out.println("Done.");
	

	}

}
