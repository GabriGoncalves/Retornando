package Collection.List.Ordenacao.Desafio;

public class Numeros implements Comparable<Numeros>{
    // Atributo
    private int numeros;
    // Construtor
    public Numeros(int numeros) {
        this.numeros = numeros;
    }
    // Métodos
    @Override
    public int compareTo(Numeros n) {
        return Integer.compare(numeros, n.getNumeros());
    }
    public int getNumeros() {
        return numeros;
    }
    @Override
    public String toString() {
        return "Número: " + numeros;
    }

}
