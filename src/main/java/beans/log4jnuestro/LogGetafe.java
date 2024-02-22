package beans.log4jnuestro;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("lgt")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class LogGetafe {
	
	@Value ("4")
	private int nivelLog;
	
	/**
	 * 
	 */
	public LogGetafe() {
		super();
	}

	/**
	 * @param nivelLog
	 */
	public LogGetafe(int nivelLog) {
		super();
		this.nivelLog = nivelLog;
	}

	/**
	 * @return the nivelLog
	 */
	public int getNivelLog() {
		return nivelLog;
	}

	/**
	 * @param nivelLog the nivelLog to set
	 */
	public void setNivelLog(int nivelLog) {
		this.nivelLog = nivelLog;
	}

	@Override
	public String toString() {
		return "LogGetafe [nivelLog=" + nivelLog + "]";
	}
	
	public void trace (String msg) {
		if (0>=nivelLog) {
			System.out.println ("trace " + msg);
		}
	}
	
	public void debug (String msg) {
		if (1>=nivelLog) {
			System.out.println ("debug " + msg);
		}
	}
	
	public void info (String msg) {
		if (2>=nivelLog) {
			System.out.println ("info " + msg);
			}
	}
	
	public void warning (String msg) {
		if (3>=nivelLog) {
			System.out.println ("warning " + msg);
			}
	}
	
	public void error (String msg) {
		if (4>=nivelLog) {
			System.out.println ("error " + msg);
			}
	}
	
	public void fatal (String msg) {
		if (5>=nivelLog) {
			System.out.println ("fatal " + msg);
			}
	}

}
