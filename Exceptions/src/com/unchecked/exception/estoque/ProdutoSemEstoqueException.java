package com.unchecked.exception.estoque;

public class ProdutoSemEstoqueException extends RuntimeException {
    public ProdutoSemEstoqueException(String message) {
        super(message);
    }

    public ProdutoSemEstoqueException(int qtda) {
        this(String.format("Não é possivel realizar esta operação, pois o estoque deste produto ficara negativo" +
                "atualmente no estoque tem %d", qtda));
    }
}
