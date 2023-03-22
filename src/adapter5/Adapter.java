package adapter5;

public class Adapter implements Inc2{
	private Inc1 emp1;
	
	
	public Adapter(Inc1 emp1) {
		this.emp1 = emp1;
	}

	@Override
	public void login() {
		System.out.println("> System adapted from "+emp1.getName());
		emp1.setName("MICROSOFT");
		emp1.iniciarSesion();
		
	}

	@Override
	public void logout() {
		emp1.cerrarSesion();
		
	}

	@Override
	public void reportes() {
		emp1.generarDatos();
		System.out.println("Data recovered from ChatGPT DataBases");
		
	}

}
