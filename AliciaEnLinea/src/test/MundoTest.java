package test;
import modelo.Mundo;

import modelo.Personaje;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class MundoTest {
	


	@Test
	void hayPersonajesNormales_Test() {
		Personaje p1 = new Personaje (1, 505, 1);
		Personaje p2 = new Personaje (2, 45, 564);
		Mundo m1 = new Mundo();
		m1.agregarPersonajes(p1);
		m1.agregarPersonajes(p2);
		
		
		assertEquals(true, m1.hayPersonaNormal());
	}

	@Test
	void cuantosPersonajesNormales_Test() {
		Personaje p1 = new Personaje (1, 505, 1);
		Personaje p2 = new Personaje (2, 45, 564);
		Mundo m1 = new Mundo();
		m1.agregarPersonajes(p1);
		m1.agregarPersonajes(p2);
		
		assertEquals(1, m1.personajesNormales().size());
	}
}
