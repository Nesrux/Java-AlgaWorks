import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;

public class Principal {

    public static void main(String[] args) {
        var funcionarios = new ArrayList<Funcionario>();
        funcionarios.add(new Funcionario("João", new BigDecimal("19000"), true));
        funcionarios.add(new Funcionario("Maria", new BigDecimal("5000"), true));
        funcionarios.add(new Funcionario("Manoel", new BigDecimal("13000"), true));
        funcionarios.add(new Funcionario("Sebastião", new BigDecimal("12000"), false));

        // TODO remover funcionários
        funcionarios.removeIf(Funcionario::isInativo);

        // TODO ordenar funcionários pelo valor do salário
        funcionarios.sort(Comparator.comparing(Funcionario::getSalario));

        // TODO iterar e imprimir funcionários usando o método estático imprimir
        funcionarios.forEach(Principal::imprimir);
    }

    private static void imprimir(Funcionario funcionario) {
        // TODO implementar a impressão do nome, salário e impostos (20%)
        BigDecimal descontoSalario = funcionario.getSalario().multiply(new BigDecimal("0.20"));
        System.out.printf("O funcionário %s tem o salario de %.2f e os descontos são %.2f%n", funcionario.getNome(),
                funcionario.getSalario(), descontoSalario);

    }

}