package provaDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Preparo {
    private List<Ingrediente> ingredientes = new ArrayList<>();
    private boolean lowCarb;
    private boolean vegano;
    private boolean semGluten;
    private boolean semLactose;
    private int tempoMinutos;

    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public boolean isLowCarb() {
        return lowCarb;
    }

    public void setLowCarb(boolean lowCarb) {
        this.lowCarb = lowCarb;
    }

    public boolean isVegano() {
        return vegano;
    }

    public void setVegano(boolean vegano) {
        this.vegano = vegano;
    }

    public boolean isSemGluten() {
        return semGluten;
    }

    public void setSemGluten(boolean semGluten) {
        this.semGluten = semGluten;
    }

    public boolean isSemLactose() {
        return semLactose;
    }

    public void setSemLactose(boolean semLactose) {
        this.semLactose = semLactose;
    }

    public int getTempoMinutos() {
        return tempoMinutos;
    }

    public void setTempoMinutos(int tempoMinutos) {
        this.tempoMinutos = tempoMinutos;
    }
}
