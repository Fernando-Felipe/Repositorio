package view;
import controller.ListaEncadeadaMetodos;

public class Main {
    public static void main(String[] args) {
        ListaEncadeadaMetodos m = new ListaEncadeadaMetodos();
            m.Adicionar(10);
            m.Adicionar(40);
            m.Adicionar(25);
            m.Adicionar(30);
            m.Buscar();
            m.Remover();
            m.Imprimir();
    }
}
