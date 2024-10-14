package Collection.List.Pesquisa.CatalogoLivros;

public class Livro {
    // Atributos
    private String titulo;
    private String autor;
    private int anoDePublicacao;

    public Livro(String titulo, String autor, int anoDePublicacao){
        this.titulo = titulo;
        this.autor = autor;
        this.anoDePublicacao = anoDePublicacao;
    }

    @Override
    public String toString() {
        return "Titulo: " + titulo + "\n" +
                "Autor: " + autor + "\n" +
                "Ano de Publicação: " + anoDePublicacao + "\n";
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoDePublicacao() {
        return anoDePublicacao;
    }
}
