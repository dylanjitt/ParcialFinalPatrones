package decorator1;

public class Pocion extends Habilidades{


	public Pocion(Iper personaje) {

		super.setPersonaje(personaje);
	}

	@Override
	public void info() {
		System.out.println("Se ha consumido una pocion regeneradora de salud!");
		super.vida(80);
		super.info();
		
	}

}
