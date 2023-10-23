package introducao;

public class Principal2 {
    public static void main(String[] args) {
        var servicoReserva = new ServicoReserva();
        var servicoBagagens = new ServicoBagagem(servicoReserva);
        var voo = new Voo("687521", "Sp-congonhas", "NY");


        servicoReserva.adicionar(new Reserva("2ABCS59Y", voo, "Cleiton"));
        servicoReserva.adicionar(new Reserva("2AB8859W", voo, "João"));
        servicoReserva.adicionar(new Reserva("2ACFTS59", voo, "Maria"));

        servicoBagagens.contratar("2ABCS59Y", 11);
        //
//        servicoReserva.buscar("asdfds")
//                .orElse(null);
//
//        /*OrElseGet devolve uma instancia diferente do selecionado.*/
//        servicoReserva.buscar("456")
//                .orElseGet(() -> new Reserva("455", voo, "gerundina"));
//
//        /*IfPresent e IfpresentOrelse, são metodos autoexplicativos que utilizam os metodos
//         * isPresent e isEmpity da classe Optional, para fazer um If*/
//        servicoReserva.buscar("2ACFTS59")
//                .ifPresent(reserva -> reserva.adicionarBagagens(10));
//
//
//        servicoReserva.buscar("2AB8859W")
//                .ifPresentOrElse(reserva -> reserva.adicionarBagagens(10),
//                        () -> System.out.println("Não presente :/"));
//        //   servicoReserva.getReservas().forEach(System.out::println);
//
//
//        /*Filter é explicativo, ele vai filtrar o optional e verificar usando um predicate
//         * se a condição é valida, se sim ele nao executa o orelsetrhrow*/
//        Reserva reserva = servicoReserva.buscar("2ABCS59Y")
//                .filter(reserva1 -> reserva1.getQuantidadeBagagens() > 10)
//                .orElseThrow(RuntimeException::new);
//
//
        /*O Map, serve para pegar variaveis de intancias ou utilizar métodos dentro da intancia
         * sem precisar atribuir uma nova variavel para executar esse método, ele retorna
         * um outro Optional de outro valor*/

        /*flatMap, é utilizado para "achatar o valor" de um optional, ou seja, quanto
        * existir um Optional<Optional<Passageito>> ele vai retornar direto o proprio
        * passageiro ao invés de um optional<Passageiro> (Au 26.09)*/

        Passageiro passageiro = servicoReserva.buscar("2ABCS59Y")
                .filter(r -> r.getQuantidadeBagagens() > 10)
                .flatMap(Reserva::getPassageiro)
                .orElseThrow(RuntimeException::new);

        System.out.println(passageiro);
    }
}
