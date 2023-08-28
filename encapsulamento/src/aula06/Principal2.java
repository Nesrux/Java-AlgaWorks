package aula06;

 class Principal2 {
    public static void main(String[] args) {
        Horario horario = new Horario(2, 5);
        Agendamento agendamento = new Agendamento(horario, "corte baico na frente e pica atras");

        Horario novoHorario = CalculadoraHorario.somarDuasHoras(horario);
    }
}
