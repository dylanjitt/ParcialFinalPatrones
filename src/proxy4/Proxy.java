package proxy4;

public class Proxy implements Iserver{
	private Iserver server1 = new Server("Skynet");
	private Iserver server2 = new Server("SuperPC");
	private int logged=0;
	
	public Proxy() {}

	public Iserver getServer1() {
		return server1;
	}

	public void setServer1(Iserver server1) {
		this.server1 = server1;
	}

	public Iserver getServer2() {
		return server2;
	}

	public void setServer2(Iserver server2) {
		this.server2 = server2;
	}

	public int getLogged() {
		return logged;
	}

	public void setLogged(int logged) {
		this.logged = logged;
	}

	@Override
	public void login(Account user, String pwd) {
		if (user.getPassword().equals(pwd)) {
			if(!(logged%2==0)) {
				server1.login(user, pwd);
			}else {
				server2.login(user, pwd);
			}
			logged++;
		}else {
			System.out.println("Contrasena incorrecta, intente nuevamente");
		}
		
	}

	@Override
	public void info() {
		server1.info();
		server2.info();
		
	}
	
	


}
