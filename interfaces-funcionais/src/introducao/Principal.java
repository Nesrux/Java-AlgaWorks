package introducao;

import introducao.interfacesFuncionais.CadastroCliente;
import introducao.interfacesFuncionais.Cliente;
import introducao.interfacesFuncionais.Filtro;

import java.util.List;

public class Principal {
    public static void main(String[] args) {
        var cadastroCliente = new CadastroCliente();
        cadastroCliente.add(new Cliente("joão", 21));
        cadastroCliente.add(new Cliente("Josefá", 81));
        cadastroCliente.add(new Cliente("Gerendio", 65));
        cadastroCliente.add(new Cliente("Hemodrenário da silva", 57));
        cadastroCliente.add(new Cliente("Ruptor divino pereita", 48));
        cadastroCliente.add(new Cliente("Espada do rei destruido augosto motta", 39));

        Filtro<Cliente> filtro = (Cliente cliente) -> cliente.getIdade() > 50;

        List<Cliente> clientes = cadastroCliente.consultar(filtro);
        for (Cliente cliente : clientes) {
            System.out.printf("%s  - %d%n",
                    cliente.getNome(), cliente.getIdade());
        }
    }
}
