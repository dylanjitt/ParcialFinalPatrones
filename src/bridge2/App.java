package bridge2;

public class App implements IpayMethod{
	
	private Iservice service;
	private double descPercentage=0.1;

	public App(Iservice service) {
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
		double price = service.getPrecio();
		price = price - (price*descPercentage);
		service.setPrecio(price);
		System.out.println("> Se realizo el pago a traves de la App");
		System.out.println("> Se aplico un descuento del "+descPercentage*100.00+"%");
		System.out.println("> Precio final: "+service.getPrecio()+" Bs.\n");
		
		
	}

}
