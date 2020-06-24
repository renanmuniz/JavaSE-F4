package exercicios;

import classes.Pessoa;
import classes.Sistema;

public class Exer28 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.idade = 26;

        Sistema sistema = new Sistema();
        System.out.println(pessoa.idade);
        sistema.executar(pessoa);
        System.out.println(pessoa.idade);

    }

}
