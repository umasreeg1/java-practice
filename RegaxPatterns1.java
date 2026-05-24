public class RegexPatterns1{

    public static void main(String[] args) {

        String str1;

        str1 = "abcdef";
        System.out.println(str1.matches("[abc]*"));// zero or more occurrences

        
        str1 = "accbdef";
        System.out.println(str1.matches("[abc]{3,7}"));//repetition range

        str1 = "abcdef";
        System.out.println(str1.matches(".*"));//any characters (0 or more)


        str1 = "uma@gmail.com";
        System.out.println(str1.matches("\\w+@gmail\\.com"));//Simple Gmail check

        str1 = "uma@gmail.co.in";
        System.out.println(str1.matches("\\w*@gmail(.*)")); //Gmail check with any domain after gmail


        str1 = "john.doe123+test@gmail.com";
        System.out.println(str1.matches("[a-zA-Z0-9._%+-]+@gmail\\.com"));//Improved email validation
    }
}