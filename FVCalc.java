// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		// Replace this comment with your code
		int currentValue = Integer.parseInt(args[0]);
		double intrest = Double.parseDouble(args[1]);
        double rate = intrest/100.0;
		double years = Double.parseDouble(args[2]);
		double futureValue = currentValue * Math.pow((1 + rate), years);
		System.out.print("After " + years + " years, $" + currentValue + " saved at " + intrest + " % will yield $" + (int)futureValue);
	}
}