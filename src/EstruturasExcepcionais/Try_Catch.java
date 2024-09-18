package EstruturasExcepcionais;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Try_Catch {
    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);

            System.out.println("Digite um numero: ");
            int numero = scan.nextInt();

            System.out.println(numero);
        }catch(InputMismatchException ex){
            System.out.println("Por favor digite com caracteres numéricos");
        }
    }
}
