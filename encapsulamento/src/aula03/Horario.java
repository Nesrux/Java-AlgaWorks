package aula03;

public class Horario {
    private int hora;
    private int minuto;

    public Horario(int hora, int minuto) {
        setHora(hora);
        setMinuto(minuto);
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        if (validaHora(hora)) {
            throw new IllegalArgumentException("Hora inválida " + hora);
        }
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        if (validaMinuto(minuto)) {
            throw new IllegalArgumentException("minuto inválido " + minuto);
        }
        this.minuto = minuto;
    }

    private boolean validaHora(int hora) {
        return hora < 0 || hora > 23;
    }

    private boolean validaMinuto(int minuto) {
        return minuto < 0 || minuto > 59;
    }
    public void queHorasSao(){
        System.out.printf("%dH:%dMin", getHora(), getMinuto());
    }
}
