package beans.profe.inyeccioncolecciones;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InyeccionColeeciones {

	public static void main(String args[]){
		ApplicationContext context=new ClassPathXmlApplicationContext("BeansColecciones.xml");
		
		JavaCollection jc=(JavaCollection)context.getBean("javaCollection");
		//jc.getAddressList();
		List<String> addressList = (List<String>)jc.getAddressList();
		for (String address : addressList) {
			System.out.println(address);
		}
		
//		for (Object address : addressList) {
//			if (address instanceof Integer){
//				System.out.println((Integer)address);
//			}else if (address instanceof String){
//				System.out.println((String)address);
//			}
//		}
		jc.getAddressSet();
		jc.getAddressMap();
		jc.getAddressProp();
	}
}
