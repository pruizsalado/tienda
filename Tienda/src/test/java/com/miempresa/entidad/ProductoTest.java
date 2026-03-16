package com.miempresa.entidad;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductoTest {
	private Producto producto;
	
	@BeforeEach
	void setUp() throws Exception {
		producto = new Producto("Manzana", 1.0);
	}

	@Test
	void testGetNombre() {
		String resultadoEsperado = "Manzana";
		String resultadoActual = producto.getNombre();
		assertEquals(resultadoEsperado, resultadoActual);
	}
	
	@Test
	void testGetPrecio() {
		double resultadoEsperado = 1.0;
		double resultadoActual = producto.getPrecio();
		assertEquals(resultadoEsperado, resultadoActual);
	}
	
	@Test
	void testSetPrecio() {
		producto.setPrecio(0);
		double resultadoEsperado = 0;
		assertEquals(0, resultadoEsperado);
	}
	
	@Test
	void testSetPrecioNegativo() {
        IllegalArgumentException exception = assertThrows(
            IllegalArgumentException.class,
            () -> producto.setPrecio(-5)
        );

        assertEquals("El precio no puede ser negativo: -5.0", 
        		exception.getMessage());
	}
}
