public class AddofMatrices{
	public static void main(String args[])
	{
		int A[][]={{3,7,1},{7,2,9},{8,3,5}};
		int B[][]={{1,8,3},{9,9,2},{9,2,6}};
		int C[][]=new int[3][3];

		for(int i=0;i<A.length;i++)
		{
	 		for(int j=0;j<A[0].length;j++)
			{
				C[i][j]=A[i][j]+B[i][j];
			}
			
		}
		System.out.println("Result Matrix:");

        for(int i = 0; i < C.length; i++) 
        {
            for(int j = 0; j < C[0].length; j++) 
            {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
	}

}