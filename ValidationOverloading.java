public class ValidationOverloading
{
	boolean validate(String name)
	{
		return name.matches("[a-zA-Z\\s]+");
	}
	boolean validate(int age)
	{
		return age>=3 && age<=20;
	}
	public static void main(String arg[])
	{
		ValidationOverloading obj = new ValidationOverloading();

        System.out.println(obj.validate("Uma Sree"));
        System.out.println(obj.validate(21));
	}
}