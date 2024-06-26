
package com.mycompany.coca;

class Alimento extends Producto {
    private String unidadVenta;

    public Alimento(String nombre, double precio, String unidadVenta) {
        super(nombre, precio);
        this.unidadVenta = unidadVenta;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " /// Precio: $" + precio + " /// Unidad de venta: " + unidadVenta;
    }
}