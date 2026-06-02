import java.util.Scanner;
public class Palindrome{
	public static void main(String args[])
	{
		Scanner sc=new  Scanner(System.in);

		System.out.println("Enter a number");
		int n=sc.nextInt();

		int m=n;
		int rev=0,r;

		while(n>0)
		{
			r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
		if(rev==m)
			System.out.println("It's a Palindrome");
		else
			System.out.println("It's  not a Palindrome");
	}
}