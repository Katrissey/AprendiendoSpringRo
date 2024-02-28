package beans.herencia.persona;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.herencia.persona.entities.Personae;
import beans.herencia.persona.impl.PersonaCommand;

public class MainPersonaEntity {

	public static void main(String[] args) {
		
		//System.out.println("pasa"); Es sólo una traza para comprobar si pasa
		ApplicationContext context=new ClassPathXmlApplicationContext("ServicioPrensaHibernate.xml");
		PersonaCommand command=(PersonaCommand)context.getBean("command"); //Necesario crear este objeto así, a través de SPRING con el xml,
		//para que SPRING sepa que existe, lo reconozca y se pueda operar con él. En caso de usar @Component, meteríamos en el paréntesis donde ahora pone "command", el nombre que le hubiéramos dado al valor del @Component
		Personae persona1=new Personae("Juan", "Fernández", "basic");
		Personae persona2=new Personae("Alicia", "Rodríguez", "premium");
		
		command.guardarPersonae(persona1);
		command.guardarPersonae(persona2);

		Personae p1 =command.getPersonae("Juan");
		System.out.println (p1);
		Personae p2 = command.getPersonae("Alicia");
		System.out.println (p2);
		
		List<String> periodicosP1 = command.getServicioPrensa().mostrarPrensa(p1.getTipoSuscripcion());
		List<String> periodicosP2 =command.getServicioPrensa().mostrarPrensa(p2.getTipoSuscripcion());
		
		}
	
}
