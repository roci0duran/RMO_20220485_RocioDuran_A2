package org.example;

import java.util.List;

public abstract class Torneo extends Peleador {
    private String nombre;
    private List participantes;

    public Torneo(String nombre, long nivelPoder, long vida, String habilidadEspecial, List participantes) {
        this.nombre = nombre;
        this.participantes = participantes;
    }

    @Override
    public String toString(){
        return "Participante: " + getNombre() + " (" + getNivelPoder()+") de poder.";
    }

}

