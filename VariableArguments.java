public class VariableArguments
{
	static void show(int ...A)
	{
		for(int x:A)
		{
			System.out.println(x);
		}
	}
	public static void main(String args[])
	{
		show();
		show(10,56,38);
		show(new int[]{3,7,32,78});
	}
}
/*public class VariableArguments
{
	static void showList(String...S)
	{
		for(int i=0;i<S.length;i++)
		{
			System.out.println(i+1+". "+S[i]);
		}
	}
	public static void main(String args[])
	{
		showList("UmaSree","Uma","Siri");
		
	}
}*/