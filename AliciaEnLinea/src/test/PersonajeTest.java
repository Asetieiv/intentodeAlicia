package test;

import modelo.Personaje;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PersonajeTest {
	
	@Test
	void esDeMaravillaTest_True() {
		Personaje p1 = new Personaje(4, 952, -240);
		
		assertEquals (true, p1.esDeMaravilla());
	}
	
	@Test
	void esDeMaravillaTest_False() {
		Personaje p2 = new Personaje(2, 52, 34);
		
		assertEquals (false, p2.getubicacion());
	}
	@Test
	void embellecer_Test() {
		Personaje p2 = new Personaje(2, 34, 54);
		p2.setSecretos(100);
		
		assertEquals(100, p2.getSecretos());
		}
}