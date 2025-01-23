package Collection.Set.OperacoesBasicas.Desafio;

public class PalavrasUnicas {
    // Atributo
    private String palavras;
    // Construtor
    public PalavrasUnicas(String palavras) {
        this.palavras = palavras;
    }
    // Métodos
    public String getPalavras() {
        return palavras;
    }

    @Override
    public String toString() {
        return "Palavras = " + palavras;
    }
}
