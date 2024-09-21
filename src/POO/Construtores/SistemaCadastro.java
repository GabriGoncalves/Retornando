package POO.Construtores;

public class SistemaCadastro {
    public static void main(String[] args) {
        Pessoa gabriel = new Pessoa("Gabriel", 159753);

        gabriel.setIdade(25);
        gabriel.setEndereco("Rua Miguel Soares de Leão.. nº259");

        System.out.println("Olá, meu nome é " + gabriel.getNome() + ", e eu tenho " + gabriel.getIdade() + " anos.\n"
                + "Portador do CPF: " + gabriel.getCPF() + "\nResidente no endereço: " + gabriel.getEndereco());

    }
}
