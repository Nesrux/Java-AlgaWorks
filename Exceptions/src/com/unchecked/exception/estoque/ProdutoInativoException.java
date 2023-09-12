package com.unchecked.exception.estoque;

public class ProdutoInativoException extends RuntimeException {

    public ProdutoInativoException(String mensagem) {
        super(mensagem);
    }

}
