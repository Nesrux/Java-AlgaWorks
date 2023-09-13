package com.unchecked.exception.estoque.exceptions;

public class ProdutoSemEstoqueException extends ProdutoException {
    public ProdutoSemEstoqueException(String message) {
        super(message);
    }

    public ProdutoSemEstoqueException(int qtda) {
        this(String.format("Não é possivel realizar esta operação, pois o estoque deste produto ficara negativo" +
                " atualmente no estoque existe %d unidades desse produto", qtda));
    }
}
