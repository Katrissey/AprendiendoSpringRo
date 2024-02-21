package beans.rehacermaniqui;

import java.util.Set;

public class Camisa {
	//Declaramos las variables de instancia
		private long id;
		private String color;
		private String talla;
		private double precio;
		private Set <Boton> botones;
		
		//Generamos los constructores
		public Camisa () {
			
		}
		
		/**
		 * @param id
		 * @param color
		 * @param talla
		 * @param precio
		 */
		public Camisa(long id, String color, String talla, double precio) {
			super();
			this.id = id;
			this.color = color;
			this.talla = talla;
			this.precio = precio;
		}



		public Camisa(long id, String color, String talla, double precio, Set <Boton> boton) {
			super();
			this.id = id;
			this.color = color;
			this.talla = talla;
			this.precio = precio;
			this.botones = boton;
		}
		
		//Generamos los métodos Setter y Getter
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
		public Set <Boton> getBotones() {
			return botones;
		}
		public void setBotones(Set <Boton> botones) {
			this.botones = botones;
		}

		@Override
		public String toString() {
			return "Camisa [id=" + id + ", " + (color != null ? "color=" + color + ", " : "")
					+ (talla != null ? "talla=" + talla + ", " : "") + "precio=" + precio + ", "
					+ (botones != null ? "boton=" + botones : "") + "]";
		}
		
}
