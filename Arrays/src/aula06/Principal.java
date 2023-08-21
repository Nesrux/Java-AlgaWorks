package aula06;


public class Principal {
    public static void main(String[] args) {
        Turma turmaB = new Turma();
        turmaB.identificacao = "Maternal B";
        turmaB.nomeProfessora = "maria almeida da silva";
        turmaB.alunos = new Aluno[3];

        //Criando o aluno de inde 0
        turmaB.alunos[0] = new Aluno();
        turmaB.alunos[0].idade = 1;
        turmaB.alunos[0].nome = "Cleiton hasta para debochar legal da silva";

        //Criando o aluno de indice 1
        Aluno aluno2 = new Aluno();
        aluno2.idade = 5;
        aluno2.nome = "Jascinto pinto";

        //Atribuindo aluno à turma
        turmaB.alunos[1] = aluno2;

        for (int i = 0; i < turmaB.alunos.length; i++) {
            Aluno aluno = turmaB.alunos[i];
            if (aluno != null) {
                System.out.printf("%d ----  %s ----- %d \n", i, aluno.nome, aluno.idade);
            }
        }

        turmaB.imprimirAlunos();
    }
}
