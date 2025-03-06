package Collection.Map.Pesquisa;

public class Produto {
    // Atributos
    private String nome;
    private int quantidade;
    private double preco;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto: " +
                "nome = " + nome +
                ", Preco=" + preco +
                ", Quantidade = " + quantidade + "\n";
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPreco() {
        return preco;
    }
}
