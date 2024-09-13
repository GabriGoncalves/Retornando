package EstruturaCondicionais;

public class SwitchCase {
    public static void main(String[] args) {

        int nota = 11 ;
        String graduacao;

        if (nota < 10 && nota >= 7){
            graduacao = "A";
        } else if (nota < 7 && nota >= 4) {
            graduacao = "B";
        } else if (nota < 4 && nota >= 0) {
            graduacao = "C";
        } else {
           graduacao = "null";
        }


        switch (graduacao){
            case "A" : {
                System.out.println("Você foi aprovado.");
            } break;
            case "B" : {
                System.out.println("Você está de recuperação.");
            } break;
            case "C" : {
                System.out.println("Você está reprovado.");
            } break;
            default :
                System.out.println("Insira uma nota valida.");
        }

    }
}
