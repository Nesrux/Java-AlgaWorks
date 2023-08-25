package aula03;

import org.w3c.dom.ls.LSOutput;

public class Principal {
    public static void main(String[] args) {
        Horario horario  = new Horario(7,40);
        horario.queHorasSao();
      //  System.out.println("Hora: " + horario.getHora() + " Minuto: " + horario.getMinuto());
    }

}
