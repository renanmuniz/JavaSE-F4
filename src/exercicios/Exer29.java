package exercicios;

public class Exer29 {

    public interface Produto {

    }

    public static class Dvd implements Produto {

    }

    public static class Celular implements Produto {

    }

    public static void verificar(Produto produto) {
        if(produto instanceof Dvd){
            System.out.println("é um Dvd");
        }
        if(produto instanceof Celular){
            System.out.println("é um Celular");
        }
    }

    public static void main(String[] args) {
        verificar(new Dvd());
        verificar(new Celular());
    }
}
