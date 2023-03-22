package adapter5;

public class Empresa1 implements Inc1 {
	private String name;

	public Empresa1(String name) {
		this.name = name;
	}
	
	
	@Override
	public String getName() {
		return name;
	}


	@Override
	public void setName(String name) {
		this.name = name;
	}



	@Override
	public void iniciarSesion() {
		System.out.println("Bienvenido a "+name);
		System.out.println("Usuario: Admin");
		System.out.println("Contrasena: ***************");
		System.out.println("> Inicio de sesion realizado exitosamente");
		
	}

	@Override
	public void cerrarSesion() {
		System.out.println("> Cerrando Sesion ");
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<\n");
		
	}

	@Override
	public void generarDatos() {
		System.out.println("> Reporte de datos: ");
		System.out.println("    >app iOS");
		System.out.println("    >app android");
		System.out.println("    >app WindowsPhone");

		
	}
	

}
