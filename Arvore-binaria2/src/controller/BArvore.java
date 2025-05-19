package controller;
import controller.BinNo;

public class BArvore {
		static int i = 0;
		 private BinNo raiz; 
		 private BinNo inserir(BinNo atual, BinNo novoNo){ 
		 if (atual == null) 
		 return novoNo; 
		 else if (novoNo.valor < atual.valor) 
		 atual.esq = inserir(atual.esq, novoNo); 
		 else 
		 atual.dir = inserir(atual.dir, novoNo); 
		 return atual; 
		 } 
		 public void inserirNo(BinNo novoNo){ 
		 raiz = inserir(raiz, novoNo); 
		 }
		 public void exibir() { 
			 System.out.println("Exibindo elementos da árvore"); 
			 exibirArvore(raiz); 
			}
			private void exibirArvore(BinNo atual) { 
			 if(atual != null){ 
			 exibirArvore(atual.esq); 
			 System.out.println(atual.valor); 
			 exibirArvore(atual.dir); 
			 } 
			}
			
			public void Count() { 
				 System.out.println("Contando elementos"); 
				 CountArvore(raiz); 
				 System.out.println(i); 
				 
				}
				private void CountArvore(BinNo atual) { 
				
				 if(atual != null){ 
					i++;
				 CountArvore(atual.esq);
				 
				 CountArvore(atual.dir); 
				
				 } 
				}	
				
}