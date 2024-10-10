package Collection.List.OperacoesBasicas.Lista;

public class Testando {
    public static void main(String[] args) {

        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.obterNumeroTotalTarefas();

        listaTarefas.adicionarTarefa("Olhar bebê");
        listaTarefas.adicionarTarefa("Olhar bebê");
        listaTarefas.adicionarTarefa("Comer fora");
        listaTarefas.adicionarTarefa("Estudar");

        listaTarefas.obterNumeroTotalTarefas();

        listaTarefas.removerTarefa("Olhar bebê");

        listaTarefas.obterNumeroTotalTarefas();

        listaTarefas.obterDescricoesTarefas();


    }

}
