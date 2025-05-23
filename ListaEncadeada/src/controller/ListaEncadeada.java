package controller;

public class ListaEncadeada {
    Node inicio;

    public ListaEncadeada() {
        this.inicio = null;
    }


    public void adicionar(int valor) {
        Node novo = new Node(valor);
        if (inicio == null) {
            inicio = novo;
        } else {
            Node atual = inicio;
            while (atual.proximo != null) {
                atual = atual.proximo;
            }
            atual.proximo = novo;
        }
    }

 
    public void imprimir() {
        Node atual = inicio;
        while (atual != null) {
            System.out.print(atual.valor + " -> ");
            atual = atual.proximo;
        }
        System.out.println("null");
    }
}
