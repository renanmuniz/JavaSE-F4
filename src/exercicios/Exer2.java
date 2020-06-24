package exercicios;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Exer2 {
    public static void main(String[] args) {
        // construção
        BigDecimal b1 = new BigDecimal(5000);
        BigDecimal b2 = new BigDecimal("200");
        BigDecimal b3 = new BigDecimal(150.50);




        // operação matemática
        BigDecimal r1 = b1.add(b2);
        System.out.println(r1);

        BigDecimal r2 = b1.subtract(b2);
        System.out.println(r2);

        BigDecimal r3 = b1.multiply(b2);
        System.out.println(r3);

        BigDecimal r4 = b1.divide(b2);
        System.out.println(r4);


        //operação lógica
        if(b1.compareTo(b2) > 0){
            System.out.println("b1 maior");
        }

        if(b2.compareTo(b1) < 0){
            System.out.println("b2 é menor");
        }

        BigDecimal b4 = new BigDecimal("200");
        if(b2.compareTo(b4) == 0){
            System.out.println("b2 e b4 são iguais");
        }
    }
}
