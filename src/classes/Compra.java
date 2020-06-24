package classes;

import java.math.BigDecimal;

public class Compra {
    private String cliente;
    private BigDecimal valor;
    private Cidade cidade;

    public Compra(String cliente, BigDecimal valor, Cidade cidade) {
        this.cliente = cliente;
        this.valor = valor;
        this.cidade = cidade;
    }

    @Override
    public boolean equals(Object obj) {
        // regra 1
        if(obj == null) {
            return false;
        }

        // regra 2
        if(!(obj instanceof Compra)) {
            return false;
        }

        // regra 3
        Compra outro = (Compra) obj;

        // regra 4 e 5
        return this.cliente.equals(outro.cliente) &&
               this.valor.equals(outro.valor) &&
               this.cidade.equals(outro.cidade);
    }
}
