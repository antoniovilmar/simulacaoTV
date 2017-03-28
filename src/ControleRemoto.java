
public class ControleRemoto {
	private TV televisao;

	public ControleRemoto(TV televisao) {
		this.televisao = televisao;
	}

	public void irParaCanal(int canal) {
		this.televisao.modificarCanal(canal);
	}
	
	public void ligarTv(){
		this.televisao.ligar();
	}
	
	public void desligarTv(){
		this.televisao.desligar();
	}
}
