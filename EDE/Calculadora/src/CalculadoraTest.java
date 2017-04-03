import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculadoraTest {
	Calculadora c;
	
	@Before
	public void antesDelTest(){
		c = new Calculadora();
		System.out.println("Reiniciando calculadora....");
	}

	@Test
	public void sumarTest() {
		float resultado = c.sumar(2,  4);
		System.out.println("2 + 4 = " + resultado);
		assertEquals("Método sumarTest", 6.0, resultado, 0);
	}
	
	@Test
	public void restarTest() {
		float resultado = c.restar(4,  1);
		System.out.println("4 - 1 = " + resultado);
		assertEquals("Método restarTest", 3.0, resultado, 0);
	}
	
	@Test
	public void multiplicarTest() {
		float resultado = c.multiplicar(4,  1);
		System.out.println("4 * 1 = " + resultado);
		assertEquals("Método multiplicarTest", 4.0, resultado, 0);
	}
	
	@Test
	public void dividirTest() {
		float resultado = c.dividir(4,  1);
		System.out.println("4 / 1 = " + resultado);
		assertEquals("Método dividirTest", 4.0, resultado, 0);
	}
}
