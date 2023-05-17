package provaDesignPattern;

public class Receita {
    private String nome;
    private Preparo preparo;

    public Receita(String nome, Preparo preparo) {
        this.nome = nome;
        this.preparo = preparo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Preparo getPreparo() {
        return preparo;
    }

    public void setPreparo(Preparo preparo) {
        this.preparo = preparo;
    }
}
