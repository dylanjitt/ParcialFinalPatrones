package decorator1;

public class Launcher {

	public static void main(String[] args) {
		Iper p = new Personaje("Rodrigo");
		p.info();
		p = new Armas(p, "espada");
		p.info();
		p = new Escudo(p);
		p.info();
		p = new Pocion(p);
		p.info();

	}

}
