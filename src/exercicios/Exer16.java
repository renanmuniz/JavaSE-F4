package exercicios;

import classes.Carrinho;
import classes.Celular;
import classes.Livro;
import classes.Produto;

public class Exer16 {
    public static void main(String[] args) {
        Carrinho<Produto> carrinho = new Carrinho<>();
        Livro livroJava = new Livro();
        livroJava.nome = "Use a cabeça Java";
        livroJava.valor = 150.50;
        carrinho.adicionarProduto(livroJava);

        Celular iphone = new Celular();
        iphone.nome = "Iphone X";
        iphone.valor = 2500.00;
        carrinho.adicionarProduto(iphone);

        String nota = carrinho.emitirNota();
        System.out.println(nota);

    }
}
