package Collection.List.Pesquisa.CatalogoLivros;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    // Atributo
    private List<Livro> livroList;

    // Construtor para uma lista de livros vazia.
    public CatalogoLivros(){
        this.livroList = new ArrayList<>();
    }

    // Métodos
    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }
    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!livroList.isEmpty()){
          for(Livro l : livroList){
             if(l.getAutor().equalsIgnoreCase(autor)){
                 livrosPorAutor.add(l);
             }
          }
        }
        return livrosPorAutor;
    }
    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorAno = new ArrayList<>();
        if(!livroList.isEmpty()){
            for(Livro l : livroList){
                if(l.getAnoDePublicacao() >= anoInicial && l.getAnoDePublicacao() <= anoFinal){
                    livrosPorAno.add(l);
                }
            }
        }
        return livrosPorAno;
    }
    public Livro pesquisarPorTitulo(String titulo){
       Livro livroPorTitulo = null;
       if(!livroList.isEmpty()){
           for (Livro l : livroList){
               if (l.getTitulo().equalsIgnoreCase(titulo)){
                   livroPorTitulo = l;
                   break;
               }
           }
       }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("Livro 1", "Gabriel", 2021);
        catalogoLivros.adicionarLivro("Livro 1", "Evelin", 2022);
        catalogoLivros.adicionarLivro("Livro 2", "Pandora", 2023);
        catalogoLivros.adicionarLivro("Livro 3", "Asaph", 2024);
        catalogoLivros.adicionarLivro("Livro 4", "Evelin", 1999);

        System.out.println(catalogoLivros.pesquisarPorAutor("Evelin"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2021, 2023));
        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 1"));
    }
}
