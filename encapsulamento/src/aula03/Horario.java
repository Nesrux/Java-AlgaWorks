package aula03;

public class Horario {
    private int hora;
    private int minuto;

    public Horario(int hora, int minuto){
        setHora(hora);
        setMinuto(minuto);
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        if (hora < 0 || hora > 23){
            throw  new IllegalArgumentException("Hora inválida " + hora);
        }
        this.hora = hora;
    }
    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        if (hora < 0 || hora > 23){
            throw  new IllegalArgumentException("Hora inválida " + hora);
        }
        this.minuto = minuto;
    }


}
