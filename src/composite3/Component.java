package composite3;

public abstract class Component {
	private String text;
	private int nwrds;

	public int getNwrds() {
		return nwrds;
	}

	public void setNwrds(int nwords) {
		this.nwrds = nwords;
	}

	public Component(String text) {
		this.text = text;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	public abstract void info();
	
	

}
