package exercicios;

import classes.Cidade;
import classes.Compra;

import java.math.BigDecimal;

public class Exer34 {
    public static void main(String[] args) {
        Compra c1 = new Compra("Fernando", new BigDecimal(1500), new Cidade("Curitiba", "PR"));
        Compra c2 = new Compra("Fernando", new BigDecimal(1500), new Cidade("São Paulo", "SP"));
        Compra c3 = new Compra("Fernando", new BigDecimal(1501), new Cidade("Curitiba", "PR"));
        Compra c4 = new Compra("Fernando", new BigDecimal(1500), new Cidade("Curitiba", "PR"));

        boolean igual = c1.equals(c4);
        System.out.println(igual);


    }
}
