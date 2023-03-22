package bridge2;

public class Launcher {

	public static void main(String[] args) {
		InstalacionElectrica electr = new InstalacionElectrica("123456", 120.00);
		InstalacionAgua agua = new InstalacionAgua("968845754OXX", 30.00);
		InstalacionAlcantarillado alcant = new InstalacionAlcantarillado("TRXZD44", 50.00);
		
		Efectivo efec = new Efectivo(electr);
		efec.discount();
		efec.setService(agua);
		efec.discount();
		efec.setService(alcant);
		efec.discount();
		
		App app = new App(electr);
		app.discount();
		
		TigoMoney tigo = new TigoMoney(alcant);
		tigo.discount();
		
		TransferenciaBancaria banco = new TransferenciaBancaria(agua);
		banco.discount();
		

	}

}
