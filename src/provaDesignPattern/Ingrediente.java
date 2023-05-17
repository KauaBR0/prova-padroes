package provaDesignPattern;

public class Ingrediente {
    private String nome;
    private double quantidade;
    private Nutriente nutriente;

    public Ingrediente(String nome, double quantidade, Nutriente nutriente) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.nutriente = nutriente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public Nutriente getNutriente() {
        return nutriente;
    }

    public void setNutriente(Nutriente nutriente) {
        this.nutriente = nutriente;
    }
}
