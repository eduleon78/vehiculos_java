package com.leonstudios.modelos;

//1. Debe incluir "extends Vehiculo"
public class Auto extends Vehiculo {

 // 2. Debe definir el constructor que recibe marca y modelo
 public Auto(String marca, String modelo) {
     // Invoca al constructor de la clase abstracta Vehiculo
     super(marca, modelo);
 }

 // Métodos específicos opcionales para Auto
 public void usarModoEco() {
     System.out.println("🌱 Modo ECO activado.");
 }
}