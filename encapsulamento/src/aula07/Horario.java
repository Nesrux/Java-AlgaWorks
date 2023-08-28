package aula07;

  record Horario(int hora, int minuto) {

      public Horario{
          if(hora > 24 || hora < 0){
              throw new IllegalArgumentException("Hora inválida");
          }
          if(minuto > 60 || minuto < 0){
              throw new IllegalArgumentException("Hora inválida");
          }

      }
    public String formatar(){
          return String.format("Bazinga! %d", this.hora);
    }
}
