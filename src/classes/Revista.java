package classes;

public class Revista {

    private static class Pagina {
        public void virar() {
            System.out.println("Virar pagina");
        }
    }

    public static class Marcar {
        public void marcar() {
            System.out.println("pagina marcada");
        }
    }

    public static void ler() {
        new Pagina().virar();
    }

    public static void marcar() {
        new Marcar().marcar();
    }
}
