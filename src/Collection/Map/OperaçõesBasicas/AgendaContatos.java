package Collection.Map.OperaçõesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    // Atributo
    private Map <String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    // Métodos

    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        if(!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        } else{
            System.out.println("Contato não existe.");
        }
    }

    public void exibirContatos(){
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if(!agendaContatoMap.isEmpty()){
           numeroPorNome = agendaContatoMap.get(nome);
        } else {
            System.out.println("Contato não existe.");
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos telefone = new AgendaContatos();

        telefone.exibirContatos();

        telefone.adicionarContato("Gabriel", 654852);
        telefone.adicionarContato("Evelin", 852654);
        telefone.adicionarContato("Gabriel", 456852);
        telefone.adicionarContato("Carol", 654852);
        telefone.adicionarContato("Guilherme", 159753);

        telefone.exibirContatos();

        telefone.removerContato("Guilherme");

        telefone.exibirContatos();

        System.out.println("O numero do contato é : " + telefone.pesquisarPorNome("Carol"));
    }
}
