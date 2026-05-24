
public class RegaxTask1{

    public static void main(String[] args) {
    
        int b=100110010;  
        String str=String.valueOf(b);
        System.out.println(str.matches("[01]+"));
        
         
        String str1="a!B@c#1$2%3";
        str1=str1.replaceAll("[^a-zA-Z0-9]", "");       
        System.out.println(str1);
        
        
        String str3="      abc     def     gh   ijk    ";
        str3=str3.replaceAll("\\s+", " ").trim();
        String words[]=str.split("\\s");
        System.out.println(words.length);
        
        
    }  
}