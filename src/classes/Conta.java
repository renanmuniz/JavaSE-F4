package classes;

public class Conta {
    private float valor = 300.0f;

    public synchronized void sacar(float vlSaque, String usuario) {
        System.out.println(usuario + " iniciando saque");
        if (this.valor >= vlSaque) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            valor -= vlSaque;
            System.out.println("Usuario " + usuario + " sacou R$" + vlSaque + ". (SALDO R$" + this.valor + ")");
        } else {
            System.out.println("Saldo insuficiente - " + usuario);
        }
    }
}
