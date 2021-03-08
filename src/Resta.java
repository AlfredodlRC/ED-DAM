

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
		 * Método que realiza la resta de dos numeros reales y que devuelve otro número real.
		 *<br>
		 * Acepta números negativos en ambos reales devolviendo negativo si el parametro negativo es mayor 
		 * que el positivo o positivo si el mayor es negativo
		 *<br>
		 * Si los 2 argumentos son negativos, el resultado será negativo.
		 *<br>
		 * Si alguno de los parametros de entrada es null o no está inicializado
		 * se generará una excepcion IllegalArgumentException.
		 * 
		 * @param parametro1 -> parametro al que restaremos el  parametro2.
		 * @param parametro2 -> parametro que será restado del parametro1.
		 * @return devuelve la resta de ambos parametros.
		 * @throws IllegalArgumentException se generará está excepción cuando se introduzca
		 * un parametro no deseado.
		 * 
		 */
		public double restar(double parametro1, double parametro2) {
			double resultado = 0;
			double Oparametro1;
			double Oparametro2;
			
			try {
				Oparametro1 = Double.valueOf(parametro1);
					
			}
			catch (Exception e) {
				throw new IllegalArgumentException("No se ha inicializado del parametro1.");		
			}
			
			try {
				Oparametro2 = Double.valueOf(parametro2);
			}
			catch (Exception e) {
				throw new IllegalArgumentException("No se ha inicializado del parametro1.");
			}

			if (Oparametro1 == null) throw new IllegalArgumentException("El parametro1 es nulo.");

			if (Oparametro2 == null) throw new IllegalArgumentException("El parametro2 es nulo.");

			if (Oparametro1.isNaN()) throw new IllegalArgumentException("El parametro1 no es un número.");

			if (Oparametro2.isNaN()) throw new IllegalArgumentException("El parametro2 no es un número.");
			
			resultado = parametro1 - parametro2;
			
			return resultado;
		}
			
		
		
		
		/**
		 * Método que realiza la resta de dos numeros entero y que devuelve otro número entero
		 *<br>
		 * Acepta números negativos en ambos enteros devolviendo negativo si el parametro negativo es mayor 
		 * que el positivo o positivo si el mayor es negativo
		 *<br>
		 * Si los 2 argumentos son negativos, el resultado será negativo.
		 *<br>
		 * Si alguno de los parametros de entrada es null o no está inicializado
		 * se generará una excepcion IllegalArgumentException.
		 *
		 * 
		 * @param parametro1 -> parametro al que restaremos el  parametro2.
		 * @param parametro2 -> parametro que será restado del parametro1.
		 * @return devuelve la resta de ambos parametros.
		 * @throws IllegalArgumentException se generará está excepción cuando se introduz
		 * 
		 */
		
		public int restaEntero(int parametro1, int parametro2) {
			int resultado = 0;
			
			double Oparametro1;
			double Oparametro2;
			
			try {
				Oparametro1 = Double.valueOf(parametro1);
					
			}
			catch (Exception e) {
				throw new IllegalArgumentException("No se ha inicializado del parametro1.");		
			}
			
			try {
				Oparametro2 = Double.valueOf(parametro2);
			}
			catch (Exception e) {
				throw new IllegalArgumentException("No se ha inicializado del parametro1.");
			}
			if (Oparametro1 == null) throw new IllegalArgumentException("El parametro1 es nulo.");

			if (Oparametro2 == null) throw new IllegalArgumentException("El parametro2 es nulo.");

			if (Oparametro1.isNaN()) throw new IllegalArgumentException("El parametro1 no es un número.");

			if (Oparametro2.isNaN()) throw new IllegalArgumentException("El parametro2 no es un número.");
			
			resultado = parametro1 - parametro2;
			
			return resultado;
		}
			
		

		/**
		 * Método que realiza la resta de tres numeros reales y que devuelve otro número real.
		 *<br>
		 *Acepta números negativos en los numeros devolviendo negativo si la suma de 2 parametros negativos es mayor que el positivo
		 * o uno de los parametros  negativos es mayor que la suma de los 2 positivos.
		 *<br>
		 * Si alguno de los parametros de entrada es null o no está inicializado
		 * se generará una excepcion IllegalArgumentException.
		 * 
		 * @param parametro1 -> parametro qal cual restaremos los otros 2 parametros
		 * @param parametro2 -> parametro que será restado al parametro1.
		 * @param parametro3 -> parametro que será restado al resultado de la resta del parametro2 al parametro1.
		 * @return devuelve la resta de todos los números.
		 * @throws IllegalArgumentException se generará está excepción cuando se introduzca
		 * un parametro no deseado
		 * 
		 */
		public double restaLarga(double parametro1, double parametro2, double parametro3) {
			double resultado = parametro1 - parametro2 - parametro3;
			double Oparametro1;
			double Oparametro2;
			double Oparametro3;
			
			try {
				Oparametro1 = Double.valueOf(parametro1);
					
			}
			catch (Exception e) {
				throw new IllegalArgumentException("No se ha inicializado del parametro1.");		
			}
			
			try {
				Oparametro2 = Double.valueOf(parametro2);
			}
			catch (Exception e) {
				throw new IllegalArgumentException("No se ha inicializado del parametro2.");
			}

			try {
				Oparametro3 = Double.valueOf(parametro3);
			}
			catch (Exception e) {
				throw new IllegalArgumentException("No se ha inicializado del parametro3.");
			}
			
			if (Oparametro1 == null) throw new IllegalArgumentException("El parametro1 es nulo.");

			if (Oparametro2 == null) throw new IllegalArgumentException("El parametro2 es nulo.");
			
			if (Oparametro3 == null) throw new IllegalArgumentException("El parametro3 es nulo.");

			if (Oparametro1.isNaN()) throw new IllegalArgumentException("El parametro1 no es un número.");

			if (Oparametro2.isNaN()) throw new IllegalArgumentException("El parametro2 no es un número.");

			if (Oparametro3.isNaN()) throw new IllegalArgumentException("El parametro3 no es un número.");
			
			resultado = parametro1 - parametro2 - parametro2;
			
			return resultado;
		}
			
		
		/**
		 * Método que calcula la resta con valor acumulado y que dará como resultado un número real.
		 *<br>
		 * Para ello utilizaremos un acumulador.
		 *<br>
		 * Si el parametro de entrada es negativo, hará función de suma en vez de resta
		 *<br>
		 * Si el parametros de entrada es null o no está inicializado
		 * se generará una excepcion IllegalArgumentException.
		 * *<br>
		 * 
		 * 
		 * @param Parametro1 -> parametro el cual vamos a restar del acumulado.
		 * @return devuelve la el resultado de la resta del Parametro1 al Acumulado.
		 * @throws IllegalArgumentException se generará está excepción cuando se introduzca
		 * un parametro no deseado
		 * 
		 */
		public double restaAcumulado(double Parametro1) {
			double resultado = 0;
			
			double Oparametro1;
			
			
			try {
				Oparametro1 = Double.valueOf(Parametro1);
					
			}
			catch (Exception e) {
				throw new IllegalArgumentException("No se ha inicializado del parametro1.");		
			}
			if (Oparametro1 == null) throw new IllegalArgumentException("El parametro1 es nulo.");	

			if (Oparametro1.isNaN()) throw new IllegalArgumentException("El parametro1 no es un número.");
			
			resultado = acumulador - Parametro1;
			return resultado;
		}
		}	
	

