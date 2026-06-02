import java.util.Scanner;
public class FindMax{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);

		int A[]={4,6,23,112};

		int max=A[0];

		for(int i=0;i<A.length;i++)
		{
			if(A[i]>max)
			{
				max=A[i];
			}
		}
		System.out.println("Maximum element is "+max);	
	}
}