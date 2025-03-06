package Collection.Map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    // Atributos
    Map<Long, Produto> estoqueProdutoMap;

    public EstoqueProdutos() {
        this.estoqueProdutoMap = new HashMap<>();
    }

    // Métodos
    public void adicionarProduto(long codigo, String nome, double preco, int quantidade){
        estoqueProdutoMap.put(codigo, new Produto(nome, preco, quantidade));
    }
    public void removerProduto(long codigo){
        if (!estoqueProdutoMap.isEmpty()){
            estoqueProdutoMap.remove(codigo);
        }

    }
    public void exibirProdutos(){
        System.out.println(estoqueProdutoMap);
    }
    public double calcularValorTotalEstoque(){
        double valorTotalEstoque = 0;
        if (!estoqueProdutoMap.isEmpty()){
            for (Produto p : estoqueProdutoMap.values()){
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        }else {
            System.out.println("O estoque está vazio, e o valor total dele é: " + valorTotalEstoque);
        }
        return valorTotalEstoque;
    }
    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!estoqueProdutoMap.isEmpty()){
            for (Produto p : estoqueProdutoMap.values()){
                if (p.getPreco() > maiorPreco){
                    produtoMaisCaro = p;
                    maiorPreco = p.getPreco();
                }
            }
        }
        return produtoMaisCaro;
    }
    public Produto obterProdutoMaisBarato(){
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        if (!estoqueProdutoMap.isEmpty()){
            for (Produto produto : estoqueProdutoMap.values()){
                if (produto.getPreco() < menorPreco){
                    produtoMaisBarato = produto;
                    menorPreco = produto.getPreco();
                }
            }
        }
        return produtoMaisBarato;
    }
//    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque(){
//
//    }

    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();

        estoque.exibirProdutos();

        estoque.adicionarProduto(001L, "Fone", 99,4);
        estoque.adicionarProduto(004L, "Mouse", 50,3);
        estoque.adicionarProduto(003L, "Dualshot4", 250,1);
        estoque.adicionarProduto(002L, "Maquina Cortar Cabelo", 100,2);

        estoque.exibirProdutos();

        System.out.println("Valor total do estoque: " + estoque.calcularValorTotalEstoque());

        System.out.println("Produto mais caro: " + estoque.obterProdutoMaisCaro());

        System.out.println("Produto mais barato: " + estoque.obterProdutoMaisBarato());

        System.out.println("Produto Removido: ");

        estoque.removerProduto(003L);

        estoque.exibirProdutos();
    }

}
