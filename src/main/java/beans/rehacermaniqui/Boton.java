package beans.rehacermaniqui;

public class Boton {
	
	//Declaramos las variables de instancia:
	private long id;
	private String forma;
	private String color;
	private String tamanio;
	
	//Generamos los constructores:
	public Boton(long id, String forma, String color, String tamanio) {
		super(); //Conecta con el método constructor de la clase padre... ya lo veremos.
		this.id = id;
		this.forma = forma;
		this.color = color;
		this.tamanio = tamanio;
	}

	//Generamos los Getters y Setters:
	public long getId() {
		return id;
	}

	public void setId(long id) { //Podríamos quitar este set para que no se pueda modificar
		this.id = id;
	}

	public String getForma() {
		return forma;
	}

	public void setForma(String forma) {
		this.forma = forma;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTamanio() {
		return tamanio;
	}

	public void setTamanio(String tamanio) {
		this.tamanio = tamanio;
	}
	
	
	
	

}
