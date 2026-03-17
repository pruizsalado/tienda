package com.miempresa.entidad;

import java.util.ArrayList;
import java.util.List;

/**
 * La clase Tienda representa una tienda que contiene una lista de productos.
 * Proporciona métodos para agregar productos, obtener la lista de productos
 * y calcular el precio total de todos los productos en la tienda.
 * 
 * @author Pablo
 * @version 1.0
 */
public class Tienda {
	/**
	 * Lista interna que almacena los productos de la tienda.
	 */
    private List<Producto> productos;
    
    /**
     * Constructor de tienda.
     * Crea una lista vacía.
     */
    public Tienda() {
        this.productos = new ArrayList<>();
    }
    
    /**
     * Agrega un producto a la tienda.
     * 
     * @param p el producto a agregar. No puede ser null.
     */
    public void agregarProducto(Producto p) {
        productos.add(p);
    }
    
    /**
     * 
     * @return Devuelve una copia de la lista interna de productos.
     */
    public List<Producto> obtenerProductos() {
        return new ArrayList<>(productos);
    }
    
    /**
     * 
     * @return devuelve un double que es la suma total del precio de los productos en la tienda.
     */
    public double calcularPrecioTotal() {
        return productos.stream().mapToDouble(Producto::getPrecio).sum();
    }
}