package mains.rehacermaniquiconspring;

import beans.rehacermaniqui.Camisa;
import beans.rehacermaniqui.Pantalon;

public class Maniqui {
	
	//Declaramos las variables de instancia:
	 private long id;
	 private Vestido vestido;
	 private Pantalon pantalon;
	 private Camisa camisa;
	
	 //Generamos los constructores:
	 	//Se puede crear también un constructor que sólo tenga el id, otro que sólo tenga
	 	//vestido, otro que tenga camisa y pantalón, otro sólo con camisa, solo pantalón...
	 public Maniqui(long id, Vestido vestido, Pantalon pantalon, Camisa camisa) {
		super();
		this.id = id;
		this.vestido = vestido;
		this.pantalon = pantalon;
		this.camisa = camisa;
	}

	 //Generamos los Setters y Getters
	public long getId() {
		return id;
	}

	public void setId(long id) {//Podríamos quitar este set para que no se pueda modificar
		this.id = id;
	}

	public Vestido getVestido() {
		return vestido;
	}

	public void setVestido(Vestido vestido) {
		this.vestido = vestido;
	}

	public Pantalon getPantalon() {
		return pantalon;
	}

	public void setPantalon(Pantalon pantalon) {
		this.pantalon = pantalon;
	}

	public Camisa getCamisa() {
		return camisa;
	}

	public void setCamisa(Camisa camisa) {
		this.camisa = camisa;
	}
	 
	 //Métodos:
	//Método desvestir:
	public void desvestir () { //No es necesario darle el maniqui porque ya estamos
		//en la clase maniquí. Si hubiéramos creado el método en otra clase, entonces
		//sí tendríamos que darle el maniquí, escribir maniqui.setCamisa, etc,
		//así como que bno fuera "void" y retornar maniquí si quisiéramos que
		//se guardase el resultado de la función "desvestir" y se pudiese mostrar
		//si así lo quiséramos desde la función "main".
				
//		maniqui.setCamisa(camisa);  //No hace falta hacer todo esto, así lo que hago
//		camisa.setId(0);						//es quitar los atributos pero lo que queremos
//		camisa.setColor("");					//es quitar lo que es el objeto entero en sí,
//		camisa.setPrecio(0);				//la camisa, el pantalón y el vestido
//		camisa.setTalla("");
//		camisa.setBoton(null);
//		
//		maniqui.setPantalon(pantalon);
//		pantalon.setId (0);
//		pantalon.setColor("");
//		pantalon.setPrecio(0);
//		pantalon.setTalla("");
//		pantalon.setBoton(null);
//		
//		maniqui.setVestido();
		
		setCamisa (null);
		setPantalon (null);
		setVestido(null);

	}
	
	//Método vestir:
	public void vestir () { //Lo mismo ocurre con el método "vestir"
		setVestido (null); //Directamente, editamos vestido en caso de que lo
									//tuviera, y lo eliminamos declarándolo "null"
		
		setCamisa(camisa); //Lo editamos y le ponemos una camisa
		setPantalon(pantalon); //Lo editamos y le ponemos un pantalón
		
	}


}
