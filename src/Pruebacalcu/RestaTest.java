package Pruebacalcu;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import Operaciones.Multiplicacion;
import Operaciones.Resta;

class RestaTest {

	/*
	 *  Test parametros enteros
	 */

	/*
	 * Acepta números negativos en ambos enteros devolviendo negativo si el parametro negativo es mayor 
	 * que el positivo o positivo si el mayor es negativo
	 * Si los 2 argumentos son negativos, el resultado será negativo.
	 * Si alguno de los parametros de entrada es null o no está inicializado
	 * se generará una excepcion IllegalArgumentException.
	 *
	 */
	@Test
	void RealTest() {
		Resta oResta = new Resta();
		double uno = 1;
		double resultado = 0;
		resultado = oResta.restar(uno, uno);
		Assert.assertEquals(0, resultado,0.00001);
	}

	@Test
	void resultadoPositivoRealTest() {
		Resta oResta = new Resta();
		double uno = -1;
		double dos = 2;
		double resultado = 0;
		resultado = oResta.restar(uno, dos);
		Assert.assertEquals(1, resultado,0.00001);
	}
	
	@Test
	void resultadoNegativoRealTest() {
		Resta oResta = new Resta();
		double uno = 1;
		double dos = -2;
		double resultado = 0;
		resultado = oResta.restar(uno, dos);
		Assert.assertEquals(-1, resultado,0.00001);
	}
	
	@Test
	void DosNegativosRealTest() {
		Resta oResta = new Resta();
		double uno = -1;
		double dos = -2;
		double resultado = 0;
		resultado = oResta.restar(uno, uno);
		Assert.assertEquals(-3, resultado,0.00001);
	}
	

	@Test
	void nuloMenosCincoRealTest() {
		double nulo = (Double) null;
		double cinco = 5;
		double resultado = 0;
		Resta oResta = new Resta();
		try {
			resultado = oResta.restar(nulo, cinco);
			Assert.fail();
		} catch (IllegalArgumentException e) {
			Assert.assertTrue(true);
		}
	}

	@Test
	void CincoMenosNuloRealTest() {
		double nulo = (Double) null;
		double cinco = 5;
		double resultado = 0;
		Resta oResta = new Resta();
		try {
			resultado = oResta.restar(cinco,nulo);
			Assert.fail();
		} catch (IllegalArgumentException e) {
			Assert.assertTrue(true);
		}
	}

	/*
	 *  Test parametros reales
	 */

	/*
	 * Acepta números negativos en ambos reales devolviendo negativo si el parametro negativo es mayor 
	 * que el positivo o positivo si el mayor es negativo
	 * Si los 2 argumentos son negativos, el resultado será negativo.
	 * Si alguno de los parametros de entrada es null o no está inicializado
	 * se generará una excepcion IllegalArgumentException.
	 */

	@Test
	void EnteroTest() {
		Resta oResta = new Resta();
		int uno = 1;
		int resultado = 0;
		resultado = oResta.restaEntero(uno, uno);
		Assert.assertEquals(0, resultado);
	}

	@Test
	void resultadoPositivoEnteroTest() {
		Resta oResta = new Resta();
		int uno = -1;
		int dos = 2;
		int resultado = 0;
		resultado = oResta.restaEntero(uno, dos);
		Assert.assertEquals(1, resultado);
	}
	
	@Test
	void resultadoNegativoEnteroTest() {
		Resta oResta = new Resta();
		int uno = 1;
		int dos = -2;
		int resultado = 0;
		resultado = oResta.restaEntero(uno, dos);
		Assert.assertEquals(-1, resultado);
	}
	
	@Test
	void DosNegativosEnteroTest() {
		Resta oResta = new Resta();
		int uno = -1;
		int dos = -2;
		int resultado = 0;
		resultado = oResta.restaEntero(uno, uno);
		Assert.assertEquals(-3, resultado);
	}
	

	@Test
	void nuloMenosCincoEnteroTest() {
		int nulo = (Integer) null;
		int cinco = 5;
		long resultado = 0;
		Resta oResta = new Resta();
		try {
			resultado = oResta.restaEntero(nulo, cinco);
			Assert.fail();
		} catch (IllegalArgumentException e) {
			Assert.assertTrue(true);
		}
	}

	@Test
	void CincoMenosNuloEnteroTest() {
		int nulo = (Integer) null;
		int cinco = 5;
		long resultado = 0;
		Resta oResta = new Resta();
		try {
			resultado = oResta.restaEntero(cinco,nulo);
			Assert.fail();
		} catch (IllegalArgumentException e) {
			Assert.assertTrue(true);
		}
	}


	
	
	/*
	 * Test resta 3 números
	 */
	
	/*
	 * Método que realiza la resta de tres numeros reales y que devuelve otro número real.
	 *Acepta números negativos en los numeros devolviendo negativo si la suma de 2 parametros negativos es mayor que el positivo
	 * o uno de los parametros  negativos es mayor que la suma de los 2 positivos.
	 * Si alguno de los parametros de entrada es null o no está inicializado
	 * se generará una excepcion IllegalArgumentException.
	 */

	
	
	
	/* 
	 * resta al acumulador 
	 */
	
	/*
	 * Si el parametro de entrada es negativo, hará función de suma en vez de resta
	 * Si el parametros de entrada es null o no está inicializado
	 * se generará una excepcion IllegalArgumentException.
	 */

	@Test
	void AcumuladorTest() {
		double uno = 1;
		double resultado = 0;
		Resta oResta = new Resta(uno);
		resultado = oResta.restaAcumulado(uno);
		Assert.assertEquals(0, resultado,0.00001);
	}

	@Test
	void resultadoPositivoAcumuladorTest() {
		double uno = -1;
		double dos = 2;
		double resultado = 0;
		Resta oResta = new Resta(uno);
		resultado = oResta.restaAcumulado(dos);
		Assert.assertEquals(1, resultado,0.00001);
	}
	
	@Test
	void resultadoNegativoAcumuladoTest() {
		double uno = 1;
		double dos = -2;
		double resultado = 0;
		Resta oResta = new Resta(uno);
		resultado = oResta.restaAcumulado(dos);
		Assert.assertEquals(-1, resultado,0.00001);
	}
	
	@Test
	void DosNegativosAcumuladoTest() {
		double uno = -1;
		double dos = -2;
		double resultado = 0;
		Resta oResta = new Resta(uno);
		resultado = oResta.restaAcumulado(dos);
		Assert.assertEquals(-3, resultado,0.00001);
	}
	

	@Test
	void nuloMenosCincoAcumuladoTest() {
		double nulo = (Double) null;
		double cinco = 5;
		double resultado = 0;
		Resta oResta = new Resta(nulo);
		try {
			resultado = oResta.restaAcumulado(cinco);
			Assert.fail();
		} catch (IllegalArgumentException e) {
			Assert.assertTrue(true);
		}
	}

	@Test
	void CincoMenosNuloAcumuladoTest() {
		double nulo = (Double) null;
		double cinco = 5;
		double resultado = 0;
		Resta oResta = new Resta(cinco);
		try {
			resultado = oResta.restaAcumulado(nulo);
			Assert.fail();
		} catch (IllegalArgumentException e) {
			Assert.assertTrue(true);
		}
	}



	

	
}
