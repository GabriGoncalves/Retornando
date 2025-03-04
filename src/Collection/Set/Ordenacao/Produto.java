package Collection.Set.Ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable<Produto> {
    // Atributos

    private String nome;
    private double preco;
    private int quantidade;
    private long codigo;

    public Produto(String nome, double preco, int quantidade, long codigo) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public long getCodigo() {
        return codigo;
    }

    @Override
    public int compareTo(Produto produto) {
        return nome.compareToIgnoreCase(produto.getNome());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produto produto)) return false;
        return getCodigo() == produto.getCodigo();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCodigo());
    }

    @Override
    public String toString() {
        return "\n Produto { " +
                "nome = " + nome + ", preco = " + preco +
                ", quantidade = " + quantidade +
                ", codigo = " + codigo +
                " } \n";
    }
}

class ComparatorPorPreco implements Comparator<Produto> {

    @Override
    public int compare(Produto produto1, Produto produto2) {
        return Double.compare(produto1.getPreco(), produto2.getPreco());
    }
}