package com.finaly;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Principal {
    public static void main(String[] args) {
        Path arquivo = Path.of("C:\\Users\\jucaj\\Downloads\\teste\\teste.txt");

        try {
            BufferedReader reader = Files.newBufferedReader(arquivo);
            System.out.println(reader.readLine());
            reader.close();
        } catch (IOException e) {
            System.out.println("Erro ao ler arquivo: " + e.getMessage());
        }

    }
}
