/* feedback:
I really like that you give meaningful names to variables, 
it's very important for code readability. But again the code lacks 
spacings. Even in small programs, we should be writing code cleanly
and with spacings 
*/

// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		int currentValue =Integer.parseInt(args[0]);
		double rate =Double.parseDouble(args[1]);
		int years =Integer.parseInt(args[2]);
		int futureValue = (int) (currentValue* Math.pow(1+rate/100, years));
		System.out.println("After "+ years +" years, "+"$"+currentValue+" saved at "+rate+"% "+"will yield "+"$"+(int)futureValue);
	}
}
