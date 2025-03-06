package Collection.Map.Pesquisa.Desafio;

import java.util.HashMap;
import java.util.Map;

public class ContagemDePalavras {
    // Atributos
    Map<String, Integer> contagemPalavras;

    public ContagemDePalavras() {
        this.contagemPalavras = new HashMap<>();
    }

    // Métodos
    public void adicionarPalavra(String palavra, Integer contagem){
        contagemPalavras.put(palavra, contagem);
    }

    public void removerPalavra(String palavra) {
        if (!contagemPalavras.isEmpty()) {
            contagemPalavras.remove(palavra);
        }else {
            System.out.println("A palavra não existe nessa contagem.");
        }
    }

    public void exibirContagemPalavras(){
        System.out.println(contagemPalavras);
    }

    public String encontrarPalavraMaisFrequente(){
        String palavraMaisFrequente = null;
        int maiorContagem = 0;

        if (!contagemPalavras.isEmpty()){
            for (Map.Entry<String, Integer> entry : contagemPalavras.entrySet()) {
                if (entry.getValue() > maiorContagem) {
                    maiorContagem = entry.getValue();
                    palavraMaisFrequente = entry.getKey();
                }
            }
        }else {
            System.out.println("Não há palavras na contagem.");
        }
        return palavraMaisFrequente;
    }

    public static void main(String[] args) {
        ContagemDePalavras palavras = new ContagemDePalavras();

        palavras.exibirContagemPalavras();

        palavras.adicionarPalavra("Java", 10);
        palavras.adicionarPalavra("Python", 9);
        palavras.adicionarPalavra("JS", 8);
        palavras.adicionarPalavra("C#", 7);

        palavras.exibirContagemPalavras();

        System.out.println("Palavra mais frequente: " + palavras.encontrarPalavraMaisFrequente());

        System.out.println("Palavra removida: ");
        palavras.removerPalavra("C#");
        palavras.exibirContagemPalavras();

    }
}
