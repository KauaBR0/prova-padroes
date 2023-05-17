package provaDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class ReceitaService {
    private static ReceitaService instance;
    private final List<Receita> receitas = new ArrayList<>();

    private ReceitaService() {}

    public static ReceitaService getInstance() {
        if (instance == null) {
            instance = new ReceitaService();
        }
        return instance;
    }

    public void addReceita(Receita receita) {
        receitas.add(receita);
    }

    public List<Receita> getReceitas() {
        return receitas;
    }
}
