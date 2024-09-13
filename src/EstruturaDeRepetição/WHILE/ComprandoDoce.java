package EstruturaDeRepetição.WHILE;

public class ComprandoDoce {
    public static void main(String[] args) {

        double mesada = 20.0;

        while (mesada > 0){
            double valorDoDoce = 2.5;

            System.out.println("Doce adicionado ao carrinho.");

            mesada = mesada - valorDoDoce;
        }
        System.out.println("Mesada: " + mesada);
        System.out.println("Asaph gastou todo seu dinheiro comprando doce.");
    }
}
