package POO.GetterSetters.Escola;

public class Escola {
    public static void main(String[] args) {

    Aluno gabriel = new Aluno();
    gabriel.setNome("Gabriel");
    gabriel.setIdade(25);

        System.out.println("O nome do aluno é " + gabriel.getNome() + " e ele tem " + gabriel.getIdade() + " anos.");

    }
}
