package beans.profe.bbdd.hibernate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.profe.bbdd.hibernate.entities.Usuario;
import beans.profe.bbdd.hibernate.impl.UsuarioCommand;


public class MainApp {

	public static void main(String args[]){
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		UsuarioCommand command=(UsuarioCommand)context.getBean("command");
		Usuario usuario=new Usuario();
		usuario.setUsuario("Juan");
		usuario.setContrasena("root");
		command.guardarUsuario(usuario);
		usuario=new Usuario();
		usuario.setUsuario("Alicia");
		usuario.setContrasena("root");
		command.guardarUsuario(usuario);
		
		usuario=command.getUsuario("Juan");
		System.out.println("Contrase�a de "+usuario.getUsuario()+" -> "+usuario.getContrasena());
		System.out.println("Done.");
	}
}
