package com.fabrica_interfaces_graficas.components;

public class ModoOscuroButton implements Button {
    @Override 
    public void render() {
        System.out.println("Botón en Modo Oscuro: Fondo negro, texto blanco.");
    }
}
