//PROGRAM TO CHECK WHETHER 3 POINTS ARE COLLINEAR OR NOT
import java.util.*;

class Q13
{
	public static void main(String[] args)throws InputMismatchException
	{	System.out.println("enter 3 points:");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int f = 0;

		if(a+b == c)
			f = 1;
		else if(a+c == b)
				f = 1;
		else if(b+c == a)
				f = 1;
		else 
			f = 0;

		if(f == 1)
			System.out.println("3 points are in a line.");
		else
			System.out.println("3 points are not in a line.");
	}
}
