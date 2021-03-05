package Operaciones;
/**
 * 
 * @author Gonzalo Cuadra Ciudad
 * @version 1.0
 * 
 *  Clase que realiza operaciones relaccionadas con la multiplicación 
 * 
 */

public class Multiplicacion {

	
	
	//
	// Atributo propiedad para las clases suma,resta y producto con un
	// contructor para poder inicializarlo
	//

	/**
	 * Contructor sin parametros de la clase
	 */
	public Multiplicacion() {
		super();
	}

	/**
	 * Método que realiza la multiplicación de dos numeros reales y que devuelve otro número real.
	 *<br>
	 * Acepta números negativos en ambos reales devolviendo negativo si solo
	 * uno de los parametros es negativo y el otro positivo, o si ambos son negativos devuelve positivo.
	 *<br>
	 * Si uno de los números es 0, devolverá siempre un 0.
	 *<br>
	 * Si alguno de los parametros de entrada es null o no está inicializado
	 * se generará una excepcion IllegalArgumentException.
	 * 
	 * @param parametro1 -> parametro que será multiplicado por el otro parametro2.
	 * @param parametro2 -> parametro que será multiplicado por el otro parametro1.
	 * @return devuelve la multiplicación de ambos parametros.
	 * @throws IllegalArgumentException se generará está excepción cuando se introduzca
	 * un parametro no deseado
	 * 
	 */
	public double multiplicar(double parametro1, double parametro2) {
		double resultado = 0;
		double Oparametro1;
		double Oparametro2;
		
		
		try {
			Oparametro1 = Double.valueOf(parametro1);
				
		}
		catch (Exception e) {
			throw new IllegalArgumentException("No se ha inicializado del parametro1");		
		}
		
		try {
			Oparametro2 = Double.valueOf(parametro2);
		}
		catch (Exception e) {
			throw new IllegalArgumentException("No se ha inicializado del parametro2");
		}


		if (parametro1 == 0) return 0;
		
		if (parametro2 == 0) return 0;
		
		resultado = parametro1 * parametro2;
		
		return resultado;
	}
	
	
	
	/**
	 * Método que realiza la multiplicación de dos numeros entero y que devuelve otro número long.
	 *<br>
	 *Acepta números negativos en ambos enteros devolviendo negativo si solo
	 * uno de los parametros es negativo y el otro positivo, o si ambos son negativos devuelve positivo.
	 *<br>
	 * Si uno de los números es 0, devolvera siempre un 0.
	 *<br>
	 * Si alguno de los parametros de entrada es null o no está inicializado
	 * se generará una excepcion IllegalArgumentException.
	 * 
	 * @param parametro1 -> parametro que será multiplicado por el otro parametro2.
	 * @param parametro2 -> parametro que será multiplicado por el otro parametro1.
	 * @return devuelve la multiplicación de ambos parametros.
	 * @throws IllegalArgumentException se generará está excepción cuando se introduzca
	 * un parametro no deseado
	 * 
	 */
	
	public long multiplicacion(int parametro1, int parametro2) {
		long resultado = 0;
		double Oparametro1;
		double Oparametro2;
		
		try {
			Oparametro1 = Double.valueOf(parametro1);
				
		}
		catch (Exception e) {
			throw new IllegalArgumentException("No se ha inicializado del parametro1");		
		}
		
		try {
			Oparametro2 = Double.valueOf(parametro2);
		}
		catch (Exception e) {
			throw new IllegalArgumentException("No se ha inicializado del parametro2");
		}


		if (parametro1 == 0) return 0;
		
		if (parametro2 == 0) return 0;
		
		resultado = parametro1 * parametro2;
		
		return resultado;
	}
		


	/**
	 * Método que realiza la multiplicación de tres numeros reales y que devuelve otro número real.
	 *<br>
	 *Acepta números negativos en lso numeros devolviendo negativo si solo
	 * uno de los parametros es negativo o si los tres números son negativos, o si ambos son negativos devuelve positivo.
	 *<br>
	 * Si uno de los números es 0, devolvera siempre un 0.
	 *<br>
	 * Si alguno de los parametros de entrada es null o no está inicializado
	 * se generará una excepcion IllegalArgumentException.
	 * 
	 * @param parametro1 -> parametro que será multiplicado por los otros dos numeros.
	 * @param parametro2 -> parametro que será multiplicado por los otros dos numeros.
	 * @param parametro3 -> parametro que será multiplicado por los otros dos numeros.
	 * @return devuelve la multiplicación de todos los números.
	 * @throws IllegalArgumentException se generará está excepción cuando se introduzca
	 * un parametro no deseado
	 * 
	 */
	public double multiplicacionLarga(double parametro1, double parametro2, double parametro3) {
		double resultado = 0;
		double Oparametro1;
		double Oparametro2;
		double Oparametro3;
		
		try {
			Oparametro1 = Double.valueOf(parametro1);
				
		}
		catch (Exception e) {
			throw new IllegalArgumentException("No se ha inicializado del parametro1");		
		}
		
		try {
			Oparametro2 = Double.valueOf(parametro2);
		}
		catch (Exception e) {
			throw new IllegalArgumentException("No se ha inicializado del parametro2");
		}

		try {
			Oparametro3 = Double.valueOf(parametro2);
		}
		catch (Exception e) {
			throw new IllegalArgumentException("No se ha inicializado del parametro3");
		}

		if (parametro1 == 0) return 0;
		
		if (parametro2 == 0) return 0;
		
		if (parametro3 == 0) return 0;
		
		resultado = parametro1 * parametro2 * parametro3;
		
		return resultado;
	}
	
	/**
	 * Método que calcula la potencia de la base elevado a un exponente, y que dará como resultado un número entero.
	 *<br>
	 * Si la base es positiva, el resultado es positivo si el exponente es par y negativo si es impar.
	 *<br>
	 * Si el exponente es negativo provocará una excepción.
	 *<br>
	 * Si el parametros de entrada es null o no está inicializado
	 * se generará una excepcion IllegalArgumentException.
	 * *<br>
	 * Para ello utilizaremos la función Math.Pow()
	 * 
	 * @param base -> parametro el cual vamos a multiplicar tantas veces nos indique el exponente.
	 * @param exponente -> parametro que nos indica las veces que tenemos que multiplicar la base.
	 * @return devuelve la potencia de la base elevado al exponente de los parametros introducidos.
	 * @throws IllegalArgumentException se generará está excepción cuando se introduzca
	 * un parametro no deseado
	 * 
	 */
	public long potencia(int base, int exponente) {
		int resultado = 0;
		
		Double Obase;
		Double Oexponente;

		try {
			Obase = Double.valueOf(base);
				
		}
		catch (Exception e) {
			throw new IllegalArgumentException("No se ha inicializado de la base");		
		}
		
		try {
			Oexponente = Double.valueOf(exponente);
		}
		catch (Exception e) {
			throw new IllegalArgumentException("No se ha inicializado del exponente");
		}

		if (Obase == null) throw new IllegalArgumentException("La base es nula.");

		if (Oexponente == null) throw new IllegalArgumentException("El exponente es nulo.");
		
		if (Obase.isNaN()) throw new IllegalArgumentException("La base no es un número.");

		if (Oexponente.isNaN()) throw new IllegalArgumentException("El exponente no es un número.");

		if (Obase == 0) return 1;
		
		if (Oexponente == 0) return 1;
			
			
		resultado = (int) Math.pow(base, exponente);

		
		return resultado;
	}
	}
