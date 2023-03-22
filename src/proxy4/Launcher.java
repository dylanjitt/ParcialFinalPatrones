package proxy4;

public class Launcher {

	public static void main(String[] args) {
		Proxy p = new Proxy();
		
		Account u1 = new Account("Rodrigo", "123");
		Account u2 = new Account("Manuela", "asdf");
		Account u3 = new Account("Pablito", "admin");
		Account u4 = new Account("Jose", "abcd");
		
		p.login(u1, "123");
		p.login(u2, "asdf");
		p.login(u4, "asdfasg");
		p.login(u3, "admin");
		
		p.info();

	}

}
