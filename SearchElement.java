import java.util.Scanner;
public class SearchElement{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);

		int A[]={4,8,2,1,9};

		int key;

		System.out.println("Enter a Key");
		key=sc.nextInt();

		for(int i=0;i<A.length;i++)
		{
			if(key==A[i])
			{
				System.out.println("Element Found at :"+i);
				System.exit(0);

			}
		}
		System.out.println("Not Found");
	}
}