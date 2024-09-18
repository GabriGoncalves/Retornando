package DebuggingJava;

import java.util.Scanner;

public class Debugging {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String alunos [] = { "Gabriel" , "Levi" , "Joao" , "Pedro" };

        double mediaDaTurma = calculaMediaDaTurma(alunos , scan);

        System.out.println("A média da turma é: " + mediaDaTurma);
    }
    static double calculaMediaDaTurma(String[] alunos , Scanner scan ){
        double soma = 0;
        for (String aluno : alunos){
            System.out.printf("A nota do aluno %s: ", aluno);
            double nota = scan.nextDouble();
            soma += nota;
        }
    return soma / alunos.length ;
    }
}
