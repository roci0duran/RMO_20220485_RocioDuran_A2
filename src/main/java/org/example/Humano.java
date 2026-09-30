package org.example;

public abstract class Humano extends Peleador {
    private int ki;

    public Humano(String nombre, long nivelPoder, long vida, String habilidadEspecial,int ki) {
        this.ki = ki;
    }

    public void usarTecnica(){
        System.out.println(getNombre() + " lanza un puñetazo!");;
    }

    public void usarHabilidadEspecial(){
        usarHabilidadEspecial();
    }
}
