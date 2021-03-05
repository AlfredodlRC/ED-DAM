package Pruebacalcu;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import Operaciones.Multiplicacion;

class MultiplicacionTest {

	/*
	 *  Test parametros enteros
	 */
	
	@Test
	void dosPorCincoEnteroTest() {
		int dos = 2;
		int cinco = 5;
		long resultado = 0;
	
		Multiplicacion oMultiplicador = new Multiplicacion();
		resultado = oMultiplicador.multiplicacion(dos, cinco);
		Assert.assertEquals(10, resultado);
	}

	@Test
	void ceroPorCincoEnteroTest() {
		int cero = 0;
		int cinco = 5;
		long resultado = 0;
		Multiplicacion oMultiplicador = new Multiplicacion();
		resultado = oMultiplicador.multiplicacion(cero, cinco);
		Assert.assertEquals(0, resultado);
	}

	@Test
	void dosPorCeroEnteroTest() {
		int dos = 2;
		int cero = 0;
		long resultado = 0;
		Multiplicacion oMultiplicador = new Multiplicacion();
		resultado = oMultiplicador.multiplicacion(dos, cero);
		Assert.assertEquals(0, resultado);
	}

	@Test
	void nuloPorCincoEnteroTest() {
		int nulo = (Integer) null;
		int cinco = 5;
		long resultado = 0;
		Multiplicacion oMultiplicador = new Multiplicacion();
		try {
			resultado = oMultiplicador.multiplicacion(nulo, cinco);
			Assert.fail();
		} catch (IllegalArgumentException e) {
			Assert.assertTrue(true);
		}
	}

	@Test
	void dosPorNuloEnteroTest() {
		int nulo = (Integer) null;
		int dos = 2;
		long resultado = 0;
		Multiplicacion oMultiplicador = new Multiplicacion();
		try {
			resultado = oMultiplicador.multiplicacion(dos,nulo);
			Assert.fail();
		} catch (IllegalArgumentException e) {
			Assert.assertTrue(true);
		}
	}

	@Test
	void NegativoPorPositivoEnteroTest() {
		int dos = -2;
		int cinco = 5;
		long resultado = 0;
	
		Multiplicacion oMultiplicador = new Multiplicacion();
		resultado = oMultiplicador.multiplicacion(dos, cinco);
		Assert.assertEquals(-10, resultado);
		
	}
	
	@Test
	void NegativoPorNegativoEnteroTest() {
		int dos = 2;
		int cinco = -5;
		long resultado = 0;
	
		Multiplicacion oMultiplicador = new Multiplicacion();
		resultado = oMultiplicador.multiplicacion(dos, cinco);
		Assert.assertEquals(-10, resultado);

	}
	
	@Test
	void DosNegativosEnteroTest() {
		int dos = -2;
		int cinco = -5;
		long resultado = 0;
	
		Multiplicacion oMultiplicador = new Multiplicacion();
		resultado = oMultiplicador.multiplicacion(dos, cinco);
		Assert.assertEquals(10, resultado);

	}
	


	
	/*
	 *  Test parametros reales
	 */
	
	@Test
	void dosPorCincoRealTest() {
		double dos = 2;
		double cinco = 5;
		double resultado = 0;
		Multiplicacion oMultiplicador = new Multiplicacion();		
		resultado = oMultiplicador.multiplicar(dos, cinco);
		Assert.assertEquals(10, resultado, 0.00001);
	}

	@Test
	void ceroPorCincoRealTest() {
		double cero = 0;
		double cinco = 5;
		double resultado = 0;
		Multiplicacion oMultiplicador = new Multiplicacion();
		resultado = oMultiplicador.multiplicar(cero, cinco);
		Assert.assertEquals(0, resultado, 0.00001);
	}

	@Test
	void dosPorCeroRealTest() {
		double dos = 2;
		double cero = 0;
		double resultado = 0;
		Multiplicacion oMultiplicador = new Multiplicacion();
		resultado = oMultiplicador.multiplicar(dos, cero);
		Assert.assertEquals(0, resultado, 0.00001);
	}

	@Test
	void nuloPorCincoRealTest() {
		double nulo = (Integer) null;
		double cinco = 5;
		double resultado = 0;
		Multiplicacion oMultiplicador = new Multiplicacion();
		try {
			resultado = oMultiplicador.multiplicar(nulo, cinco);
			Assert.fail();
		} catch (IllegalArgumentException e) {
			
		}
	}

	@Test
	void dosPorNuloRealTest() {
		double nulo = (Double) null;
		double dos = 2;
		double resultado = 0;
		Multiplicacion oMultiplicador = new Multiplicacion();
		try {
			resultado = oMultiplicador.multiplicar(dos,nulo);
			Assert.fail();
		} catch (IllegalArgumentException e) {
			Assert.assertTrue(true);
		}
	}

