package Collection.Set.Pesquisa.Desafio;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefas> tarefasSet;

    public ListaTarefas() {
        this.tarefasSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        tarefasSet.add(new Tarefas(descricao));
    }

    public void removerTarefa(String descricao){
        Tarefas tarefaParaRemover = null;
        if(!tarefasSet.isEmpty()) {
            for (Tarefas t : tarefasSet) {
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefaParaRemover = t;
                    break;
                }
            }
            tarefasSet.remove(tarefaParaRemover);
        } else if (tarefaParaRemover == null){
                System.out.println("Tarefa não encontrada!");
            } else {
                System.out.println("O conjunto está vazio.");
            }
    }

    public void exibirTarefas(){
        if (!tarefasSet.isEmpty()){
            System.out.println(tarefasSet);
        } else {
            System.out.println("A lista de tarefas está vazia.");
        }
    }

    public int contaTarefas(){
        return tarefasSet.size();
    }

    public Set<Tarefas> obterTarefasConcluidas(){
        Set<Tarefas> tarefasConcluidas = new HashSet<>();
        for(Tarefas tarefas : tarefasSet){
            if(tarefas.isConcluida()){
                tarefasConcluidas.add(tarefas);
            } else if(tarefasSet.isEmpty()) {
                System.out.println("Nenhuma tarefa foi concluida no momento.");
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefas> obterTarefasPendentes(){
        Set<Tarefas> tarefasPendentes = new HashSet<>();
        for(Tarefas tarefas : tarefasSet){
            if (!tarefas.isConcluida()){
                tarefasPendentes.add(tarefas);
            }
        }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao){
        for( Tarefas tarefas : tarefasSet){
            if (tarefas.getDescricao().equalsIgnoreCase(descricao)){
                tarefas.setConcluida(true);
            }
        }
    }

    public void marcarTarefaPendente(String descricao){
        Tarefas marcarTarefaPendente = null;
        for (Tarefas tarefa : tarefasSet){
            if(tarefa.getDescricao().equalsIgnoreCase(descricao)){
                marcarTarefaPendente = tarefa;
                break;
            }
        }
        if (marcarTarefaPendente != null){
            if (marcarTarefaPendente.isConcluida()){
                marcarTarefaPendente.setConcluida(false);
            }
        } else{
            System.out.println("Tarefa não existe.");
        }
    }

    public void limparListaTarefas(){
        if (tarefasSet.isEmpty()){
            System.out.println("A lista de tarefas está vazia.");
        } else {
            tarefasSet.clear();
        }
    }

    public static void main(String[] args) {
        // Instanciando a classe Lista Tarefas
        ListaTarefas listaTarefas = new ListaTarefas();

        // Adicionando tarefas na lista
        listaTarefas.adicionarTarefa("Lavar Louça");
        listaTarefas.adicionarTarefa("Limpar chão");
        listaTarefas.adicionarTarefa("Ir para academia");
        listaTarefas.adicionarTarefa("Lavar roupa");
        listaTarefas.adicionarTarefa("Trocar água do cachorro");

        // Exibindo a lista de tarefas
        listaTarefas.exibirTarefas();

        // Removendo uma tarefa
        listaTarefas.removerTarefa("Limpar chão");

        // Exibindo nova lista de tarefas
        listaTarefas.exibirTarefas();

        // Contando o número de tarefas da lista
        System.out.println("Total de tarefas na lista é: " + listaTarefas.contaTarefas());

        // Exibir tarefas pendentes
        System.out.println("Tarefas pendentes: " + listaTarefas.obterTarefasPendentes());

        // Marcando tarefas conclduidas
        listaTarefas.marcarTarefaConcluida("Lavar louça");
        listaTarefas.marcarTarefaConcluida("Trocar água do cachorro");

        // Exibindo tarefas concluidas
        System.out.println("Tarefas concluidas: " + listaTarefas.obterTarefasConcluidas());

        // Marcar tarefas pendentes
        listaTarefas.marcarTarefaPendente("Lavar roupa");

        listaTarefas.exibirTarefas();

        // Limpando todas as tarefas
        listaTarefas.limparListaTarefas();

        listaTarefas.exibirTarefas();

    }
}
