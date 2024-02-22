package mains.herencia.persona;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.herencia.persona.Persona;

public class MainPersonaHerenciaSpring {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("PersonaHerenciaSpring.xml");
		
		Persona laura=(Persona)context.getBean("Laura");
		Persona antonio=(Persona)context.getBean("Antonio");
		
		System.out.println (laura + "\n" +  antonio);
		
	}

}
