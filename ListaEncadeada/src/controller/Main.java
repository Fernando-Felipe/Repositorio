package controller;

public class Main {
     public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();

        lista.adicionar(10);
        lista.adicionar(20);
        lista.adicionar(30);

        lista.imprimir(); 
    }
}
