package unlam.edu.ar.pb2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CocheTest {

	Coche prueba;
	
	@BeforeEach
	void setUp(){
		prueba = new Coche("Peugeot 206", "ITD734");
	}

	@Test
	void queSePuedaCrearUnCoche() {
		assertNotNull(prueba);;
	}
	
	@Test
	void queSePuedaCompararLaPatente() {
		assertEquals(prueba.getPatente(),"ITD734");
	}

}
