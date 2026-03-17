package com.miempresa.entidad;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TiendaTest {
	private Tienda tienda;

	@BeforeEach
	void setUp() throws Exception {
		tienda = new Tienda();
	}
	
    @Test
    void testAgregarProducto() {
    	//Inicializamos el producto que vamos a añadir
        Producto producto = new Producto("Pan", 1.5);
        //Agregamos el producto a la lista
        tienda.agregarProducto(producto);
        //Comparamos resultados
        List<Producto> productos = tienda.obtenerProductos();
        assertEquals(1, productos.size());
        assertEquals("Pan", productos.get(0).getNombre());
    }

    @Test
    void testObtenerProducto() {
    	tienda.agregarProducto(new Producto("Pan", 0));
    	List<Producto> productos = tienda.obtenerProductos();
    	productos.clear();
    	assertEquals(1, tienda.obtenerProductos().size());
    }
    
    @Test
    void testCalcularPrecioTotal() {
    	Producto p1 = new Producto("Pan", 1.0);
    	Producto p2 = new Producto("Huevo", 1.0);
    	
    	double resultadoActual = tienda.calcularPrecioTotal();
    	double resultadoEsperado = 2.0;
    	assertEquals(resultadoEsperado, resultadoActual);
    }
}
