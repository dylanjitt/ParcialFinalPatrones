package composite3;

public class Archivo extends Component{
	
	

	public Archivo(String text) {
		super(text);
	}

	@Override
	public void info() {
		String txt = super.getText();
		String[] wrds = super.getText().split(" ");
		
		int n = wrds.length;
		super.setNwrds(n);
		
		System.out.println("> Archivo: "+txt);
		System.out.println(">     Contiene "+n+" palabras");
		
	}

}
