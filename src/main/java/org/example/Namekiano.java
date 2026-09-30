package org.example;


public abstract class Namekiano extends Peleador {
    private String clan;

    public Namekiano(String nombre, long nivelPoder, long vida, String habilidadEspecial, String clan) {
        this.clan = clan;
    }

    public boolean regenerar(){
        return regenerable;
    }

    public void fusionar(){
        System.out.println(getNombre() + " se fusiona!");
    }

}