	@Test
	void NegativoPorPositivoRealTest() {
		double dos = -2;
		double cinco = 5;
		double resultado = 0;
		Multiplicacion oMultiplicador = new Multiplicacion();		
		resultado = oMultiplicador.multiplicar(dos, cinco);
		Assert.assertEquals(-10, resultado, 0.00001);
		
	}
	
	@Test
	void NegativoPorNegativoRealTest() {
		double dos = 2;
		double cinco = -5;
		double resultado = 0;
		Multiplicacion oMultiplicador = new Multiplicacion();		
		resultado = oMultiplicador.multiplicar(dos, cinco);
		Assert.assertEquals(-10, resultado, 0.00001);

	}
	
	@Test
	void DosNegativosRealTest() {
		double dos = -2;
		double cinco = -5;
		double resultado = 0;
		Multiplicacion oMultiplicador = new Multiplicacion();		
		resultado = oMultiplicador.multiplicar(dos, cinco);
		Assert.assertEquals(10, resultado, 0.00001);

	}
	


	/*
	 *  Test tres parametros
	 */
	
	@Test
	void dosPorCincoPorVeinte3ElementosTest() {
		double dos = 2;
		double cinco = 5;
		double veinte = 20;
		double resultado = 0;
		Multiplicacion oMultiplicador = new Multiplicacion();		
		resultado = oMultiplicador.multiplicacionLarga(dos, cinco, veinte);
		Assert.assertEquals(200, resultado, 0.00001);
	}

	@Test
	void ceroPorCincoPorVeinte3ElementosTest() {
		double cero = 0;
		double cinco = 5;
		double veinte = 20;
		double resultado = 0;
		Multiplicacion oMultiplicador = new Multiplicacion();
		resultado = oMultiplicador.multiplicacionLarga(cero, cinco, veinte);
		Assert.assertEquals(0, resultado, 0.00001);
	}

	@Test
	void dosPorCeroPorCincoPorVeinte3ElementosTest() {
		double cero = 0;
		double dos = 2;
		double veinte = 20;
		double resultado = 0;
		Multiplicacion oMultiplicador = new Multiplicacion();
		resultado = oMultiplicador.multiplicacionLarga(dos,cero, veinte);
		Assert.assertEquals(0, resultado, 0.00001);
	}

	@Test
	void dosPorCincoPorCero3ElementosTest() {
		double dos = 2;
		double cinco = 5;
		double cero = 0;
		double resultado = 0;
		Multiplicacion oMultiplicador = new Multiplicacion();
		resultado = oMultiplicador.multiplicacionLarga(dos, cinco, cero);
		Assert.assertEquals(0, resultado, 0.00001);
	}

	@Test
	void nuloPorCincoPorVeinte3ElementosTest() {
		double veinte = 20;
		double nulo = (Integer) null;
		double cinco = 5;
		double resultado = 0;
		Multiplicacion oMultiplicador = new Multiplicacion();
		try {
			resultado = oMultiplicador.multiplicacionLarga(nulo, cinco, veinte);
			Assert.fail();
		} catch (IllegalArgumentException e) {
			Assert.assertTrue(true);
		}
	}

	@Test
	void dosPorNuloPorVeinte3ElementosTest() {
		double nulo = (Double) null;
		double dos = 2;
		double veinte = 20;
		double resultado = 0;
		Multiplicacion oMultiplicador = new Multiplicacion();
		try {
			resultado = oMultiplicador.multiplicacionLarga(dos,nulo,veinte);
			Assert.fail();
		} catch (IllegalArgumentException e) {
			Assert.assertTrue(true);
		}
	}

	@Test
	void dosPorCincoPorNulo3ElementosTest() {
		double nulo = (Double) null;
		double dos = 2;
		double cinco = 5;
		double resultado = 0;
		Multiplicacion oMultiplicador = new Multiplicacion();
		try {
			resultado = oMultiplicador.multiplicacionLarga(dos,cinco,nulo);
			Assert.fail();
		} catch (IllegalArgumentException e) {
			Assert.assertTrue(true);
		}
	}
	
	@Test
	void PrimerNegativo3ElementosTest() {
		double dos = -2;
		double cinco = 5;
		double veinte = 20;
		double resultado = 0;
		Multiplicacion oMultiplicador = new Multiplicacion();		
		resultado = oMultiplicador.multiplicacionLarga(dos, cinco, veinte);
		Assert.assertEquals(-200, resultado, 0.00001);
		
	}
	
	@Test
	void SegundoNegativo3ElementosTest() {
		double dos = 2;
		double cinco = -5;
		double veinte = 20;
		double resultado = 0;
		Multiplicacion oMultiplicador = new Multiplicacion();		
		resultado = oMultiplicador.multiplicacionLarga(dos, cinco, veinte);
		Assert.assertEquals(-200, resultado, 0.00001);
		
	}
	
	@Test
	void TerceroNegativo3ElementosTest() {
		double dos = 2;
		double cinco = 5;
		double veinte = -20;
		double resultado = 0;
		Multiplicacion oMultiplicador = new Multiplicacion();		
		resultado = oMultiplicador.multiplicacionLarga(dos, cinco, veinte);
		Assert.assertEquals(-200, resultado, 0.00001);

	}
	
