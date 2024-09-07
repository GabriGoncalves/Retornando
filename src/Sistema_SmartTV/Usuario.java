package Sistema_SmartTV;

public class Usuario {
    public static void main(String[] args) {

        SmartTv smartTv = new SmartTv();

        System.out.println("A minha TV está ligada? " + smartTv.ligada);
        System.out.println("A minha TV está no canal: " + smartTv.canal);
        System.out.println("A minha TV está no volume: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("A minha TV está ligada? " + smartTv.ligada);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println("O volume da minha TV está : " + smartTv.volume);

        smartTv.diminuirVolume();

        smartTv.mudarCanal(4);

        smartTv.desligar();

        smartTv.diminuirCanal();
    }
}
