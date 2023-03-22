package adapter5;

public class Launcher {

	public static void main(String[] args) {
		Inc1 gpt = new Empresa1("ChatGPT");
		gpt.iniciarSesion();
		gpt.generarDatos();
		gpt.cerrarSesion();
		
		Inc2 microsoft = new Empresa2("MICROSOFT");
		microsoft.login();
		microsoft.reportes();
		microsoft.logout();
		
		microsoft = new Adapter(gpt);
		microsoft.login();
		microsoft.reportes();
		microsoft.logout();

	}

}
