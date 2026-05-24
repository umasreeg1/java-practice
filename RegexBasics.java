public class RegexBasics{

    public static void main(String[] args) {

        
        
        String str1= "A";
        System.out.println(str1.matches("."));//any single character

       
        String str2 = "b";
        System.out.println(str2.matches("[abc]")); // only a or b or c

       
        String str3= "p";
        System.out.println(str3.matches("[^abc]")); // anything except a, b, c

     
        String str4= "7";
        System.out.println(str4.matches("[a-zA-Z0-9]"));// single alphanumeric character

        
        String str5 = "a";
        System.out.println(str5.matches("a|b"));// either a or b

        
        String str6 = "_";
        System.out.println(str6.matches("\\w"));//any word character (a-z, A-Z, 0-9, _)

        
        String str7 = "5";
        System.out.println(str7.matches("\\d"));//digit (0-9)

        //non-digit
        String str8= "$";
        System.out.println(str8.matches("\\D"));   //non-digit
    }
}