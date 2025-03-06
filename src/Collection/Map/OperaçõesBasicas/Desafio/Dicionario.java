package Collection.Map.OperaçõesBasicas.Desafio;

import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    // Atributos

    private Map<String, String> dicionarioMap;

    public Dicionario(){
        this.dicionarioMap = new HashMap<>();
    }

    // Métodos

    public void adicionarPalavra(String palavra, String definicao){
        dicionarioMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra){
        if(!dicionarioMap.isEmpty()){
            dicionarioMap.remove(palavra);
        }
    }

    public void exibirPalavras(){
        System.out.println(dicionarioMap);
    }

    public String pesquisarPorPalavra(String palavra){
        String definicaoPalavra = null;
        if(!dicionarioMap.isEmpty()){
            definicaoPalavra = dicionarioMap.get(palavra);
        } else {
            System.out.println("Esta palavra não existe.");
        }
        return definicaoPalavra;
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.exibirPalavras();

        dicionario.adicionarPalavra("Garrafa", "Objeto utilizado para armazenar liquidos.");
        dicionario.adicionarPalavra("Microondas", "Eletrodomestico utilizado para esquentar alimentos ou liquidos.");
        dicionario.adicionarPalavra("Spider-man", "Personagem animado de filmes, desenhos e jogos.");
        dicionario.adicionarPalavra("Cachorro", "Animal de estimação.");
        dicionario.adicionarPalavra("Veneno", "Substancia toxica que pode levar a morte.");

        dicionario.exibirPalavras();

        System.out.println(dicionario.pesquisarPorPalavra("Spider-man"));

        dicionario.removerPalavra("Cachorro");

        dicionario.exibirPalavras();
    }
}
