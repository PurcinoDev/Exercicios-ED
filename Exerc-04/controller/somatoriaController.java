package controller;

public class somatoriaController {
	
	public somatoriaController() {
		super();
	}
	
	public double somaSerie(int n) {
		if (n == 1) {
			return 1;
		} else {
			double divisao = 1 / (double) n;
			n -= 1;
			return divisao + somaSerie(n);
		}
	}
}
