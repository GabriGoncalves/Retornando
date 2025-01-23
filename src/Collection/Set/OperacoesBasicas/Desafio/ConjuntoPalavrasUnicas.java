package Collection.Set.OperacoesBasicas.Desafio;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    // Atributo
    private Set<PalavrasUnicas> palavrasUnicasSet;
    // Construtor
    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicasSet = new HashSet<>();
    }
    // Métodos
    public void adicionarPalavra(String palavra){
        palavrasUnicasSet.add(new PalavrasUnicas(palavra));
    }
    public void removerPalavra(String palavra){
        PalavrasUnicas removerPalavra = null;
        for(PalavrasUnicas palavrasUnicas : palavrasUnicasSet){
            if (palavrasUnicas.getPalavras() == palavra){
                removerPalavra = palavrasUnicas;
            }
            palavrasUnicasSet.remove(removerPalavra);
        }
    }
    public void exibirPalavrasUnicas(){
        System.out.println(palavrasUnicasSet);
    }
    public boolean verificarPalavra(String palavra){
        return palavrasUnicasSet.contains(palavra);
    }
}
