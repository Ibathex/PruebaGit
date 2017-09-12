
public class Factorial {
	
	public double getFactorial(double n){
		if (n == 0.0) {
			return 1;
		}
		else {
			return n * getFactorial(n-1);
		}
		
	}

}
