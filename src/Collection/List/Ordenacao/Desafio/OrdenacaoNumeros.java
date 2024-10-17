package Collection.List.Ordenacao.Desafio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros  {
    // Atributo
    List<Numeros> numerosList;
    // Construtor
    public OrdenacaoNumeros() {
        this.numerosList = new ArrayList<>();
    }
    // Métodos
    public void adicionarNumero(int numero){
        numerosList.add(new Numeros(numero));
    }
    public List exibirLista(){
        if (!numerosList.isEmpty()){
            System.out.println(numerosList);
        }else {
            System.out.println("A lista está vazia!");
        }
        return numerosList;
    }
    public List<Numeros> ordenarAscendente(){
        List<Numeros> ordemAscendente = new ArrayList<>(numerosList);
        Collections.sort(ordemAscendente);
        return ordemAscendente;
    }
    public List<Numeros> ordenarDescendente(){
        List<Numeros> ordemDescendente = new ArrayList<>(numerosList);
        ordemDescendente.sort(Collections.reverseOrder());
        return ordemDescendente;
    }

    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();

        ordenacaoNumeros.exibirLista();

        ordenacaoNumeros.adicionarNumero(25);
        ordenacaoNumeros.adicionarNumero(12);
        ordenacaoNumeros.adicionarNumero(26);
        ordenacaoNumeros.adicionarNumero(24);
        ordenacaoNumeros.adicionarNumero(6);
        System.out.println("Lista atualizada sem ordenação: ");
        ordenacaoNumeros.exibirLista();
        System.out.println("Lista atualizada com ordenação Ascendente: ");
        System.out.println(ordenacaoNumeros.ordenarAscendente());
        System.out.println("Lista atualizada com ordenação Descendente: ");
        System.out.println(ordenacaoNumeros.ordenarDescendente());
    }
}
