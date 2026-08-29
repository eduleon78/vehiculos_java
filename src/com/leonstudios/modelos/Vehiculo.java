package com.leonstudios.modelos;

import com.leonstudios.conduccion.Operable;
import com.leonstudios.electronica.Estereo;

public abstract class Vehiculo implements Operable {
    protected String marca;
    protected String modelo;
    protected boolean encendido;
    protected boolean lucesEncendidas;
    protected boolean puertasAbiertas;
    protected Estereo estereo;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.estereo = new Estereo();
        this.encendido = false;
        this.lucesEncendidas = false;
        this.puertasAbiertas = false;
    }

    @Override
    public void encender() {
        this.encendido = true;
        System.out.println("🔑 " + marca + " " + modelo + " ha sido encendido.");
    }

    @Override
    public void apagar() {
        this.encendido = false;
        System.out.println("🛑 " + marca + " " + modelo + " ha sido apagado.");
    }

    @Override
    public void encenderLuces() {
        this.lucesEncendidas = true;
        System.out.println("💡 Luces encendidas.");
    }

    @Override
    public void apagarLuces() {
        this.lucesEncendidas = false;
        System.out.println("💡 Luces apagadas.");
    }

    @Override
    public void encenderEstereo() { estereo.encender(); }

    @Override
    public void apagarEstereo() { estereo.apagar(); }

    @Override
    public void abrirPuertas() {
        this.puertasAbiertas = true;
        System.out.println("🚪 Puertas abiertas.");
    }

    @Override
    public void cerrarPuertas() {
        this.puertasAbiertas = false;
        System.out.println("🚪 Puertas cerradas.");
    }

    public String getNombre() {
        return marca + " " + modelo;
    }
}
