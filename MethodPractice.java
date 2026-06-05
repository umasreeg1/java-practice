public class MethodPractice
{
	static int max(int x,int y)
	{
		if(x>y)
			return x;
		else
			return y;
	}

	public static void main(String args[])
	{
		int a=10,b=15;

		System.out.println(max(a,b));

	}
}

/*by creating an object and calling a method
public class MethodPractice
{
	int max(int x,int y)
	{
		if(x>y)
			return x;
		else
			return y;
	}

	public static void main(String args[])
	{
		int a=10,b=15;

		MethodPractice mp=new MethodPractice();

		System.out.println(mp.max(a,b));

	}
}*/