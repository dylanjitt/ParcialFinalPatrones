package decorator1;

public class Escudo extends Habilidades{

	public Escudo(Iper personaje) {
		super.setPersonaje(personaje);

	}

	@Override
	public void info() {
		//super.infoPer();
		System.out.println("Se ha añadido un escudo");
		super.defensa(35);
		super.armor(10);
		super.info();
		
	}

}
