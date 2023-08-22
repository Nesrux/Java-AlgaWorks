package aula07;

import java.util.Arrays;

public class Turma {

    String identificacao;
    String nomeProfessora;
    Aluno[] alunos = new Aluno[0];

    void adicionarAluno(Aluno aluno) {
        this.alunos = Arrays.copyOf(this.alunos, this.alunos.length + 1);
        alunos[alunos.length -1] = aluno;
    }

    void imprimirAlunos() {
        for (Aluno aluno : alunos) {
            if (aluno != null) {
                System.out.printf("%s tem %d de idade \n", aluno.nome, aluno.idade);
            }
        }
    }

}
