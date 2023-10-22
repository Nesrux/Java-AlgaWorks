package introducao;

public class Principal2 {
    public static void main(String[] args) {
        var servicoReserva = new ServicoReserva();
        var voo = new Voo("687521", "Sp-congonhas", "NY");


        servicoReserva.adicionar(new Reserva("2ABCS59Y", voo, "Cleiton"));
        servicoReserva.adicionar(new Reserva("2AB8859W", voo, "João"));
        servicoReserva.adicionar(new Reserva("2ACFTS59", voo, "Maria"));

        //Or else muda o tipo de retorno
//        Reserva reserva = servicoReserva.buscar("asdfds")
//                .orElse(null);
//
        Reserva reserva = servicoReserva.buscar("456").orElseGet(()-> new Reserva("" +
                "455", voo, "gerundina"));

        System.out.println(reserva);
    }
}
