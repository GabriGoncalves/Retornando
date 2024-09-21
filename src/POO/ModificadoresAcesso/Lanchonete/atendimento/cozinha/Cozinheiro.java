package POO.ModificadoresAcesso.Lanchonete.atendimento.cozinha;

public class Cozinheiro {

    public void adicionarBebidaNoBalcao(){
        System.out.println("Suco está no balcao!");
    }
    public void adicionarLancheNoBalcao(){
        System.out.println("Lanche está no balcao!");
    }
    public void adicionarComboNoBalcao(){
        System.out.println("Combo está no balcao!");
    }
    private void prepararLanche(){ //Implementar um parametro "String lanche" para identificar qual lanche será feito
//        boolean b = lanche.contains("Hamburguer");
//        boolean a = lanche.contains("Natural");
//        if (a || b){
//        System.out.println("Preparando lanche...");
//        } else {
//            System.out.println("Informe um lanche do cardapio");
//        }
        System.out.println("Preparando lanche...");
    }
    private void prepararSuco(){
        System.out.println("Preparando suco...");
    }
    private void prepararVitamina(){
        System.out.println("Preparando vitamina...");
    }
    private void prepararCombo(){
        prepararLanche();
        prepararVitamina();
    }
    private void selecionarIngredientesLanche(){
        System.out.println("Ingredientes selecionados: Pão, Hamburguer, Salada, Queijo, Ovo...");
    }
    private void selecionarIngredientesVitamina(){
        System.out.println("Ingredientes selecionados: Fruta e leite...");
    }
    private void lavarIngredientes(){
        System.out.println("Lavando ingredientes...");
    }
    private void fritarIngredientesLanche(){
        System.out.println("Fritando Ingredientes do lanche: hamburguer e ovo");
    }
    private void pedirParaTrocarGas(Almoxarife meuAmigo){
        meuAmigo.trocarGas();
    }
    private void pedirIngredientes(Almoxarife almoxarife){
        almoxarife.entregarIngredientes();
    }

}