	@Test
	void DosPrimerosNegativos3ElementosTest() {
		double dos = -2;
		double cinco = -5;
		double veinte = 20;
		double resultado = 0;
		Multiplicacion oMultiplicador = new Multiplicacion();		
		resultado = oMultiplicador.multiplicacionLarga(dos, cinco, veinte);
		Assert.assertEquals(200, resultado, 0.00001);

	}
	
	@Test
	void DosUltimosNegativos3ElementosTest() {
		double dos = 2;
		double cinco = -5;
		double veinte = -20;
		double resultado = 0;
		Multiplicacion oMultiplicador = new Multiplicacion();		
		resultado = oMultiplicador.multiplicacionLarga(dos, cinco, veinte);
		Assert.assertEquals(200, resultado, 0.00001);

	}
	
	@Test
	void PrimeroUltimoNegativos3ElementosTest() {
		double dos = -2;
		double cinco = 5;
		double veinte = -20;
		double resultado = 0;
		Multiplicacion oMultiplicador = new Multiplicacion();		
		resultado = oMultiplicador.multiplicacionLarga(dos, cinco, veinte);
		Assert.assertEquals(200, resultado, 0.00001);

	}
	
	@Test
	void TodosNegativos3ElementosTest() {
		double dos = -2;
		double cinco = -5;
		double veinte = -20;
		double resultado = 0;
		Multiplicacion oMultiplicador = new Multiplicacion();		
		resultado = oMultiplicador.multiplicacionLarga(dos, cinco, veinte);
		Assert.assertEquals(-200, resultado, 0.00001);

	}
	

	

	/*
	 * test Potencia 
	 */
	
	
	@Test
	void dosElevadoCincoTest() {
		int dos = 2;
		int cinco = 5;
		long resultado;
		Multiplicacion oMultiplicador = new Multiplicacion();
		resultado = oMultiplicador.potencia(dos, cinco);
		Assert.assertEquals(32, resultado);
		
	}

	@Test
	void CincoElevadoDosTest() {
		int dos = 2;
		int cinco = 5;
		long resultado;
		Multiplicacion oMultiplicador = new Multiplicacion();
		resultado = oMultiplicador.potencia(cinco,dos);
		Assert.assertEquals(25, resultado);
		
	}
	
	@Test
	void basePositivaTest() {
		//Si la base es positiva, el resultado es positivo
		int dos = 2;
		int cinco = 5;
		long resultado;
		Multiplicacion oMultiplicador = new Multiplicacion();
		resultado = oMultiplicador.potencia(dos, cinco);
		Assert.assertEquals(32, resultado);
		
	}


	@Test
	void exponenteParTest() {
		 // el resultado es positivo si el exponente es par y negativo si es impar.
		int dos = 2;
		int cinco = 5;
		long resultado;
		Multiplicacion oMultiplicador = new Multiplicacion();
		resultado = oMultiplicador.potencia(cinco,dos);
		Assert.assertEquals(32, resultado);

	}
	
	@Test
	void exponenteImparTest() {
		 // el resultado es positivo si el exponente es par y negativo si es impar.
		int dos = 2;
		int cinco = 5;
		long resultado;
		Multiplicacion oMultiplicador = new Multiplicacion();
		resultado = oMultiplicador.potencia(dos, cinco);
		Assert.assertEquals(-32, resultado);
		
	}

	@Test
	void exponenteNegativoTest() {
		//Si el exponente es negativo provocará una excepción.
		int menosDos = -2;
		int cinco = 5;
		long resultado;
		Multiplicacion oMultiplicador = new Multiplicacion();
		try {
			resultado = oMultiplicador.potencia(cinco,menosDos);
			Assert.fail();
		} catch (IllegalArgumentException e) {
			Assert.assertTrue(true);
		}

	}
	 
	@Test
	void baseNulaTest() {
		 // Si el parametros de entrada es null o no está inicializado
		 // se generará una excepcion IllegalArgumentException.
		int nulo = (Integer)null; 
		int cinco = 5;
		long resultado;
		Multiplicacion oMultiplicador = new Multiplicacion();
		try {
			resultado = oMultiplicador.potencia(nulo,cinco);
			Assert.fail();
		} catch (IllegalArgumentException e) {
			Assert.assertTrue(true);
		}
		 
	 }
	 
	@Test
	 void ExponenteNuloTest() {
		 // Si el parametros de entrada es null o no está inicializado
		 // se generará una excepcion IllegalArgumentException.
		int nulo = (Integer)null; 
		int cinco = 5;
		long resultado;
		Multiplicacion oMultiplicador = new Multiplicacion();
		try {
			resultado = oMultiplicador.potencia(cinco,nulo);
			Assert.fail();
		} catch (IllegalArgumentException e) {
			Assert.assertTrue(true);
		}
		 
	 }

}
