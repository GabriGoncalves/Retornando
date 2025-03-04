package Collection.Set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProduto {
    // Atributo
    private Set<Produto> produtoSet;

    public CadastroProduto() {
        this.produtoSet = new HashSet<>();
    }

    // Métodos
    public void adicionarProduto(String nome, double preco, int quantidade, long codigo) {
        produtoSet.add(new Produto(nome, preco, quantidade, codigo));
        // Pensar em uma verificação caso o produto já exista no estoque aumentar a quantidade, e caso ainda não exista criar novo produto.
    }

    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet); // TreeSet foi usado para deixar de maneira organizada a lista de exibição por nome.
        if (!produtoSet.isEmpty()){
            return produtosPorNome;
        }else {
           throw new RuntimeException("A lista de produtos está vazia.");
        }
    }

    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        if (!produtoSet.isEmpty()){
            produtosPorPreco.addAll(produtoSet);
            return produtosPorPreco;
        } else {
            throw new RuntimeException("A lista de produtos está vazia.");
        }
    }


    public static void main(String[] args) {
        CadastroProduto cadProduto = new CadastroProduto();

        System.out.println(cadProduto.produtoSet);
        System.out.println("Lista de Produtos: ");
        cadProduto.adicionarProduto("Garrafa", 10, 5,5397);
        cadProduto.adicionarProduto("Garrafa", 8, 4,5397);
        cadProduto.adicionarProduto("Lata", 9, 9,5498);
        cadProduto.adicionarProduto("Copo", 4, 6,5908);

        System.out.println(cadProduto.produtoSet);

        System.out.println("Testando Exibir produto por nome: ");
        System.out.println(cadProduto.exibirProdutosPorNome());

        System.out.println("Testando Exibir produto por preço: ");
        System.out.println(cadProduto.exibirProdutosPorPreco());
    }
}
