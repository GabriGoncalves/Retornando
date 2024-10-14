package Collection.List.Ordenacao;

public class Pessoa {
    // Atributos
    private String nome;
    private int idade;
    private double altura;
    //Construtor
    public Pessoa(String nome, int idade, double altura){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }
    //Getter
    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }
    public double getAltura(){
        return altura;
    }

}
