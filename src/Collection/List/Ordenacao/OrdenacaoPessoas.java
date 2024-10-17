package Collection.List.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    // Atributo
    private List<Pessoa> pessoaList;

    // Construtor (Lista Vazia)
    public OrdenacaoPessoas() {
        this.pessoaList = new ArrayList<>();
    }
    //Métodos
    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }
    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }
    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoaPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoaPorAltura, new ComparatorPorAltura());
        return pessoaPorAltura;
    }
// Testar Métodos
    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

        ordenacaoPessoas.adicionarPessoa("Gabriel", 25,1.83);
        ordenacaoPessoas.adicionarPessoa("Evelin", 21,1.65);
        ordenacaoPessoas.adicionarPessoa("Caroline",13,1.68);
        ordenacaoPessoas.adicionarPessoa("Erivaldo",45,1.82);

        System.out.println("Ordenando por Altura: ");
        System.out.println(ordenacaoPessoas.ordenarPorAltura());

        System.out.println("Ordenando por Idade");
        System.out.println(ordenacaoPessoas.ordenarPorIdade());
    }
}
