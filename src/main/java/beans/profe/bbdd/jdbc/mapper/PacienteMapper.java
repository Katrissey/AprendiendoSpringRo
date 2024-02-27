package beans.profe.bbdd.jdbc.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import beans.profe.bbdd.jdbc.pojos.Paciente;

//Spring es el que hace el executeQuery() y le decimos c�mo lo va a tratar por cada fila del resultado. 
//Esto se hace implementado la interfaz org.springframework.jdbc.core.RowMapper
public class PacienteMapper implements RowMapper {

	public Paciente mapRow(ResultSet rs, int row) throws SQLException {
		Paciente patient = new Paciente();
		
		//Este método sirve para decirle a SP cómo ha de generarme el siguiente objeto o cualquier otro de forma dinámica
		//en vez de tener que crearlos de forma manual con los beans del xml.
		//La interfaz RowMapper obliga a aquellas que la implementan a que usen y sobreescriban el método "mapRow" que, en este caso,
		//ha de devolver un "Paciente" y por eso lo ponemos delante del nombre del método, pero podría devolver cualqueir otro
		//objeto que se desee.
		try {
			
		    patient.setId(rs.getInt(1));
		    patient.setName(rs.getString(2));
		    patient.setLastName(rs.getString(3));
		    patient.setRoomId(rs.getInt(4));
		    
		} catch (SQLException sqe) {
			System.out.println("Sin resultados");
		}
		return patient;
	 }
}
