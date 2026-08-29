package com.leonstudios.electronica;

public class Estereo {
    private boolean encendido;
    private String emisora = "99.9 FM";

    public void encender() { 
    	this.encendido = true; 
    	System.out.println("📻 Estéreo encendido en " + emisora); 
    	}
    public void apagar() { 
    	this.encendido = false; 
    	System.out.println("📻 Estéreo apagado."); 
    	}
}
