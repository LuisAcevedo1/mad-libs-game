package com.LAAG.madlibs.model;

public class MadLibRequest {
    //Representa estructura de datos.
    private String animal;
    private String lugar;
    private String adjetivo;
    private String verbo;

    public MadLibRequest() {}

    public String getAnimal() { return animal; }
    public void setAnimal(String animal) { this.animal = animal; }

    public String getLugar() { return lugar; }
    public void setLugar(String lugar) { this.lugar = lugar; }

    public String getAdjetivo() { return adjetivo; }
    public void setAdjetivo(String adjetivo) { this.adjetivo = adjetivo; }

    public String getVerbo() { return verbo; }
    public void setVerbo(String verbo) { this.verbo = verbo; }
}