package POO.TestePessoa;

public class Pessoa implements Açao{

    private String nome;
    private int idade;
    private double altura;
    private double peso;

    public Pessoa(String nome, int idade, double altura, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNome(){
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public double getAltura(){
        return altura;
    }
    public double getPeso(){
        return peso;
    }

    @Override
    public void comer(String comida) {
        peso ++;
    }

}
