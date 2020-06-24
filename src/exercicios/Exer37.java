package exercicios;

import classes.Conta;
import classes.OperacaoBancaria;

public class Exer37 {
    public static void main(String[] args) {
        Conta conta = new Conta();
        OperacaoBancaria op1 = new OperacaoBancaria(conta, "pai",200);
        OperacaoBancaria op2 = new OperacaoBancaria(conta, "mae",100);
        OperacaoBancaria op3 = new OperacaoBancaria(conta, "filho",100);
        OperacaoBancaria op4 = new OperacaoBancaria(conta, "filha",100);
        op1.start();
        op2.start();
        op3.start();
        op4.start();
    }
}
