public class IgualdadeString {
    public static void main(String[] args) {
        String nome1 = "João";
        String nome2 = new String("João");

        if (nome1 == nome2) {
            System.out.println("os nomes tem o mesmo endereço de memória");
        } else if (nome1.equals(nome2)) {
            System.out.println("as Strings são iguais, porém não tem o mesmo" +
                    " endereço de memória");
        }


    }
}
