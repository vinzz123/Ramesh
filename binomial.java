import java.util.Scanner;
import java.io.*;

public class binomial
{
	public static int fact(int n)
	{
		if( n <= 1)
		{
			return 1;
		}
		return n*fact(n-1);
	}
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the value of N \n");
		int n = input.nextInt();
		System.out.println("Enter the value of K\n");
		int k = input.nextInt();
		int ncr = fact(n)/(fact(k)*fact(n-k));
		System.out.println("Binomial co-efficient of " + n + " " + k + "=" + ncr);
	}
}