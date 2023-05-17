package provaDesignPattern;

public interface PreparoBuilder {
    PreparoBuilder addIngrediente(Ingrediente ingrediente);
    PreparoBuilder setLowCarb(boolean lowCarb);
    PreparoBuilder setVegano(boolean vegano);
    PreparoBuilder setSemGluten(boolean semGluten);
    PreparoBuilder setSemLactose(boolean semLactose);
    PreparoBuilder setTempoMinutos(int tempoMinutos);
    Preparo build();
}
