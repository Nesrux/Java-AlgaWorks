package aula06;

public class Turma {

    String identificacao;
    String nomeProfessora;
    Aluno[] alunos;

    void imprimirAlunos() {
        for (Aluno aluno : alunos) {
            if (aluno != null) {
                System.out.printf("%s tem %d de idade \n", aluno.nome, aluno.idade);
            }
        }
    }

}
