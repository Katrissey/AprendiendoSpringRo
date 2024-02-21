package beans.log4jnuestro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class CalculadoraLog {
	
	//@Qualifier ("logetafe")
	@Autowired
	private LogGetafe lgt;
	private int operador1;
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
	public CalculadoraLog(LogGetafe lgt, int operador1, int operador2) {
		super();
		this.lgt = lgt;
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
		lgt.warning("El resultado es " + (operador1 + operador2));
		lgt.error("El resultado es " + (operador1 + operador2));
	}

}
