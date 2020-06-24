package exercicios;

import classes.Pagamento;

public class Exer9 {
    public static void main(String[] args) {
        Pagamento p1 = Pagamento.BOLETO;
        Pagamento p2 = Pagamento.CARTAO;
        Pagamento p3 = Pagamento.CHEQUE;
        Pagamento p4 = Pagamento.DINHEIRO;

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);

    }
}
