package aula09;

import java.util.ArrayList;
import java.util.Arrays;

public class Turma {

    String identificacao;
    String nomeProfessora;
   ArrayList<Aluno> alunos = new ArrayList<>();

    void adicionarAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }

    void imprimirAlunos() {
        alunos.forEach(aluno -> System.out.println(aluno.nome) );
    }

}
