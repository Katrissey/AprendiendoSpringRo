package mains.rehacermaniquiconspring;

public class Vestido {
	
	//Declaramos las variables de instancia:
	private long id;
	private String color;
	private String talla;
	private double precio;
	
	//Generamos los constructores:
	public Vestido(long id, String color, String talla, double precio) {
		super();
		this.id = id;
		this.color = color;
		this.talla = talla;
		this.precio = precio;
	}
	
	//Generamos los métodos Setter y Getter:
	public long getId() {
		return id;
	}
	public void setId(long id) {//Podríamos quitar este set para que no se pueda modificar
		this.id = id;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getTalla() {
		return talla;
	}
	public void setTalla(String talla) {
		this.talla = talla;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	

}
