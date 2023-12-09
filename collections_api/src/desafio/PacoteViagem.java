package desafio;

import java.util.Comparator;
import java.util.Objects;


public class PacoteViagem implements Comparable<PacoteViagem> {
    private String descricao;
    private double precoPorPessoa;

    public PacoteViagem(String descricao, double precoPorPessoa) {
        Objects.requireNonNull(descricao);

        if (precoPorPessoa < 0) {
            throw new IllegalArgumentException("Preço por pessoa não pode ser negativo");
        }

        this.descricao = descricao;
        this.precoPorPessoa = precoPorPessoa;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPrecoPorPessoa() {
        return precoPorPessoa;
    }

    public void setPrecoPorPessoa(double precoPorPessoa) {
        this.precoPorPessoa = precoPorPessoa;
    }

    @Override
    public String toString() {
        return "PacoteViagem{" +
                "descricao='" + descricao + '\'' +
                ", precoPorPessoa=" + precoPorPessoa +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PacoteViagem that = (PacoteViagem) o;

        return descricao.equals(that.descricao);
    }

    @Override
    public int hashCode() {
        return descricao.hashCode();
    }


    @Override
    public int compareTo(PacoteViagem o) {
        return this.descricao.compareTo(o.getDescricao());
    }

    public static class PrecoComparator implements Comparator<PacoteViagem> {

        @Override
        public int compare(PacoteViagem o1, PacoteViagem o2) {
            return Double.compare(o1.getPrecoPorPessoa(), o2.getPrecoPorPessoa());
        }
    }
}
