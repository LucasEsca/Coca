
package com.mycompany.coca;

class Shampoo extends Producto {
    private double contenido;

    public Shampoo(String nombre, double contenido, double precio) {
        super(nombre, precio);
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " /// Contenido: " + contenido + "ml /// Precio: $" + precio;
    }
}
