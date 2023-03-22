package decorator1;

public class Personaje implements Iper{
	
	private String nombre;
	private int nivel=1;
	private String arma;
	private int armor=1;
	private int ataque=1;
	private int defensa=1;
	private int regenerarVida=1;
	
	public Personaje(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public String getArma() {
		return arma;
	}

	public void setArma(String arma) {
		this.arma = arma;
	}

	public int getArmor() {
		return armor;
	}

	public void setArmor(int armor) {
		this.armor = armor;
	}

	public int getAtaque() {
		return ataque;
	}

	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}

	public int getDefensa() {
		return defensa;
	}

	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}

	public int getRegenerarVida() {
		return regenerarVida;
	}

	public void setRegenerarVida(int regenerarVida) {
		this.regenerarVida = regenerarVida;
	}
	
	public void addArma(String arma) {
		this.arma=arma;
	}
	
	public void armor(int ar) {
		armor+=ar;
	}
	
	public void ataque(int at) {
		ataque+=at;
	}
	
	public void defensa (int def) {
		defensa+=def;
	}
	
	public void vida (int vida) {
		regenerarVida+=vida;
	}
	
	public void levelUp(int lvl) {
		nivel=nivel*lvl;
	}
	
	@Override
	public void info() {
		System.out.println("Personaje: "+nombre+", Nivel "+nivel);
		if (arma==null) {
			System.out.println("No tiene armas");
		}else {
			System.out.println("Armas: "+arma);
		}
		System.out.println("Armadura: "+armor+"%");
		System.out.println("Ataque: "+ataque+"%");
		System.out.println("Defensa: "+defensa+"%");
		System.out.println("Regeneracion Vida: "+regenerarVida+"%");
		System.out.println("--------------------------------------");
	}
	
	

}
