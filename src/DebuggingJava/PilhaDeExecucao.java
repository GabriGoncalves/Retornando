package DebuggingJava;

public class PilhaDeExecucao {
    public static void main(String[] args) {
        System.out.println("Inicio do Programa no método main...");

        a();

        System.out.println("Término do programa no método main.");
    }

    static void a () {
        System.out.println("Iniciou o método 'a'... ");
        b();
        System.out.println("Terminou o método 'a'. ");
    }
        static void b () {
            System.out.println("Iniciou o método 'b'... ");
            for (int i = 0; i <= 5; i++) System.out.println(i);
            c();
            System.out.println("Terminou o método 'b'. ");
        }
        static void c (){
        System.out.println("Iniciou o método 'c'... ");
        Thread.dumpStack();
        System.out.println("Terminou o método 'c'. ");
    }

}