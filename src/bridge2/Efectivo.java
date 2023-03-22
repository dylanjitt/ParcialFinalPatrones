package bridge2;

public class Efectivo implements IpayMethod{
	
	private Iservice service;

	public Efectivo(Iservice service) {
		this.service = service;
	}
	
	

	public Iservice getService() {
		return service;
	}



	public void setService(Iservice service) {
		this.service = service;
	}



	@Override
	public void discount() {
		service.info();
		System.out.println("> Se realizo el pago con efectivo");
		System.out.println("> Precio final: "+service.getPrecio()+" Bs.\n");
		
	}

}
