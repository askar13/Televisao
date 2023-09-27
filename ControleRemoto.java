package Televisao;

public class ControleRemoto {
	int volumeMax = 100;
	int canalMax = 50;

	TV tv = new TV(0, 0);
	
	void aumentarVolume() {
		int volume = tv.getVolume();
		if (volume < volumeMax) {
			volume++;
			tv.setVolume(volume);
		} 
		else {
			System.out.println("Volume já está no máximo.");
		}
	}
	
	void diminuirVolume() {
		int volume = tv.getVolume();
		if (volume > 0) {
			volume--;
			tv.setVolume(volume);
		} 
		else {
			System.out.println("Volume já está no mínimo.");
		}
	}
	
	void aumentarCanal() {
		int canal = tv.getCanal();
		if (canal < canalMax) {
			canal++;
			tv.setCanal(canal);
		} 
		else {
			System.out.println("Não possuem canais para esta direção.");
		}
	}
	
	void diminuirCanal() {
		int canal = tv.getCanal();
		if (canal > 1) {
			canal--;
			tv.setCanal(canal);
		} 
		else {
			System.out.println("Não possuem canais para esta direção.");
		}
	}
	
	boolean ligarTV() {
		boolean ligado = tv.getLigado();
		if(!ligado) {
			ligado = true;
			tv.setLigado(ligado);
		} else {
			ligado = false;
			tv.setLigado(ligado);
		}
		return ligado;
	}

}
