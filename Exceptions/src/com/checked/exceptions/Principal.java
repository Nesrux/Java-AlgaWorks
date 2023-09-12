package com.checked.exceptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Principal {
    public static void main(String[] args) throws IOException {
        Path caminho = Path.of("C:\\Users\\jucaj\\Downloads\\teste.txt");

        Files.createFile(caminho);
        //Sou obrigado a tratar a IOException ou relancar ela;
    }
}
