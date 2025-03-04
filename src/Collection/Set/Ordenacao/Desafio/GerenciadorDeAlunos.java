package Collection.Set.Ordenacao.Desafio;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorDeAlunos {
    // Atributos :
    private Set<Aluno> alunosSet;

    public GerenciadorDeAlunos() {
        this.alunosSet = new HashSet<>();
    }

    // Métodos :

    public void adicionarAluno(String nome, int nota, int matricula) {
        alunosSet.add(new Aluno(nome, nota, matricula));
    }

    public void removerAluno(int matricula){
        Aluno removerAluno = null;
        if (!alunosSet.isEmpty()){
            for (Aluno alunos : alunosSet){
                if (alunos.getMatricula() == matricula){
                    removerAluno = alunos;
                    break;
                }
            }
            alunosSet.remove(removerAluno);
        } else {
            System.out.println("Aluno não encontrado.");
        }
    }
    public Set<Aluno> exibirAlunosPorNome(){
        Set<Aluno> alunosPorNome = new TreeSet<>(alunosSet); // TreeSet foi usado para deixar de maneira organizada a lista de exibição por nome.
        if (!alunosSet.isEmpty()){
            return alunosPorNome;
        }else {
            throw new RuntimeException("A lista de Alunos está vazia.");
        }
    }
    public Set<Aluno> exibirAlunosPorNota(){
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorPorNota());
        if (!alunosSet.isEmpty()){
            alunosPorNota.addAll(alunosSet);
            return alunosPorNota;
        } else {
            throw new RuntimeException("A lista de alunos está vazia.");
        }
    }
    public void exibirAlunos(){
        if(!alunosSet.isEmpty()){
            System.out.println(alunosSet);
        } else {
            System.out.println("A lista de alunos está vazia.");
        }
    }

    public static void main(String[] args) {
        GerenciadorDeAlunos admAlunos = new GerenciadorDeAlunos();

        admAlunos.exibirAlunos();

        admAlunos.adicionarAluno("Gabriel", 8, 852654);
        admAlunos.adicionarAluno("Evilin", 10, 753951);
        admAlunos.adicionarAluno("Carol", 9, 258456);
        admAlunos.adicionarAluno("Guilherme", 7, 951753);

        admAlunos.exibirAlunos();

        System.out.println("Alunos por nota : ");
        System.out.println(admAlunos.exibirAlunosPorNota());

        admAlunos.removerAluno(951753);

        System.out.println("Aluno removido e ordenado por nome : ");

        System.out.println(admAlunos.exibirAlunosPorNome());


    }
}
