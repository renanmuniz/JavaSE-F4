package exercicios;

import classes.Funcionario;

import java.math.BigDecimal;
import java.util.*;

public class Exer31 {
    public static void main(String[] args) {
        List<Funcionario> lista = new ArrayList<>();
        lista.add(new Funcionario("Fernando",37,new BigDecimal(1000)));
        lista.add(new Funcionario("Fabio",25,new BigDecimal(1100)));
        lista.add(new Funcionario("Augusto",42,new BigDecimal(1200)));
        lista.add(new Funcionario("Bianca",19,new BigDecimal(500)));
        lista.add(new Funcionario("Xavier",34,new BigDecimal(3500)));
        lista.add(new Funcionario("Diana",50,new BigDecimal(2770)));
        lista.add(new Funcionario("Carla",23,new BigDecimal(2550)));

        System.out.println("-->ordenação de criação");
        for (Funcionario f: lista) {
            System.out.println(f);
        }

        //---------------------------------

        Comparator<Funcionario> porNome = new Comparator<Funcionario>() {
            @Override
            public int compare(Funcionario o1, Funcionario o2) {
                return o1.getNome().compareTo(o2.getNome());
            }
        };

        Collections.sort(lista, porNome);

        System.out.println("-->ordenação por nome");
        for (Funcionario f: lista) {
            System.out.println(f);
        }


        //---------------------------------

        Comparator<Funcionario> porIdadeAsc = new Comparator<Funcionario>() {
            @Override
            public int compare(Funcionario o1, Funcionario o2) {
                return o1.getIdade().compareTo(o2.getIdade());
            }
        };

        Collections.sort(lista, porIdadeAsc);

        System.out.println("-->ordenação por idade asc");
        for (Funcionario f: lista) {
            System.out.println(f);
        }

        //---------------------------------

        Comparator<Funcionario> porIdadeDesc = new Comparator<Funcionario>() {
            @Override
            public int compare(Funcionario o1, Funcionario o2) {
                return o2.getIdade().compareTo(o1.getIdade());
            }
        };

        Collections.sort(lista, porIdadeDesc);

        System.out.println("-->ordenação por idade desc");
        for (Funcionario f: lista) {
            System.out.println(f);
        }


        //---------------------------------

        Comparator<Funcionario> porSalario = new Comparator<Funcionario>() {
            @Override
            public int compare(Funcionario o1, Funcionario o2) {
                return o1.getSalario().compareTo(o2.getSalario());
            }
        };

        Collections.sort(lista, porSalario);

        System.out.println("-->ordenação por idade desc");
        for (Funcionario f: lista) {
            System.out.println(f);
        }

    }
}
