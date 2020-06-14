package br.pucrs.lists;

public class App {

    public static void main(String[] args) {
        ColecaoEncadeada colecaoEncadeada  = new ColecaoEncadeada();
        colecaoEncadeada.addFirst("primeiro");
        colecaoEncadeada.addFirst("segundo");
        colecaoEncadeada.addFirst("terceiro");
        colecaoEncadeada.addFirst("quarto");

        System.out.println(colecaoEncadeada);
        colecaoEncadeada.addFirst("quinto");
        System.out.println(colecaoEncadeada);

        colecaoEncadeada.remove(2);
        System.out.println(colecaoEncadeada);
    }
}
