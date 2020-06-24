package classes;

import java.math.BigDecimal;
import java.util.Objects;

public class Aluguel {

        private String cliente;
        private BigDecimal valor;
        private Cidade cidade;

        public Aluguel(String cliente, BigDecimal valor, Cidade cidade) {
            this.cliente = cliente;
            this.valor = valor;
            this.cidade = cidade;
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluguel aluguel = (Aluguel) o;
        return cliente.equals(aluguel.cliente) &&
                valor.equals(aluguel.valor) &&
                cidade.equals(aluguel.cidade);
    }

}

