package Collection.Set.Ordenacao.Desafio;

import java.util.Comparator;
import java.util.Objects;

public class Aluno implements Comparable<Aluno> {
    // Atributos :

    private String nome;
    private int matricula;
    private int nota;

    public Aluno(String nome, int nota, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public int getNota() {
        return nota;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Aluno aluno)) return false;
        return getMatricula() == aluno.getMatricula();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMatricula());
    }

    @Override
    public String toString() {
        return "Aluno : " +
                "Nome = " + nome + ", Nota = " + nota +
                ", Matricula = " + matricula + '\n';
    }


    @Override
    public int compareTo(Aluno aluno) {
        return nome.compareToIgnoreCase(aluno.getNome());
    }

}
class ComparatorPorNota implements Comparator<Aluno> {
    @Override
    public int compare(Aluno aluno1, Aluno aluno2) {
        return Integer.compare(aluno1.getNota(), aluno2.getNota());
    }
}
