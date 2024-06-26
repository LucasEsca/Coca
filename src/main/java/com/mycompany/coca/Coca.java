package com.mycompany.coca;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Coca {
    public static void main(String[] args) {
        List<Producto> productos = new ArrayList<>();
        productos.add(new Bebida("Coca-Cola Zero", 1.5, 20));
        productos.add(new Bebida("Coca-Cola", 1.5, 18));
        productos.add(new Shampoo("Shampoo Sedal", 500, 19));
        productos.add(new Alimento("Frutillas", 64, "kilo"));

        for (Producto producto : productos) {
            System.out.println(producto);
        }

        System.out.println("=============================");

        Producto productoMasCaro = Collections.max(productos);
        Producto productoMasBarato = Collections.min(productos);

        System.out.println("Producto más caro: " + productoMasCaro.nombre);
        System.out.println("Producto más barato: " + productoMasBarato.nombre);
    }
}
