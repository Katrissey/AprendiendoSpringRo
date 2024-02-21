package mains.rehacermaniquiconspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.rehacermaniqui.Boton;
import beans.rehacermaniqui.Camisa;
import beans.rehacermaniqui.Pantalon;

public class PantalonMain {

	public static void main(String[] args) {
		System.out.println ("Empiezo");
		ApplicationContext context = new ClassPathXmlApplicationContext ("RehacerManiqui.xml");
		
		System.out.println ("Accedo al objeto pantalón con un botón");
		Pantalon pantalon = (Pantalon)context.getBean("pantalon1");
		System.out.println (pantalon);
		System.out.println (pantalon.getBoton());
		
		Camisa camisa = (Camisa)context.getBean("camisa1");
		System.out.println (camisa.getId() + camisa.getColor() + camisa.getTalla() + camisa.getPrecio());
		for (Boton boton : camisa.getBotones()) {
			System.out.println (boton);
		}


	}

}
