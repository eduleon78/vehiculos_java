package com.leonstudios.modelos;

public class Camion extends Vehiculo {
    private double capacidadCargaToneladas;

    public Camion(String marca, String modelo, double capacidad) {
        super(marca, modelo);
        this.capacidadCargaToneladas = capacidad;
    }

    public void acoplarRemolque() {
        System.out.println("🚛 Remolque acoplado exitosamente a la capacidad de " + capacidadCargaToneladas + "t.");
    }
}
