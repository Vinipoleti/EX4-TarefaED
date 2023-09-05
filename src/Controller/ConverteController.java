package Controller;

import model.PilhaInt;

public class ConverteController {

	public ConverteController() {
		super();

	}

	public String decToBin(int decimal) {
		PilhaInt pi = new PilhaInt();
		String Texto = "";
		while (decimal > 0) {
			pi.push(decimal % 2);
			decimal= decimal/2;
		}
		while (!pi.isEmpty()) {
			try {
				Texto += "" + pi.pop();
			} catch (Exception e) {
				
				System.out.println(e.getMessage());
			}
		}
		return Texto;

	}
}
