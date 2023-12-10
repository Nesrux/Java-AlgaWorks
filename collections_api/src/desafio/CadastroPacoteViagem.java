package desafio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
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
        Iterator<PacoteViagem> iterator = pacotes.iterator();

        while (iterator.hasNext()) {
            PacoteViagem pacoteViagem = iterator.next();
            if (pacoteViagem.equals(new PacoteViagem(descricao, 0))) {
                iterator.remove();
            } else {
                throw new RuntimeException("Nenhum pacote removido!");
            }
        }


    }

    public PacoteViagem buscarPorDescricao(String descricao) {
        PacoteViagem pacotePretendido = new PacoteViagem(descricao, 0);
        // TODO iterar pacotes com enhanced for, localizar e retornar
        //  pacote com descrição informada (ou lançar exceção se não encontrar)
        for (PacoteViagem pacote : pacotes) {
            if (pacote.equals(pacotePretendido)) {
                return pacote;
            }
        }
        throw new RuntimeException("nenhum pacote encontrado!");
    }
}
