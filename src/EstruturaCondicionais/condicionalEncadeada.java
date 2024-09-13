package EstruturaCondicionais;

public class condicionalEncadeada {
    public static void main(String[] args) {

        // Uma estrutura condicional encadeada é quando temos uma else-if entre um IF / ELSE

        int nota = 6;

        if (nota >= 7){
            System.out.println("Aprovado");
        } else if (nota >= 4) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }


    }
}
