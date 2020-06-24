package exercicios;

import classes.CartaoCredito;
import classes.Venda;

public class Exer12 {
    public static void main(String[] args) {
        Venda v1 = new Venda();

        v1.vender(CartaoCredito.VISA,100);
        v1.vender(CartaoCredito.MASTERCARD,100);
        v1.vender(CartaoCredito.AMERICAN_EXPRESS,100);

    }
}
