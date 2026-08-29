package com.leonstudios.modelos;

public class Pickup extends Vehiculo {
    private boolean platónAbierto;

    public Pickup(String marca, String modelo) {
        super(marca, modelo);
        this.platónAbierto = false;
    }

    public void abrirPlaton() {
        this.platónAbierto = true;
        System.out.println("🛻 Platón/Caja de carga abierta.");
    }
}