package olive2;

import java.util.ArrayList;



public class OlivePress {



	private int totalOil = 0;




	public OlivePress() {
	}
	
	public void getOil(ArrayList<Olive> olives) {
		
		int oil = 0;
		
		for (Olive olive : olives) {
			oil += olive.crush();
		}

		setTotalOil(oil);

	}


	public int getTotalOil() {
		return totalOil;
	}

	private void setTotalOil(int totalOil) {
		this.totalOil += totalOil;
	}
}
