
public class numFac {
	
	double k;
	
	public double setFactorial(double k){
		
		if (k == 0.0) {
			return 1;
		}
		else {
			return k * setFactorial(k-1);
		}
		
	}
	public double calcular() {
		return setFactorial(k*3.0);
	}

}
