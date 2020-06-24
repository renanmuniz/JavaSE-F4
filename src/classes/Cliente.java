package classes;

public class Cliente {
    String nome;

    public Cliente(String nome){
        this.nome = nome;
    }

    public void vender(){
        System.out.println(nome + " vendendo...");
    }
}
