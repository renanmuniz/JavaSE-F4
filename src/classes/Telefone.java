package classes;

public class Telefone {
    private int numero =84044007;

    public void ligar() {
        class InternaMetodo {
            public void fazer(){
                System.out.println("Telefone é " + numero);
            }
        }
        InternaMetodo obj = new InternaMetodo();
        obj.fazer();
    }
}
