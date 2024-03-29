package beans.profe.bbdd.hibernate.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Table;


@Entity
@Table(appliesTo = "TB_USUARIOS_ANOT")
public class Usuario implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="usuario")
	private String usuario;
	@Column(length=255)
	private String contrasena;
	
	public Usuario(){
		
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
}
