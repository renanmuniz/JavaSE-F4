package classes;

public class Venda {
    public void vender(CartaoCredito tipo, double valor){
        System.out.println("Valor da venda R$"+valor);
        System.out.println("Taxa do cartâo R$"+tipo.toString() + " R$" +tipo.calcularTaxa(valor));
        System.out.println("---------");

    }
}
