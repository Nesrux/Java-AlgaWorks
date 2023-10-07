public enum StatusPedido {
    RASCUNHO {
        @Override
        public boolean podeMudarParaCancelado(double valorPedido) {
            return true;
        }
    },
    ENTREGUE {
        @Override
        public boolean podeMudarParaCancelado(double valorPedido) {
            return false;
        }
    },
    CANCELADO {
        @Override
        public boolean podeMudarParaCancelado(double valorPedido) {
            return false;
        }
    },
    EM_ANALISE {
        @Override
        public boolean podeMudarParaCancelado(double valorPedido) {
            return valorPedido < 100;
        }
    },
    EMITIDO(12) {
        @Override
        public boolean podeMudarParaCancelado(double valorPedido) {
            return valorPedido < 100;
        }
    },
    FATURADO(10){
        @Override
        public boolean podeMudarParaCancelado(double valorPedido) {
            return false;
        }
    },
    SEPARADO(5){
        @Override
        public boolean podeMudarParaCancelado(double valorPedido) {
            return false;
        }
    },
    DESPACHADO(2){
        @Override
        public boolean podeMudarParaCancelado(double valorPedido) {
            return false;
        }
    };

    private Integer tempoEmHoras;

    StatusPedido(int tempoEntregueEmHoras) {
        this.tempoEmHoras = tempoEntregueEmHoras;
    }

    StatusPedido() {
    }

    public Integer getTempoEmHoras() {
        return tempoEmHoras;
    }

    public abstract boolean podeMudarParaCancelado(double valorPedido);
}
