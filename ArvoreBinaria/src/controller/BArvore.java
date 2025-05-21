package controller;
import controller.BinNO;

public class BArvore {
		static int i = 0;
		 private BinNO raiz; 
		 private BinNO inserir(BinNO atual, BinNO novoNo){ 
		 if (atual == null) 
		 return novoNo; 
		 else if (novoNo.valor < atual.valor) 
		 atual.esq = inserir(atual.esq, novoNo); 
		 else 
		 atual.dir = inserir(atual.dir, novoNo); 
		 return atual; 
		 } 
		 public void inserirNo(BinNO novoNo){ 
		 raiz = inserir(raiz, novoNo); 
		 }
		 public void exibir() { 
			 System.out.println("Exibindo elementos da árvore"); 
			 exibirArvore(raiz); 
                         System.out.println("Exibir a árvore in-ordem"); 
                         exibirInOrdem(raiz); 
			}
			private void exibirArvore(BinNO atual) { 
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
				private void CountArvore(BinNO atual) { 
				
				 if(atual != null){ 
					i++;
				 CountArvore(atual.esq);
				 
				 CountArvore(atual.dir); 
				
				 } 
				}	
                                private void exibirInOrdem(BinNO atual) { 
                                            if(atual != null){ 
                                                exibirInOrdem(atual.esq); 
                                                System.out.println(atual.valor); 
                                                exibirInOrdem(atual.dir); 
                                            }   
                               }
                                public void mostrarAntecessores(int valor) {
                                    System.out.println("Buscando antecessores de " + valor + ":");
                                    if (!mostrarAntecessores(raiz, valor)) {
                                    System.out.println("Valor " + valor + " não encontrado na árvore.");
                                    }
                                }

                                private boolean mostrarAntecessores(BinNO atual, int valor) {
                                    if (atual == null) {
                                    return false;
                                     }

   
                                    if (atual.valor == valor) {
                                        System.out.println(atual.valor); 
                                        return true;
                                     }

    
                                        if (mostrarAntecessores(atual.esq, valor) || mostrarAntecessores(atual.dir, valor)) {
                                        System.out.println(atual.valor); 
                                        return true;
                                        }

                                        return false;
                            }
				
}