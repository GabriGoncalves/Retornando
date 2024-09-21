package POO.Construtores;

public class Pessoa {
    private String nome;
    private int CPF;
    private String endereco;
    private int idade;

    //Construtor
    public Pessoa(String nome, int CPF){
        this.nome = nome;
        this.CPF = CPF;
    }
    // Métodos getter e setters
    public String getNome(){
       return nome;
    }
    public int getCPF(){
        return CPF;
    }
    public String getEndereco(){
        return endereco;
    }
    public int getIdade(){
        return idade;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }

}
