package controller;
import controller.BArvore;
import controller.BinNO;

public class Main{
	public static void main(String[] args) {

			 BArvore arvore1 = new BArvore(); 
			 arvore1.inserirNo(new BinNO(14)); 
			 arvore1.inserirNo(new BinNO(16)); 
			 arvore1.inserirNo(new BinNO(12)); 
			 arvore1.inserirNo(new BinNO(11)); 
			 arvore1.inserirNo(new BinNO(17)); 
			 arvore1.inserirNo(new BinNO(15)); 
			 arvore1.inserirNo(new BinNO(10)); 
			 arvore1.inserirNo(new BinNO(13)); 
			 arvore1.exibir(); 
			 arvore1.Count(); 
                         arvore1.mostrarAntecessores(13);
                         arvore1.mostrarAntecessores(99);
			 } 
			
	}
