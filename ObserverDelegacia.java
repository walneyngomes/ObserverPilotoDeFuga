package Observes;

import java.util.ArrayList;

public class ObserverDelegacia {
	ArrayList<Ladrao> pilotoDeFuga = new ArrayList<Ladrao>();

	String notificao = "";

	ObserverDelegacia(Ladrao l) {
		l.addVigilante(this);
		pilotoDeFuga.add(l);
	}

	public void direcao() {
		for (Ladrao l : pilotoDeFuga) {
			l.Direcao();
		}
		System.out.print(notificao);

	}

}
