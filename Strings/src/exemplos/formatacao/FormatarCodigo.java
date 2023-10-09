package exemplos.formatacao;

public class FormatarCodigo {
    public static void main(String[] args) {
        //o código precisa ter no minimo 10 caracteres
        //caso nao possua, terá que ser feito um adição de
        //numeros "0" até alcançar os 10 digitos
        int codigo = 1234567890;
        System.out.println(preeencherEsquerda(String.valueOf(codigo), '0', 10));
    }

    public static String preeencherEsquerda(String texto, char caracter, int tamanho) {
        if (texto.length() >= tamanho) {
            throw new IllegalArgumentException("O texto fornecido é maior que o tamanho desejado");
        }
        String caractereRepetido = String.valueOf(caracter).repeat(tamanho - texto.length());

        return caractereRepetido + texto;
    }
}
