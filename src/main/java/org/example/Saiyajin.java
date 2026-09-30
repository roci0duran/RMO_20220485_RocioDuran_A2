package org.example;

public abstract class Saiyajin extends Peleador {
    private int nivelSSJ = 0;
    private boolean cola;

    public Saiyajin(String nombre, long nivelPoder, long vida, String habilidadEspecial, int nivelSSJ, boolean cola) {
        super(nombre, nivelPoder, vida, habilidadEspecial);
        this.cola = cola;
        this.nivelSSJ = nivelSSJ;
    }

    public int transformar(int nivelSSJ){
        System.out.println(getNombre() + " se transforma a SSJ " + nivelSSJ + "!");
        return nivelSSJ;
    }
}
