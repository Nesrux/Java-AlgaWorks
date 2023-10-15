package classes_aninhadas_estaticas.enumAninhado;

import java.util.Comparator;
import java.util.List;

public class Cliente {
    private String nome;
    private int idade;
    private Status status = Status.ATIVO;

    public Cliente(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public static void ordenarPorIdade(List<Cliente> clientes) {
        clientes.sort(new IdadeComparator());
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }

    //Por padrão, ele é static, entao nao precisa colocar
    public enum Status {
        ATIVO, BLOQUEADO
    }

    private static class IdadeComparator implements Comparator<Cliente> {

        @Override
        public int compare(Cliente o1, Cliente o2) {
            return Integer.compare(o1.idade, o2.idade);
        }
    }

}
