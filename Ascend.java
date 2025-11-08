/* Feedback:
Correct logic, nice utilization of the Math library. And a cool way to calculate the middle number
I also liked that you used a special character inside the print statement to declare newline,
instead of  doing two print statements

However, i would like to suggest some improvements.
there’s no spacing or indentation between sections. It’s important to format your code 
properly (blank lines, indentation, and spaces around operators),
because in larger programs it will become much harder
to read and debug without clear structure.

Break it down into sections, i left comments on how i would do it. 
*/

// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
	int a,b,c ; // variable declarations -> tab 
	a= (int)(Math.random()*100)+1 ;
	b= (int)(Math.random()*100)+1 ;
	c= (int)(Math.random()*100)+1 ; // extract random numbers -> tab 
	int First = Math.min(a,Math.min(c, b));
	int last = Math.max(a,Math.max(c, b));
	int midlle = a+b+c - (last+First); // calculations -> tab 
	System.out.println(a+" "+b+" "+c+"\n"+ First+" "+midlle+" "+last); // final statement 
	}

}
