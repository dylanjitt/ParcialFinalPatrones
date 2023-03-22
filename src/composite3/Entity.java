package composite3;

import java.util.ArrayList;
import java.util.List;

public class Entity extends Component {
	
	private int nTotal;
	
	List<Component> compList = new ArrayList<>();

	public Entity(String text) {
		super(text);
	}

	public int getnTotal() {
		return nTotal;
	}

	public void setnTotal(int nTotal) {
		this.nTotal = nTotal;
	}

	public List<Component> getCompList() {
		return compList;
	}

	public void setCompList(List<Component> compList) {
		this.compList = compList;
	}

	@Override
	public void info() {
		System.out.println(super.getText());
		for(Component c: compList) {
			c.info();
			nTotal+=c.getNwrds();
		}
		super.setNwrds(nTotal);
		System.out.println("- Total palabras "+super.getText()+"= "+nTotal+"\n");
	}
	
	public void add (Component c) {
		compList.add(c);
	}
	
	public void remove (Component c) {
		compList.remove(c);
	}
	
	public Component get(int posicion) {
		return compList.get(posicion);
	}
	
	
	
	

}
