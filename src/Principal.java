
public class Principal {

	public static void main(String[] args) {
		TV tvDoQuarto = new TV("Sony", 12, 20, true);
		System.out.println("Modelo: " + tvDoQuarto.getModelo());
		System.out.println("Canal: " + tvDoQuarto.getCanal());
		System.out.println("Volume: " + tvDoQuarto.getVolume());

		tvDoQuarto.aumentarCanal();
		System.out.println("Canal foi aumentado para: " + tvDoQuarto.getCanal());
		tvDoQuarto.diminuirCanal();
		System.out.println("Canal foi diminuido para: " + tvDoQuarto.getCanal());
		tvDoQuarto.aumentarVolume();
		System.out.println("Volume foi aumentado para: " + tvDoQuarto.getVolume());
		tvDoQuarto.diminuirVolume();
		System.out.println("Volume foi diminuido para: " + tvDoQuarto.getVolume());
		tvDoQuarto.desligar();
		System.out.println("Tv está ligada? " + tvDoQuarto.isLigada());
		tvDoQuarto.ligar();
		System.out.println("Tv está ligada? " + tvDoQuarto.isLigada());
		tvDoQuarto.setModelo("Samsung");
		System.out.println("Modelo alterado para " + tvDoQuarto.getModelo());

		ControleRemoto controle = new ControleRemoto(tvDoQuarto);

		controle.desligarTv();
		System.out.println("Controle Remoto - Tv está ligada? " + tvDoQuarto.isLigada());
		controle.ligarTv();
		System.out.println("Controle Remoto - Tv está ligada? " + tvDoQuarto.isLigada());
		controle.irParaCanal(36);
		System.out.println("Controle Remoto - Cana da  Tv é: "+tvDoQuarto.getCanal());
	}

}
