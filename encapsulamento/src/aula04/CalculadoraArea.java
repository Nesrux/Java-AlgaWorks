package aula04;

public abstract class CalculadoraArea {
    public static final double PI = Math.PI;

    CalculadoraArea(){}
    public static double calcularAreaQuadrado(double lado) {
        return lado * lado;
    }
    public static double calcularAreaCirculo(double raio){
        return raio * raio * PI;
    }
}
