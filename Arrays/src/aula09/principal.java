package aula09;

import java.util.ArrayList;

public class principal {
    public static void main(String[] args) {
        //Array list, da api de collections
        ArrayList<String> alunos = new ArrayList<>();
        alunos.add("Maria");
        alunos.add("joão");

        System.out.println(alunos);
        for (String aluno : alunos) {
            System.out.println(aluno);
        }
        Aluno aluno2 = new Aluno();
        aluno2.idade = 1;
        aluno2.nome = "marcelo";

        Turma turmaA = new Turma();

        turmaA.adicionarAluno(aluno2);
        turmaA.imprimirAlunos();

    }
}
