package funciones;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class UtilidadesTest {
	
	private static Utilidades u;
	
	@BeforeAll
	static void inicializarUtilidades() {
		u = new Utilidades();
	}

	@Test
	void devuelveNotaTest() {
		
		assertThrows(ArithmeticException.class, ()->u.devuelveNota(-1.5));
		assertThrows(ArithmeticException.class, ()->u.devuelveNota(12.34));
		
		assertEquals("Matrícula", u.devuelveNota(10), "Se espera Matrícula");
		assertEquals("Suspenso", u.devuelveNota(0), "Se espera Suspenso");
		assertEquals("Suspenso", u.devuelveNota(2.3), "Se espera Suspenso");
		assertEquals("Bien", u.devuelveNota(5), "Se espera Bien");
		assertEquals("Bien", u.devuelveNota(6.1), "Se espera Bien");
		assertEquals("Notable", u.devuelveNota(6.5), "Se espera Notable");
		assertEquals("Notable", u.devuelveNota(7), "Se espera Notable");
		assertEquals("Sobresaliente", u.devuelveNota(8.5), "Se espera Sobresaliente");
		assertEquals("Sobresaliente", u.devuelveNota(9.2), "Se espera Sobresaliente");
		
		
		
		
		
		
		
	}

}
