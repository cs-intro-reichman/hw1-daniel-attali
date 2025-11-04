// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
	int a,b,c ;
	a= (int)(Math.random()*100)+1 ;
	b= (int)(Math.random()*100)+1 ;
	c= (int)(Math.random()*100)+1 ;
	int First = Math.min(a,Math.min(c, b));
	int last = Math.max(a,Math.max(c, b));
	int midlle = a+b+c - (last+First);
	System.out.println(a+" "+b+" "+c+"\n"+ First+" "+midlle+" "+last);
	}
}