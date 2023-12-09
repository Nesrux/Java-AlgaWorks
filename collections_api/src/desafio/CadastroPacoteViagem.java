package desafio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CadastroPacoteViagem {
    List<PacoteViagem> pacotes = new ArrayList<>();

    public void adicionar(String descricao, double precoDiaria) {
        if (pacotes.contains(new PacoteViagem(descricao, precoDiaria))) {
            throw new IllegalArgumentException("Ja existe esse pacote cadastrado");
        }
        pacotes.add(new PacoteViagem(descricao, precoDiaria));

    }

    public List<PacoteViagem> obterTodos() {
        return pacotes;
    }

    public void ordenar() {
        Collections.sort(pacotes);
    }

    public void ordenarPorPrecoDecrescente() {
        pacotes.sort(new PacoteViagem.PrecoComparator().reversed());
    }

    public void removerPorDescricao(String descricao) {
        // TODO iterar nos pacotes com Iterator e remover aqueles com descrição informada,
        //  lançando exceção se nenhum pacote foi removido
    }

    public PacoteViagem buscarPorDescricao(String descricao) {
        // TODO iterar pacotes com enhanced for, localizar e retornar
        //  pacote com descrição informada (ou lançar exceção se não encontrar)
        return null;
    }

}
