package Collection.List.Pesquisa.Desafio;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    // Atributo
    private List<Integer> numerosList;
    // Construtor de ums lista de números vazia
    public SomaNumeros(){
        this.numerosList = new ArrayList<>();
    }
    // Métodos
    public void adicionarNumero(int numero){
        numerosList.add(numero);
    }
    public int calcularSoma(){
        int soma = 0;
        for(Integer numero : numerosList){
            soma += numero;
        }
        return soma;
    }
    public int encontrarMaiorNumero() {
        int maiorNumero = Integer.MIN_VALUE;
        if (!numerosList.isEmpty()) {
            for (Integer numero : numerosList) {
                if (numero >= maiorNumero) {
                    maiorNumero = numero;
                }
            }
            return maiorNumero;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }
    public int encontrarMenorNumero(){
        int menorNumero = Integer.MAX_VALUE;
        if(!numerosList.isEmpty()){
            for(Integer numero : numerosList){
                if(numero <= menorNumero){
                    menorNumero = numero;
                }
            }
            return menorNumero;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }
    public void exibirNumeros(){
        if(!numerosList.isEmpty()){
            System.out.println(this.numerosList);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        SomaNumeros numeros = new SomaNumeros();

        numeros.adicionarNumero(10);
        numeros.adicionarNumero(5);
        numeros.adicionarNumero(3);
        numeros.adicionarNumero(2);
        numeros.adicionarNumero(30);

        numeros.exibirNumeros();

        System.out.println(numeros.encontrarMaiorNumero());

        System.out.println(numeros.encontrarMenorNumero());

        System.out.println(numeros.calcularSoma());
    }
}
