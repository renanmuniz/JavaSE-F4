package exercicios;

import java.math.BigInteger;

public class Exer1 {
    public static void main(String[] args) {
        // construção
        BigInteger b1 = BigInteger.valueOf(5000);
        BigInteger b2 = new BigInteger("2000");

        // operação matemática
        BigInteger r1 = b1.add(b2);
        System.out.println("Resultado 1: "+r1);

        BigInteger r2 = b1.subtract(b2);
        System.out.println("Resultado 2: "+r2);

        BigInteger r3 = b1.multiply(b2);
        System.out.println("Resultado 3: "+r3);

        BigInteger r4 = b1.divide(b2);
        System.out.println("Resultado: "+r4);

        // comparação lógica
        if(b1.compareTo(b2) > 0){
            System.out.println("b1 maior");
        }

        if(b2.compareTo(b1) < 0){
            System.out.println("b2 é menor");
        }

        BigInteger b3 = new BigInteger("2000");
        if(b2.compareTo(b3) == 0){
            System.out.println("b2 e b3 são iguais");
        }

    }
}
