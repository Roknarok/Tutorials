package olive2;

public class Olive {
	
	public String name = "Kalamata";
	public String flavor = "Grassy";
	public long color = 0x000000;



	private int oil = 3;
	
	public Olive() {
		System.out.println("Constructor of " + this.name);
	}
	
	public Olive(int oil) {
		setOil(oil);
	}

	public int crush() {
		System.out.println("ouch!");
		return oil;
	}


	public int getOil() {
		return oil;
	}

	public void setOil(int oil) {
		this.oil = oil;
	}

}
