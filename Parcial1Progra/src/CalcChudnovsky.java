
public class CalcChudnovsky implements Chudnovsky{

	double k;
	
	public double factorial(double k) {
		this.k = k;
		if (k==0) {
			return 1;
		}
		else {
			return k*factorial(k-1);
		}
		
		//Metodo para cacular los decimales de pi
	}
	public double calcularPi() {
		
		return (factorial(6*k)*((545140134*k)+1359149))/(factorial(3*k)*(Math.pow((factorial(k)), 3))*(Math.pow(-262537412640768000.0, k)));
	}
	

}
