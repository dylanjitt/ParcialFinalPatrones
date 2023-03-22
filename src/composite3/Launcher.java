package composite3;

public class Launcher {

	public static void main(String[] args) {
		Archivo a1 = new Archivo("El futuro del arte");
		Archivo a2 = new Archivo("I feel it coming");
		Archivo a3 = new Archivo("NFT willyrex");
		
		Archivo a4 = new Archivo("I can buy myself flowers");
		Archivo a5 = new Archivo("Write my name in the sand");
		Archivo a6 = new Archivo("talk to myself for hours");
		Archivo a7 = new Archivo("Say things you dont understand");
		
		Entity f1 = new Entity("Folder");
		f1.add(a1);
		f1.add(a2);
		f1.add(a3);
		
		Entity f2 = new Entity("Folder");
		f2.add(a4);
		f2.add(a5);
		f2.add(a6);
		f2.add(a7);
		
		Entity hdd = new Entity("Unidad de Disco");
		hdd.add(f2);
		hdd.add(f1);
		
		hdd.info();

	}

}
