package classes;

public class OperacaoBancaria extends Thread{
    private Conta conta;
    private String usuario;
    private float saque;

    public OperacaoBancaria(Conta conta, String usuario, float saque) {
        this.conta = conta;
        this.usuario = usuario;
        this.saque = saque;
    }

    public void run() {
        conta.sacar(saque, usuario);
    }
}
