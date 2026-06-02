public class ArrayPractice
{
	public static void main(String args[])
	{
		int A[]=new int[10];
		int B[]={1,2,3,4,5};//change value 3 to 15
		int C[];
		C=new int[10];

		B[2]=15;

		
		for(int i=0;i<B.length;i++)
		{
			System.out.println(B[i]);

		}
			System.out.println(B.length);


	}
}
/*for(int x:B)
{
	system.out.println(x);
}*/