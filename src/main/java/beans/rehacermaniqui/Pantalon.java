package beans.rehacermaniqui;

public class Pantalon {
	
	//Declaramos las variables de instancia
	private long id;
	private String color;
	private String talla;
	private double precio;
	private Boton boton; //Conectamos con clase "Boton" para crear el objeto "boton"
	
	//Generamos los constructores:
	public Pantalon () {
		
	}
	
	/**
	 * @param id
	 * @param color
	 * @param talla
	 * @param precio
	 */
	public Pantalon(long id, String color, String talla, double precio) {
		super();
		this.id = id;
		this.color = color;
		this.talla = talla;
		this.precio = precio;
	}

	public Pantalon(long id, String color, String talla, double precio, Boton boton) {
		super();
		this.id = id;
		this.color = color;
		this.talla = talla;
		this.precio = precio;
		this.boton = boton;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) { //Podríamos quitar este para que nadie pueda modificarlo
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

	public Boton getBoton() {
		return boton;
	}

	public void setBoton(Boton boton) {
		this.boton = boton;
	}

	@Override
	public String toString() {
		return "Pantalon [id=" + id + ", " + (color != null ? "color=" + color + ", " : "")
				+ (talla != null ? "talla=" + talla + ", " : "") + "precio=" + precio + ", "
				+ (boton != null ? "boton=" + boton : "") + "]";
	}
	
}
