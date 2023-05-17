package provaDesignPattern;

import java.util.List;

public class App {
	public static void main(String[] args) {
        // Criação de nutrientes
        NutrienteFactory factory = new NutrienteCacheFactory(new NutrienteFactoryImpl());
        Nutriente gordura = factory.create("Gordura", "g", 9.0);
        Nutriente proteina = factory.create("Proteína", "g", 4.0);

        // Criação de ingredientes
        Ingrediente ovo = new Ingrediente("Ovo", 50.0, proteina);
        Ingrediente oleo = new Ingrediente("Oleo", 10.0, gordura);

        // Criação de preparo
        PreparoBuilder builder = new PreparoBuilderImpl();
        Preparo ovoFrito = builder
                .addIngrediente(ovo)
                .addIngrediente(oleo)
                .setLowCarb(true)
                .setVegano(false)
                .setSemGluten(true)
                .setSemLactose(true)
                .setTempoMinutos(5)
                .build();

        // Criação de receita
        ReceitaService receitaService = ReceitaService.getInstance();
        Receita ovoFritoReceita = new Receita("Ovo frito", ovoFrito);
        receitaService.addReceita(ovoFritoReceita);

        // Impressão da receita
        List<Receita> receitas = receitaService.getReceitas();
        for (Receita receita : receitas) {
            System.out.println(receita.getNome() + ": " + receita.getPreparo().getTempoMinutos() + " minutos");
            for (Ingrediente ingrediente : receita.getPreparo().getIngredientes()) {
                System.out.println("- " + ingrediente.getNome() + ": " + ingrediente.getQuantidade() + " " + ingrediente.getNutriente().getUnidade());
            }
        }
    }

}
