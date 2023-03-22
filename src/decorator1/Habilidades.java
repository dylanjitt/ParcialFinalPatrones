package decorator1;

public class Habilidades implements Iper{


	private Iper personaje;
	


	public Iper getPersonaje() {
		return personaje;
	}


	public void setPersonaje(Iper personaje) {
		this.personaje = personaje;
	}
	
	
	

	//@Override
	public void info() {
		personaje.info();
	}


	@Override
	public void addArma(String arma) {
		personaje.addArma(arma);
		
	}


	@Override
	public void armor(int ar) {
		personaje.armor(ar);
		
	}


	@Override
	public void ataque(int at) {
		personaje.ataque(at);
		
	}


	@Override
	public void defensa(int def) {
		personaje.defensa(def);
		
	}


	@Override
	public void vida(int vida) {
		personaje.vida(vida);
		
	}


	@Override
	public void levelUp(int lvl) {
		personaje.levelUp(lvl);
		
	};

}
