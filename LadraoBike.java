package Observes;

import java.util.ArrayList;

public class LadraoBike implements Ladrao {

	ArrayList<ObserverDelegacia> delegacia= new ArrayList<ObserverDelegacia>();
	

	public void addVigilante(ObserverDelegacia O){
		delegacia.add(O);
	}
	@Override
	public void Direcao() {
		for(ObserverDelegacia d:delegacia){
			d.notificao="ESQUERDA";
		}
		
	}

}
