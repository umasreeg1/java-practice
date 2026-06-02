public class Deletion{
	public static void main(String arg[])
	{
		int A[]=new int[10];
		A[0]=3;A[1]=9;A[2]=6;A[3]=4;A[4]=5;A[5]=8;

		int n=6;

		for(int i=0;i<n;i++)
			System.out.print(A[i]+" ");
		System.out.println("");

		int index=1;

		for(int i=index;i<n;i++)
			A[i]=A[i+1];
		n--;

		for(int i=0;i<n;i++)
			System.out.print(A[i]+" ");
		System.out.println("");

	}
}