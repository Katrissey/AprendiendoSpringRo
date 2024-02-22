package mains.log4jnuestro;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.log4jnuestro.CalculadoraLog;

public class Log4jNuestroMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Log4jNuestro.xml");

		CalculadoraLog cl = (CalculadoraLog)context.getBean("cl");
		cl.sumar();
		
	}

}
