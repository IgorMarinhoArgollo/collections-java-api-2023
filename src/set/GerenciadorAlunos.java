package set;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {

    private Set<Aluno> alunos;

    public GerenciadorAlunos() {
        this.alunos = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double media) {
        alunos.add(new Aluno(matricula, nome, media));
    }

    public void removerAluno(Long matricula) {
        Aluno alunoParaRemover = null;

        for(Aluno a : alunos) {
            if(Objects.equals(a.getMatricula(), matricula)) {
                alunoParaRemover = a;
                break;
            }
        }
        alunos.remove(alunoParaRemover);
    }

    public void exibirAlunosPorNome() {
        Set<Aluno> alunosPorNome = new TreeSet<>(alunos);
        System.out.println(alunosPorNome);
    }

    public void exibirAlunosPorNota() {
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparablePorNota());
        alunosPorNota.addAll(alunos);
        System.out.println(alunosPorNota);
    }

    public void exibirAlunos() {
        System.out.println(alunos);
    }

    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();
        gerenciadorAlunos.adicionarAluno("Aluno1", 32122L, 8.75);
        gerenciadorAlunos.adicionarAluno("Aluno7", 32123L, 5.75);
        gerenciadorAlunos.adicionarAluno("Aluno3", 32128L, 3.75);
        gerenciadorAlunos.adicionarAluno("AlunoParaRemover", 32125L, 9.75);

        gerenciadorAlunos.exibirAlunos();

        gerenciadorAlunos.removerAluno(32125L);

        gerenciadorAlunos.exibirAlunosPorNome();
        gerenciadorAlunos.exibirAlunosPorNota();
    }
}
