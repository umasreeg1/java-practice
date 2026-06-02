 public class CopyingAnArray{
    public static void main(String[] args) 
    {
        int A[]={8,1,3,7,9,5};
        int B[]=new int[6];
        
        for(int i=0;i<A.length;i++)
        {
            B[i]=A[i];
        }
        
        for(int x:B)
        {
            System.out.print(x+",");
        }
        
    } 
}