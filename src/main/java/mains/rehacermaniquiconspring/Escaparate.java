package mains.rehacermaniquiconspring;

import beans.rehacermaniqui.Boton;
import beans.rehacermaniqui.Camisa;
import beans.rehacermaniqui.Pantalon;

public class Escaparate {
//
//	public static void main(String[] args) {
//		// DECLARAMOS E INICIALIZAMOS LAS VARIABLES DE INSTANCIA

//		// Botones
//		Boton boton1 = new Boton(1234, "redondo", "dorado", "grande");
//		Boton boton2 = new Boton(2345, "cuadrado", "azul", "pequeño");
//		Boton boton3 = new Boton(3456, "triangular", "rosa", "mediano");
//		Boton boton4 = new Boton(4567, "esférico", "amarillo", "minúsculo");
//		Boton boton5 = new Boton(5678, "rectangular", "verde", "gigante");
//
//		Boton[] botones1 = { boton3, boton1, boton5 };
//		Boton[] botones2 = { boton4, boton2, boton3 };
//		Boton[] botones3 = { boton5, boton4, boton2 };

//		// Pantalones
//		Pantalon pantalon1 = new Pantalon(1234, "naranja", "L", 25.50, boton5);
//		Pantalon pantalon2 = new Pantalon(2345, "blanco", "XL", 22.95, boton1);
//		Pantalon pantalon3 = new Pantalon(3456, "negro", "M", 24.99, boton3);
////		Pantalon pantalon4 = new Pantalon(4567, "vaquero", "XXL", 47.75, boton2);

//		// Camisas
//		Camisa camisa1 = new Camisa(1234, "morado", "XL", 15.45, botones1);
//		Camisa camisa2 = new Camisa(2345, "blanco", "L", 12.20, botones2);
//		Camisa camisa3 = new Camisa(3456, "estampada", "M", 19.90, botones3);

//		// Vestidos
//		Vestido vestido1 = new Vestido(1234, "azul eléctrico", "M", 37.85);
//		Vestido vestido2 = new Vestido(2345, "rojo", "XL", 45.30);
//		Vestido vestido3 = new Vestido(3456, "plateado", "L", 61.70);

//		// Maniquíes
//		Maniqui maniqui1 = new Maniqui(1234, vestido3, null, null);
//		Maniqui maniqui2 = new Maniqui(2345, null, pantalon2, camisa1);
//		Maniqui maniqui3 = new Maniqui(3456, vestido2, null, null);
//		Maniqui maniqui4 = new Maniqui(4567, null, pantalon4, camisa2);
//		Maniqui maniqui5 = new Maniqui(5678, vestido3, null, null);
//		Maniqui maniqui6 = new Maniqui(6789, null, pantalon1, camisa3);

//		Escaparate escaparate = new Escaparate();
//		escaparate.mostrarEscaparate(maniqui1, maniqui2, maniqui3, maniqui4, maniqui5, maniqui6);
//
//		 escaparate.mostrarPrecioDeLaRopa(maniqui1, maniqui2, maniqui3, maniqui4,
//		 maniqui5, maniqui6);
//
//	}

//	// Generamos los métodos:
//	public void mostrarEscaparate(Maniqui... maniquies) {
//		for (Maniqui maniqui : maniquies) {
//			if (maniqui.getCamisa() != null) {
//				System.out.println("El color, la forma y el tamaño del primer botón de la camisa son\n"
//						+ maniqui.getCamisa().getBoton()[0].getColor() + "\n"
//						+ maniqui.getCamisa().getBoton()[0].getForma() + "\n"
//						+ maniqui.getCamisa().getBoton()[0].getTamanio());
//				System.out.println("El color, la forma y el tamaño del segundo botón de la camisa son\n"
//						+ maniqui.getCamisa().getBoton()[1].getColor() + "\n"
//						+ maniqui.getCamisa().getBoton()[1].getForma() + "\n"
//						+ maniqui.getCamisa().getBoton()[1].getTamanio());
//				System.out.println("El color, la forma y el tamaño del tercer botón de la camisa son\n"
//						+ maniqui.getCamisa().getBoton()[2].getColor() + "\n"
//						+ maniqui.getCamisa().getBoton()[2].getForma() + "\n"
//						+ maniqui.getCamisa().getBoton()[2].getTamanio());
//				System.out.println("El color y la talla de la camisa son\n" + maniqui.getCamisa().getColor() + "\n"
//						+ maniqui.getCamisa().getTalla());
//
//			}
//
//			if (maniqui.getPantalon() != null) {
//				System.out.println("El color, la forma y el tamaño del botón del pantalón son\n"
//						+ maniqui.getPantalon().getBoton().getColor() + "\n"
//						+ maniqui.getPantalon().getBoton().getForma() + "\n"
//						+ maniqui.getPantalon().getBoton().getTamanio());
//				System.out.println("El color y la talla del pantalón son\n" + maniqui.getPantalon().getColor() + "\n"
//						+ maniqui.getPantalon().getTalla());
//
//			}
//
//			if (maniqui.getVestido() != null) {
//				System.out.println("El color y la talla del vestido son\n" + maniqui.getVestido().getColor() + "\n"
//						+ maniqui.getVestido().getTalla());
//
//			}
//		}
//
//	}
/*Generamos el método "mostrarPrecioDeLaRopa" en base a un "vararg", que es un
 * array que se crea conteniendo, en este caso, todos los maniquíes y se expresa que
 * se crea y recibe ese "vararg" al escribir "..." a continuación, en este caso, del nombre
 * de la clase "Maniqui", y hacerlo dentro del paréntesis del método.
 * 
 * Empleamos un "for-each" para recorrer dicho array que constuituye el "vararg" y, así
 * poder sacar la información erquerida de cada maniquí.
 * 
 * Empleamos la estructura condicional "if" especificando como condición que, "si el
 * resultado de querer acceder a la camisa es distinto de null", lo que significa que
 * en el maniquí "EXISTE CAMISA", "entonces, se ejecute : llamar a la camisa y
 * obtener su precio". Y así lo mismo para el panlón y para el vestido.
 */
	public void mostrarPrecioDeLaRopa(Maniqui... maniquies) {
		
		for (Maniqui maniqui : maniquies) {
			double pantalonPrecio = 0; //Inicializamos a "0" dentro del "for" para que en
			double vestidoPrecio = 0; //cada vuelta se inicialice cada variable a "0" y, así,
			double camisaPrecio = 0; // NO se sumen los resultados y, sin embargo, sí se
			double maniquiPrecio = 0; // asignen los valores correspondientes a cada
													// maniquí, realizçandose suma, sí, pero del precio
													//de cada variable que lleva cada maniquí asociado.
													// Y, así, luego poder sumar el precio de cada objeto
													// que sea que lleve puesto cada maniquí y obtener,
													//así, el precio total de la ropa que lleva cada maniquí.
			
			if (maniqui.getCamisa() != null) {
				camisaPrecio = maniqui.getCamisa().getPrecio();
			}

			if (maniqui.getPantalon() != null) {
				pantalonPrecio = maniqui.getPantalon().getPrecio();
			}

			if (maniqui.getVestido() != null) {
				vestidoPrecio = maniqui.getVestido().getPrecio();
			}

			maniquiPrecio = camisaPrecio + pantalonPrecio + vestidoPrecio;

			System.out.println("El precio del maniquí es\n" + maniquiPrecio);
		}

	}

}
