package provaDesignPattern;

public class NutrienteFactoryImpl implements NutrienteFactory {
    @Override
    public Nutriente create(String nome, String unidade, Double caloriaPorUnidade) {
        return new Nutriente(nome, unidade, caloriaPorUnidade);
    }
}
