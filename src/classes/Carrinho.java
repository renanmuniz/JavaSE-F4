package classes;

import java.util.ArrayList;

public class Carrinho<P extends Produto> {
    private ArrayList<P> colecao;
    public Carrinho(){
        colecao = new ArrayList<>();
    }

    public void adicionarProduto(P produto){
        colecao.add(produto);
    }

    public String emitirNota(){
        String notaFiscal = "";
        double total = 0;
        for (P item: colecao ) {
            notaFiscal += "Nome: " + item.getNome() + "\n";
            notaFiscal += "Valor R$:" + item.getValor() + "\n";
            notaFiscal += "------------------------------\n";
            total += item.getValor();
        }
        notaFiscal += "Valor Total R$" + total;
        return notaFiscal;
    }
}
