package Collection.Set.OperacoesBasicas.Desafio;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoListaCompras {
    // Atributo
    Set<ListaCompras> listaCompras;
    // Construtor
    public ConjuntoListaCompras() {
        this.listaCompras = new HashSet<>();
    }

    // Implementar métodos:
    // 1 para adicionar item a lista - OK
    // 2 remover item da lista -
    // 3 verificar se item já está na lista - OK
    // 4 exibir os itens da lista - OK
    // 5 contar quantos item existe na lista - OK

    // Métodos :
    public void adicionarItemNaLista(String item) {
        listaCompras.add(new ListaCompras(item));
    }
    public void exibirItensDaLista(){
        System.out.println(listaCompras);
    }
    public void verificarItemExisteNaLista(String item){
        if(listaCompras.contains(item)){
            System.out.println("Este item já está na lista.");
        } else {
            System.out.println("Este item não está na lista.");
        }
    }
    public void contarItensDaLista(){
        if(listaCompras.size() == 0){
            System.out.println("A lista está vazia.");
        } else{
            System.out.println(listaCompras.size());
        }
    }
    public void removerItemDaLista(String item){
        ListaCompras removerItem = null;
        for(ListaCompras l : listaCompras){
            if (l.getItem() == item){
               removerItem = l;
            }
        }
        listaCompras.remove(removerItem);
    }

    public static void main(String[] args) {
        ConjuntoListaCompras conjuntoListaCompras = new ConjuntoListaCompras();

        conjuntoListaCompras.adicionarItemNaLista("Arroz");
        conjuntoListaCompras.verificarItemExisteNaLista("Arroz");
    }
}