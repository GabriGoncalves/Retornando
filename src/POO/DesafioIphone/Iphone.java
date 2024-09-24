package POO.DesafioIphone;

import java.util.Scanner;

public class Iphone implements Telefone , ReprodutorMusica , NavegadorWeb {
    Scanner scanner = new Scanner(System.in);

    // Métodos de Navegar Web
    @Override
    public void exibirPagina(String url) {
    }

    @Override
    public void atualizarPagina() {
        System.out.println("A pagina está carregando ..");
    }

    @Override
    public void adicionarNovaPagina(String urlNovaPagina) {
    }

    // Métodos do Reprodutor de Música

    @Override
    public void tocar(String musica) {
        System.out.println( musica + "começou a tocar.");
    }

    @Override
    public void pausar() {
        System.out.println("A música parou.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("A nova música escolhida para tocar é: " + musica);
    }

    // Métodos de Telefone
    @Override
    public void ligar(String numero) {
        if (numero.length() != 10){
            System.out.println("Digite um numero válido");
        }else {
            System.out.println("Chamando..." + numero);
        }
    }

    @Override
    public void atender() {
        System.out.println("Alô...");
    }

    @Override
    public void correioDeVoz() {
        System.out.println("Deixe aqui sua mensagem: ");
        String mensagem = scanner.nextLine();
    }
}
