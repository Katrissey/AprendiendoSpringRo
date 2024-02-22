package beans.log4jnuestro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("cl")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CalculadoraLog {
	
	//@Qualifier ("logetafe") no es imprescindible para la inyección, lo que sí lo es, es el autowired, el Qualifier es para especificar cuál de los objetos creados queremos que se inyecte
	@Autowired
	private LogGetafe lgt;
	
	@Value("3")
	private int operador1;
	@Value("7")
	private int operador2;
			
	/**
	 * 
	 */
	public CalculadoraLog() {
		super();
	}
	/**
	 * @param lgt
	 * @param operador1
	 * @param operador2
	 */
	public CalculadoraLog(int operador1, int operador2) {
//	No es para nada necesario añadir el atributo "ltg", directamente se inyecta llamando al Set y al constructor vacío
		this.operador1 = operador1;
		this.operador2 = operador2;
	}
	/**
	 * @return the lgt
	 */
	public LogGetafe getLgt() {
		return lgt;
	}
	/**
	 * @param lgt the lgt to set
	 */
	public void setLgt(LogGetafe lgt) {
		this.lgt = lgt;
	}
	/**
	 * @return the operador1
	 */
	public int getOperador1() {
		return operador1;
	}
	/**
	 * @param operador1 the operador1 to set
	 */
	public void setOperador1(int operador1) {
		this.operador1 = operador1;
	}
	/**
	 * @return the operador2
	 */
	public int getOperador2() {
		return operador2;
	}
	/**
	 * @param operador2 the operador2 to set
	 */
	public void setOperador2(int operador2) {
		this.operador2 = operador2;
	}
	@Override
	public String toString() {
		return "CalculadoraLog [" + (lgt != null ? "lgt=" + lgt + ", " : "") + "operador1=" + operador1 + ", operador2="
				+ operador2 + "]";
	}
	
	public void sumar () {
		lgt.trace("El resultado es " + (operador1 + operador2));
		lgt.debug("El resultado es " + (operador1 + operador2));
		lgt.info("El resultado es " + (operador1 + operador2));
		lgt.warning("El resultado es " + (operador1 + operador2));
		lgt.error("El resultado es " + (operador1 + operador2));
		lgt.fatal("El resultado es " + (operador1 + operador2));

	}

}
