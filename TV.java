package Televisao;

public class TV {
	private int volume, canal;
	String marca;
	boolean ligado;

	public TV(int volume, int canal) {
		this.volume = volume;
		this.canal = canal;
	}
	
	 public int getVolume() {
		 return volume;
	 }

	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	public int getCanal() {
		return canal;
	}
	
	public void setCanal(int canal) {
		this.canal = canal;
	}
	
	public String getMarca() {
		return marca;
	}

	public boolean getLigado() {
		return ligado;
	}
	
	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	
	
	
}
