package adapter5;

public class Empresa2 implements Inc2 {
	private String name;

	public Empresa2(String name) {
		this.name = name;
	}
	
	

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	@Override
	public void login() {
		System.out.println("USER: Admin -> Password: ***********");
		System.out.println("Welcome, Admin");
		
	}



	@Override
	public void logout() {
		System.out.println("System shutting down");
		System.out.println("--------------------------\n");
		
		
	}



	@Override
	public void reportes() {
		System.out.println("- Reporting Data");
		System.out.println(" -> iOS");
		System.out.println(" -> android");
		
	}

}
