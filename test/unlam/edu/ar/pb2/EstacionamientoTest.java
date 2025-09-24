package unlam.edu.ar.pb2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EstacionamientoTest {
	Estacionamiento prueba;
	Coche coche1;

	@BeforeEach
	void setUp() throws Exception {
		prueba = new Estacionamiento("Prueba", 10, 10);
		coche1= new Coche("Suzuki Fun 2010", "ITD734");
	}

	@Test
	void queSeCreeUnEstacionamientoCorrectamente() {
		assertNotNull(prueba);
	}
	
	@Test
	void queSePuedaAgregarUnCocheAlEstacionamiento() {
		assertTrue(prueba.agregarUnCoche(coche1));
	}
	
	@Test
	void queNoSePuedaAgregarDosVecesElMismoCoche() {
		assertTrue(prueba.agregarUnCoche(coche1));
		assertFalse(prueba.agregarUnCoche(coche1));
	}
	
	@Test
	void queSePuedaBuscarUnCocheEnElEstacionamiento() {
		prueba.agregarUnCoche(coche1);
		assertEquals(prueba.encontraCoche("ITD734"), coche1);
	}
	
	@Test
	void queSePuedaBuscarUnCocheEnElEstacionamientoConLaPatenteEnMinuscula() {
		prueba.agregarUnCoche(coche1);
		assertEquals(prueba.encontraCoche("itd734"), coche1);
	}
	
	@Test
	void queSePuedaRetirarUnCocheDelEstacionamiento() {
		prueba.agregarUnCoche(coche1);
		assertTrue(prueba.retirarCoche("itd734"));
	}

}
