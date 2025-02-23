package Collection.Set.Pesquisa;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    // Atributo
    private Set<Contato> contatoSet;
    // Construtor

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    // Métodos
    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }
    public void exibirContatos(){
        System.out.println(contatoSet);
    }
    public int contarContatos(){
        return contatoSet.size();
    }
    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();

    return contatosPorNome;
    }
    public void atualizarNumeroContato(String nome, int NovoNumero){

    }
}
