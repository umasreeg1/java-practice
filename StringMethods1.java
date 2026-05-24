
public class StringMethods1 {

    public static void main(String[] args) {

        String str = new String("programmer");

        int len = str.length();
        System.out.println(len);

        String upper = str.toUpperCase();
        System.out.println(upper);

        String sub = str.substring(3);
        System.out.println(sub);

        String replaced = str.replace('e', 'M');
        System.out.println(replaced + " " + str);


        String str1=new String("  programmer  ");
	String trimmed = str1.trim();
        System.out.println(trimmed);//removes leading and trailing spaces


    }
}