package beans.profe.beans1.beans;


/*
 * Tiene un constructor privado, lo que significa que solo puede usarse desde 
 * dentro de la misma aplicaci�n. Adem�s tiene una instancia del mismo tipo, 
 * la cual se inicializa dentro de un m�todo de inicializaci�n est�tico, 
 * o sea que la instancia se crear� en cuanto la clase se cargue en el classloader.
 * 
 * Como el constructor y la instancia de la clase son privadas, 
 * necesitamos una forma de obtener dicha instancia. 
 * Para eso proporcionamos un m�todo de f�brica, el m�todo "getInstancia", 
 * el cual nos regresar� la instancia cada vez que la necesitemos.
 */
public class FactoryMethodUse {
	private static FactoryMethodUse instancia;

    static
    {
        instancia = new FactoryMethodUse();
    }

    private FactoryMethodUse()
    {
    	
    }

    public static FactoryMethodUse getInstancia()
    {
        return instancia;
    }

    public String getMensaje()
    {
        return "Hola a todos!!!!";
    }
}