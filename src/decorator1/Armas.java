package decorator1;

public class Armas extends Habilidades{
	
	
	private String arma;
	
	public Armas(Iper personaje, String arma) {
		super.setPersonaje(personaje);
		this.arma = arma;
	}



	public String getArma() {
		return arma;
	}



	public void setArma(String arma) {
		this.arma = arma;
	}



	@Override
	public void info() {
		//super.info();
		System.out.println("Se ha añadido una nueva arma: "+arma);
		super.addArma(arma);
		super.ataque(30);
		super.levelUp(2);
		super.info();
		
	}

}
