package view;
import java.util.concurrent.Semaphore;
import controller.ThreadCavaleiro;

public class Cavaleiros {
	public static void main(String [] args) {
		
	for(int id = 0; id < 4 ; id++) {
		ThreadCavaleiro c = new ThreadCavaleiro(id);
		c.start();
	}
	}
}
