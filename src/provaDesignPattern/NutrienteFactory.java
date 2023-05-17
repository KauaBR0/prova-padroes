package provaDesignPattern;

public interface NutrienteFactory {
    Nutriente create(String nome, String unidade, Double caloriaPorUnidade);
}
