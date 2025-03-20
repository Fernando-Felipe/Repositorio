package controller;
import java.util.concurrent.Semaphore;
public class ThreadCavaleiro extends Thread {
	private int id;
	private static boolean PegouTorcha = false;
	private static boolean PegouPedra = false;
	private Semaphore semapedra;
	
	public ThreadCavaleiro(int id) {
		this.id = id;
		
		
	}
	
	@Override
	public void run() {
		PercorrerCorredor();
		
	
	
		EntrarPorta();
		
		
	}
	private void PercorrerCorredor() {
		double distT = 2000;
		int Velocidade = (int)(Math.random()* 2.1) +2 ;
		int distPercorrida = 0;
		int tempo = 50;
		while (distPercorrida < distT) {
			distPercorrida += Velocidade;
			if(distPercorrida >= 500 && !PegouTorcha) {
				PegarTorcha(Velocidade);
			}
			if(distPercorrida >= 1500 && !PegouPedra) {
				PegarPedra(Velocidade);
			}

			try {
				sleep(tempo);
				
			} catch (InterruptedException e) {
			  e.printStackTrace();
			}
			System.out.println("Cavaleiro "+ id + " Percorreu " + distPercorrida);
		}
		
		
	}
	 
	private void PegarTorcha(int Velocidade) {
		PegouTorcha = true;
			Velocidade += 2; 
			System.out.println("Cavaleiro "+ id + " Pegou a torcha");
		
	}
	private void EntrarPorta() {
		// TODO Auto-generated method stub 
		
	}

	

	private void PegarPedra(int Velocidade) {
		PegouPedra = true;
		Velocidade += 2; 
		System.out.println("Cavaleiro "+ id + " Pegou a Pedra "); 
		
	}

	
	

}
