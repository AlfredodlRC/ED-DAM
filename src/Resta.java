

	/**
	 * 
	 * @author Alberto de Toro
	 * @version 1.0
	 * 
	 *  Clase que realiza operaciones relaccionadas con la resta 
	 * 
	 */

public class Resta {
		
		
		//
		// Atributo propiedad para las clases suma,resta y producto con un
		// contructor para poder inicializarlo
		//
		
	private double acumulador;
		
		public Resta(double acumulador) {
			super();
			this.acumulador = acumulador;
		}

		/**
		 * Contructor sin parametros de la clase
		 */
		public Resta() {
			super();
		}

		/**
		 * M�todo que realiza la resta de dos numeros reales y que devuelve otro n�mero real.
		 *<br>
		 * Acepta n�meros negativos en ambos reales devolviendo negativo si el parametro negativo es mayor 
		 * que el positivo o positivo si el mayor es negativo
		 *<br>
		 * Si los 2 argumentos son negativos, el resultado ser� negativo.
		 *<br>
		 * Si alguno de los parametros de entrada es null o no est� inicializado
		 * se generar� una excepcion IllegalArgumentException.
		 * 
		 * @param parametro1 -> parametro al que restaremos el  parametro2.
		 * @param parametro2 -> parametro que ser� restado del parametro1.
		 * @return devuelve la resta de ambos parametros.
		 * @throws IllegalArgumentException se generar� est� excepci�n cuando se introduzca
		 * un parametro no deseado
		 * 
		 */
		public double restar(double parametro1, double parametro2) {
			double resultado = parametro1 - parametro2;
			
			return resultado;
		}
		
		
		/**
		 * M�todo que realiza la resta de dos numeros entero y que devuelve otro n�mero entero
		 *<br>
		 * Acepta n�meros negativos en ambos enteros devolviendo negativo si el parametro negativo es mayor 
		 * que el positivo o positivo si el mayor es negativo
		 *<br>
		 * Si los 2 argumentos son negativos, el resultado ser� negativo.
		 *<br>
		 * Si alguno de los parametros de entrada es null o no est� inicializado
		 * se generar� una excepcion IllegalArgumentException.
		 *
		 * 
		 * @param parametro1 -> parametro al que restaremos el  parametro2.
		 * @param parametro2 -> parametro que ser� restado del parametro1.
		 * @return devuelve la resta de ambos parametros.
		 * @throws IllegalArgumentException se generar� est� excepci�n cuando se introduz
		 * 
		 */
		
		public int restaEntero(int parametro1, int parametro2) {
			int resultado = parametro1 * parametro2;
			
			return resultado;
		}

		/**
		 * M�todo que realiza la resta de tres numeros reales y que devuelve otro n�mero real.
		 *<br>
		 *Acepta n�meros negativos en los numeros devolviendo negativo si la suma de 2 parametros negativos es mayor que el positivo
		 * o uno de los parametros  negativos es mayor que la suma de los 2 positivos.
		 *<br>
		 * Si alguno de los parametros de entrada es null o no est� inicializado
		 * se generar� una excepcion IllegalArgumentException.
		 * 
		 * @param parametro1 -> parametro qal cual restaremos los otros 2 parametros
		 * @param parametro2 -> parametro que ser� restado al parametro1.
		 * @param parametro3 -> parametro que ser� restado al resultado de la resta del parametro2 al parametro1.
		 * @return devuelve la resta de todos los n�meros.
		 * @throws IllegalArgumentException se generar� est� excepci�n cuando se introduzca
		 * un parametro no deseado
		 * 
		 */
		public double restaLarga(double parametro1, double parametro2, double parametro3) {
			double resultado = parametro1 - parametro2 - parametro3;
			
			return resultado;
		}
		
		/**
		 * M�todo que calcula la resta con valor acumulado y que dar� como resultado un n�mero real.
		 *<br>
		 * Para ello utilizaremos un acumulador.
		 *<br>
		 * Si el parametro de entrada es negativo, har� funci�n de suma en vez de resta
		 *<br>
		 * Si el parametros de entrada es null o no est� inicializado
		 * se generar� una excepcion IllegalArgumentException.
		 * *<br>
		 * 
		 * 
		 * @param Parametro1 -> parametro el cual vamos a restar del acumulado.
		 * @return devuelve la el resultado de la resta del Parametro1 al Acumulado.
		 * @throws IllegalArgumentException se generar� est� excepci�n cuando se introduzca
		 * un parametro no deseado
		 * 
		 */
		public double restaAcumulado(double Parametro1) {
			double resultado = acumulador - Parametro1;
			
			return resultado;
		}
		}	
	

