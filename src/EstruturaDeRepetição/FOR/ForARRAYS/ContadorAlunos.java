package EstruturaDeRepetição.FOR.ForARRAYS;

public class ContadorAlunos {
    public static void main(String[] args) {
         String alunos [] = { "Gabriel" , "Joao" , "Felipe" , "Paulo" };

         for ( int x = 0 ; x < alunos.length ; x++){
             System.out.println("O aluno no indice " + x + " é: " + alunos [x] );
         }
    }
}
