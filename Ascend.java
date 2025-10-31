// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
	int a,b,c ;
	a= (int)(Math.random()*10)+1 ;
	b= (int)(Math.random()*10)+1 ;
	c= (int)(Math.random()*10)+1 ;
	if (a>b && b>c) { 
	System.out.println(c+","+b+","+a); 
	}else if (a<=b && b<=c) {
	System.out.println(a+","+b+","+c);	
	}else if (a<=c && b>=c) {
	System.out.println(a+","+c+","+b);}
	else if (a>=c && b<=c) {
	System.out.println(b+","+c+","+a);
	}else if (a>=c && b>=a) {
	System.out.println(c+","+a+","+b);}
	else if (a<=c && b<=a) {
	System.out.println(b+","+a+","+c);}
	}
}

