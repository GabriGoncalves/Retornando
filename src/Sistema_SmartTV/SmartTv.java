package Sistema_SmartTV;

public class SmartTv {
    boolean ligada;
    int canal = 1;
    int volume = 50;

    public void ligar(){
        ligada = true;
        System.out.println("A TV foi ligada");
    }
    public void desligar(){
        ligada = false;
        System.out.println("A TV foi desligada");
    }
    public void aumentarVolume (){
        if(ligada == true){
        volume ++;
        System.out.println("O volume da TV está em: " + volume);
        } else {
            System.out.println("A TV está desligada, não é possivel aumentar o volume.");
        }
    }
    public void diminuirVolume (){
        if(ligada == true){
        volume--;
        System.out.println("O volume da TV está em: " + volume);
        } else {
            System.out.println("A TV está desligada, não é possivel diminuir o volume.");
        }
    }
    public void aumentarCanal(){
        if(ligada == true) {
            canal++;
        System.out.println("O TV está no canal: " + canal);
        } else {
            System.out.println("A TV está desligada, não é possivel mudar o canal.");
        }
    }
    public void diminuirCanal(){
        if(ligada == true){
            canal--;
        System.out.println("O TV está no canal: " + canal);
        } else {
            System.out.println("A TV está desligada, não é possivel mudar o canal.");
        }
    }
    public void mudarCanal (int novoCanal){
        if(ligada == true){
        canal = novoCanal;
        System.out.println("O TV está no canal: " + novoCanal);
        } else {
            System.out.println("A TV está desligada, não é possivel mudar o canal.");
        }
    }
}