package mains.herencia.persona;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.herencia.persona.Persona;

public class MainPersonaHerenciaSpring {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("PersonaHerenciaSpring.xml");
		//Se indica el nombre del archivo .xml del que queremos el contexto para que cree los objetos y ejecute acciones
		//especificadas en el mismo
		Persona laura=(Persona)context.getBean("Laura");
		Persona antonio=(Persona)context.getBean("Antonio");
		
		System.out.println (laura + "\n" +  antonio);
		
		laura.solicitarLectura ();
		antonio.solicitarLectura();
		
	}

}
