
public class StringMethods2 {

    public static void main(String[] args) {
        
        
        String str1="Miss.Uma Sree";
        System.out.println(str1.startsWith("Miss."));
        System.out.println(str1.startsWith("Uma" , 3));
        System.out.println(str1.endsWith("Sree"));
        System.out.println(str1.charAt(7));
        
        
     
        String str2="www.google.com";
        System.out.println(str2.indexOf("."));
        System.out.println(str2.indexOf(".",4));
        System.out.println(str2.indexOf("google"));
        System.out.println(str2.lastIndexOf("."));
    }
    
}