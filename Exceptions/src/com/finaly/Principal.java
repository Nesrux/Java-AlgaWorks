package com.finaly;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Principal {
    public static void main(String[] args) {
        Path arquivo = Path.of("C:\\Users\\jucaj\\Downloads\\teste\\teste.txt");

        BufferedReader reader = null;
        try {
            reader = Files.newBufferedReader(arquivo);
            System.out.println(reader.readLine());
        } catch (IOException e) {
            System.out.println("Erro ao ler arquivo: " + e.getMessage());
        } finally {
            //try if resource
            /*Esse bloco vais ser executado indiferentemente de der uma exception ou não,
             * é como se fosse os "filnalmentes", e por segurança nunca relance outra exception dentro
             * do finally, pois essa exeprion vai sobrescrever a primeira exception
             * finally geralmente é feito quando indifirentemente da processo, seja dando uma execption
             * ou não, precisa ser executado outro método, como por exemplo o sacnner.close() ou reader.close */

            try {
                reader.close();
            } catch (IOException e) {
                System.out.println("Erro");
            }
        }

    }
}
