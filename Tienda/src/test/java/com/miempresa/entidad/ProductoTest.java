package com.miempresa.entidad;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductoTest {
	private Producto producto;
	
	@BeforeEach
	void setUp() throws Exception {
		producto = new Producto("Manzana", 1);
	}

	@Test
	void testGetNombre() {
		String resultadoEsperado = "Manzana";
		String resultadoActual = producto.getNombre();
		assertEquals(resultadoEsperado, resultadoActual);
	}

}
