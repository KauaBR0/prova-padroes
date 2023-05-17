package provaDesignPattern;

public class PreparoBuilderImpl implements PreparoBuilder {
    private final Preparo preparo = new Preparo();

    @Override
    public PreparoBuilder addIngrediente(Ingrediente ingrediente) {
        preparo.getIngredientes().add(ingrediente);
        return this;
    }

    @Override
    public PreparoBuilder setLowCarb(boolean lowCarb) {
        preparo.setLowCarb(lowCarb);
        return this;
    }

    @Override
    public PreparoBuilder setVegano(boolean vegano) {
        preparo.setVegano(vegano);
        return this;
    }

    @Override
    public PreparoBuilder setSemGluten(boolean semGluten) {
        preparo.setSemGluten(semGluten);
        return this;
    }

    @Override
    public PreparoBuilder setSemLactose(boolean semLactose) {
        preparo.setSemLactose(semLactose);
        return this;
    }

    @Override
    public PreparoBuilder setTempoMinutos(int tempoMinutos) {
        preparo.setTempoMinutos(tempoMinutos);
        return this;
    }

    @Override
    public Preparo build() {
        return preparo;
    }
}
