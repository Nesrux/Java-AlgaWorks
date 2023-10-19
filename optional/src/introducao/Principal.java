package introducao;

public class Principal {
    public static void main(String[] args) {
        var servicoReserva = new ServicoReserva();
        var servicoDePagagem = new ServicoBagagem(servicoReserva);

        var voo = new Voo("687521", "Sp-congonhas", "NY");


        servicoReserva.adicionar(new Reserva("2ABCS59Y", voo, "Cleiton"));
        servicoReserva.adicionar(new Reserva("2AB8859W", voo, "João"));
        servicoReserva.adicionar(new Reserva("2ACFTS59", voo, "Maria"));
        servicoReserva.adicionar(new Reserva("87ACSDF", voo, "josefá"));

        servicoDePagagem.contratar("87ACSDF", 48);
        servicoReserva.getReservas().forEach(System.out::println);
    }
}
