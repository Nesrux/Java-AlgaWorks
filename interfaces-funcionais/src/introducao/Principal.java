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

        /*Boa paratica, por padrão se a expressão lambda tiver mais de 3 linhas
        * é melhor utilizar ela com um método, sempre de preferencia à usar lambda
        * com uma linha só, como no exemplo, para a melhor leitura do código*/

        /*Outra boa pratica é evitar a chamada do tipo da variavel, como
        * ela ja esta parametrizada com o <> nao precisa definir um tipo
        * Cliente Cliente, pois obrigatóriamente a variavel cliente é
        * do tipo Cliente*/

        /*
        * Antes e depois das boas práticas
        * Filtro<Cliente> filtro = (Cliente cliente) ->{
        *  boolean clienteIdade =  cliente.getidade() > 50}
        * return clienteIdade;
        * */
        Filtro<Cliente> filtro = cliente -> cliente.getIdade() > 50;

        List<Cliente> clientes = cadastroCliente.getClientes();

        clientes.sort((cliente1, cliente2) -> Integer.compare(cliente1.getIdade(), cliente2.getIdade()));

        for (Cliente cliente : clientes) {
            System.out.printf("%s  - %d%n",
                    cliente.getNome(), cliente.getIdade());
        }
    }
}
