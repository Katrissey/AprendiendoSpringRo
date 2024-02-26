package beans.profe.bbdd.hibernate.dao;

import beans.profe.bbdd.hibernate.entities.Usuario;

public interface UsuarioDAO {

	public void guardarUsuario(Usuario usuario);
	
	public Usuario getUsuario(String nombre);
}
