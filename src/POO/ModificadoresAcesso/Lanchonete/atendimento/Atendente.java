package POO.ModificadoresAcesso.Lanchonete.atendimento;

public class Atendente {
    public void servindoMesa(){
        System.out.println("Servindo mesa..");
    }
    private void pegarLancheNaCozinha(){
        System.out.println("Pegando lanche na cozinha...");
    }
    public void pegarLancheNoBalcao(){
        System.out.println("Pegando lanche no balcao...");
    }
    public void receberPagamento(){
        System.out.println("Recebendo dinheiro..");
    }
}
