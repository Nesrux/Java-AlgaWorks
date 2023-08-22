package aula11;

public class principal {
    public static void main(String[] args) {
        //Iterando arrays multidimensionais
        String[][] cidades = new String[3][];

        cidades[0] = new String[3];
        cidades[1] = new String[2];
        cidades[2] = new String[1];

        cidades[0][0] = "São paulo";
        cidades[0][1] = "São caetano";
        cidades[0][2] = "São josé";

        cidades[1][0] = "Rio de janeiro";
        cidades[1][1] = "Rio de fevereiro";

        cidades[2][0] = "São limão";

        //para cada dimensão do array ´precisa de um for
//        for (int i = 0; i < cidades.length; i++) {
//            for (int j = 0; j < cidades[i].length; j++) {
//                System.out.println(cidades[i][j]);
//            }
//        }
//Usando o enhanced for
        for (String[] cidade : cidades) {
            for (String s : cidade) {
                System.out.println(s);
            }
        }
    }


}
