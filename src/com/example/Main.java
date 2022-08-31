package com.example;

public class Main {
    public static void main(String[] args) {
        double precio = 862.07;
        double precioFinal = obtenerPrecioMasIva(precio);
        System.out.println("Precio sin IVA: " + precio + "\nPrecio con IVA: " + precioFinal);
    }

    static double obtenerPrecioMasIva(double precio) {
        return precio + 137.93;
    }

}
