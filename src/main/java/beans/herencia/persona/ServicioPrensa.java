package beans.herencia.persona;

import java.util.List;

import beans.log4jnuestro.LogGetafe;

public class ServicioPrensa {
	
	private List<String> periodicos;
	private LogGetafe logGetafe;

	/**
	 * @param titulo
	 */
	public ServicioPrensa(List<String> periodicos) {
		super();
		this.periodicos = periodicos;
	}

	/**
	 * 
	 */
	public ServicioPrensa() {
		super();
	}

	
	/**
	 * @return the periodicos
	 */
	public List<String> getPeriodicos() {
		return periodicos;
	}

	/**
	 * @param periodicos the periodicos to set
	 */
	public void setPeriodicos(List<String> periodicos) {
		this.periodicos = periodicos;
	}

	/**
	 * @return the logGetafe
	 */
	public LogGetafe getLogGetafe() {
		return logGetafe;
	}

	/**
	 * @param logGetafe the logGetafe to set
	 */
	public void setLogGetafe(LogGetafe logGetafe) {
		this.logGetafe = logGetafe;
	}

	List<String> mostrarPrensa (String tipoSuscripcion){
		List<String>listaPeriodicos=null;
		
	if (tipoSuscripcion.equals("free")) {
		listaPeriodicos= periodicos.subList(0, 1); //Va de la posición 0 hasta la 1 pero sólo coge la primera, como en substring
	} else if (tipoSuscripcion.equals("basic")) {
		listaPeriodicos= periodicos.subList(0, periodicos.size()/2); //La mitad de los periódicos de la lista inicial
	} else if (tipoSuscripcion.equals("premium")) {
		listaPeriodicos= periodicos;
	} else {
		logGetafe.info("Tipo de Suscripción incorrecta");
	}
	
	return listaPeriodicos;
	}
	
	public void leerPeriodico (String periodico) {
		if (this.periodicos.contains(periodico)) { 
		logGetafe.info(" Leyendo" + periodico);
		}
	}
			
}
