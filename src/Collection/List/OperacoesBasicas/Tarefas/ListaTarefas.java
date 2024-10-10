package Collection.List.OperacoesBasicas.Lista;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {

    // Atributo
    private List<Tarefa> tarefaList;

    // Construtor que irá criar uma lista vazia
    public ListaTarefas(){
        this.tarefaList = new ArrayList<>();
    }

    // Métodos
    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }
    public void removerTarefa(String descricao){
       List<Tarefa> tarefaParaRemover = new ArrayList<>();
       for(Tarefa t : tarefaList){
           if(t.getDescricao().equalsIgnoreCase(descricao)){
               tarefaParaRemover.add(t);
           }
       }
       tarefaList.removeAll(tarefaParaRemover);
    }
    public void obterNumeroTotalTarefas(){
        System.out.println(tarefaList.size());
    }
    public void obterDescricoesTarefas (){
        System.out.println(tarefaList);
    }

}
