package exercicios;

import classes.Aluguel;
import classes.Cidade;

import java.math.BigDecimal;

public class Exer36 {
    public static void main(String[] args) {
        Cidade curitiba = new Cidade("Curitiba", "PR");
        Aluguel c1 = new Aluguel("Fernando", new BigDecimal(1500), curitiba);
        Aluguel c2 = new Aluguel("Fernando", new BigDecimal(1500), curitiba);

        System.out.println(c1);
        System.out.println(c2);

        if(c1 == c2){

            System.out.println("mesmo objeto");
        } else {
            System.out.println("nâo são o mesmo objeto");
        }

        if(c1.equals(c2)) {
            System.out.println("objetos equivalentes");
        } else {
            System.out.println("nâo são objetos equivalentes");
        }
    }
}
