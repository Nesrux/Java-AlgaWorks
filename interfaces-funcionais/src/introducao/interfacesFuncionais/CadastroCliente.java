package introducao.interfacesFuncionais;

import java.util.ArrayList;
import java.util.List;

public class CadastroCliente {
    private final List<Cliente> clientes = new ArrayList<>();


    public List<Cliente> getClientes() {
        return clientes;
    }

    public void add(Cliente cliente) {
        this.clientes.add(cliente);
    }

    public List<Cliente> consultar(Filtro<Cliente> filtro) {
        List<Cliente> clientesFiltrados = new ArrayList<>();

        for (Cliente cliente : clientes) {
            if (filtro.avaliar(cliente)) {
                clientesFiltrados.add(cliente);
            }

        }
        return clientesFiltrados;
    }
}
