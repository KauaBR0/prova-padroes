package provaDesignPattern;

import java.util.HashMap;
import java.util.Map;

public class NutrienteCacheFactory implements NutrienteFactory {
    private final Map<String, Nutriente> cache = new HashMap<>();
    private final NutrienteFactory factory;

    public NutrienteCacheFactory(NutrienteFactory factory) {
        this.factory = factory;
    }

    @Override
    public Nutriente create(String nome, String unidade, Double caloriaPorUnidade) {
        if (cache.containsKey(nome)) {
            Nutriente nutriente = cache.get(nome);
            nutriente.setUnidade(unidade);
            nutriente.setCaloriaPorUnidade(caloriaPorUnidade);
            return nutriente;
        } else {
            Nutriente nutriente = factory.create(nome, unidade, caloriaPorUnidade);
            cache.put(nome, nutriente);
            return nutriente;
        }
    }
}
