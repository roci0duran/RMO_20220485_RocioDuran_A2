package org.example;

public abstract class Peleador implements IRegenerable, ITransformable, IPeleador {
    private String nombre;
    long nivelPoder;
    public long vida;
    public String habilidadEspecial;

    public Peleador(String nombre, long nivelPoder, long vida, String habilidadEspecial) {
        this.nombre = nombre;
        this.nivelPoder = nivelPoder;
        this.vida = vida;
        this.habilidadEspecial = habilidadEspecial;
    }

    protected Peleador() {
    }

    public String getNombre() {
        return nombre;
    }

    public long getNivelPoder() {
        return nivelPoder;
    }

    public void setNivelPoder(long nivelPoder) {
        this.nivelPoder = nivelPoder;
    }

    public void setHabilidadEspecial(String habilidadEspecial) {
        this.habilidadEspecial = habilidadEspecial;
    }

    public String getHabilidadEspecial() {
        return habilidadEspecial;
    }

    public void mostrarInfo(){
        System.out.println("Nombre: " + nombre + "| Nivel de poder: " + nivelPoder);
        System.out.println("Vida: " + vida + "| Habilidad especial: " + habilidadEspecial);
    }
}

