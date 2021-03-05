import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DivisionTest {

	@Test
	void laDivisionDeDiezentreDosDebeSerCinco() {
		//1-Arrange
		int denominador = 10;
		int divisor = 2;
		long resultadoEsperado = 5;
		//2-Act
		long resultadoObtenido = denominador / divisor;
		//3-Assert
		assertEquals(resultadoEsperado, resultadoObtenido, "la division de 10 entre 2 debe ser 5");
		
	}

	@Test
	void laDivisionDeUnNegativoYUunPositivoDebeSerNegativo() {
		//1-Arrange
		int denominador = -10;
		int divisor = 2;
		long resultadoEsperado = -5;
		//2-Act
		long resultadoObtenido = denominador / divisor;
		//3-Assert
		assertEquals(resultadoEsperado, resultadoObtenido, "la division de un negativo entre un positivo debe ser negativo");
		
	}
	@Test
	void Denominador0() {
		//1-Arrange
		int denominador = 0;
		int divisor = 2;
		long resultadoEsperado = 0;
		//2-Act
		long resultadoObtenido = denominador / divisor;
		//3-Assert
		assertEquals(resultadoEsperado, resultadoObtenido, "si el denominador es 0 el resultado debe ser 0");
	}
	
	@Test
	void NumeroInverso() {
		//1-Arrange
		double numero= 5;
		double resultadoEsperado = 0.20;
		//2-Act
		double resultadoObtenido = 1 / numero;
		//3-Assert
		assertEquals(resultadoEsperado, resultadoObtenido, "El Numero inverso debe ser 0,20");
	}
	@Test
	void NumeroInversoNegativo() {
		//1-Arrange
		double numero= -5;
		double resultadoEsperado = -0.20;
		//2-Act
		double resultadoObtenido = 1 / numero;
		//3-Assert
		assertEquals(resultadoEsperado, resultadoObtenido, "El Numero inverso negativo debe ser -0,20");
	}
	//si ponemos 0 , el resultado es infinito, no 0.
	
	@Test
	void NumeroInversoCero() {
		//1-Arrange
		double numero= 0;
		double resultadoEsperado = 0;
		//2-Act
		double resultadoObtenido = 1 / numero;
		//3-Assert
		assertEquals(resultadoEsperado, resultadoObtenido, "El Numero inverso debe ser 0");
	}
	//aquí hay un fallo porque ha puesto parametro en la formula cuando tiene que poner numero//
	// la formula no reconoce 1/2, sino que hay que cambiar al parametro 0,5
	@Test
	void raizcuadrada() {
		//1-Arrange
		double numero= 9;
		double resultadoEsperado = 3;
		//2-Act
		double resultadoObtenido  = Math.pow(numero,0.5);
		//3-Assert
		assertEquals(resultadoEsperado, resultadoObtenido, "La raiz cuadrada de 9 debe ser 3");
	}
	
	
}