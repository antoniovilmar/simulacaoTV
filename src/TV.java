
public class TV {

	private String modelo;
	private int canal;
	private int volume;
	private boolean ligada;
	
	public TV(String modelo, int canal, int volume, boolean ligada) {
		this.modelo = modelo;
		this.canal = canal;
		this.volume = volume;
		this.ligada = ligada;
	}

	public void aumentarVolume() {
		this.volume = this.volume + 1;
	}

	public void diminuirVolume() {
		this.volume = this.volume - 1;
	}

	public void aumentarCanal() {
		this.canal = this.canal + 1;
	}

	public void diminuirCanal() {
		this.canal = this.canal - 1;
	}

	public void ligar() {
		this.ligada = true;
	}

	public void desligar() {
		this.ligada = false;
	}

	public String getModelo() {
		return this.modelo;
	}

	public boolean isLigada() {
		return ligada;
	}

	public int getCanal() {
		return this.canal;
	}

	public int getVolume() {
		return this.volume;
	}
	
	public void modificarCanal(int canal){
		this.canal = canal;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

}
