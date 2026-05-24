public class StringReferenceDemo {

    public static void main(String[] args) {

        String str1 = "Java Program";
        System.out.println(str1);

        String str2 = new String("JAVA");
        System.out.println(str2);

       
        char c[] = {'H','e','l','l','o'};
        String str3 = new String(c);
        System.out.println(str3);

        String str4 = new String(c, 1, 3); // from index 1, 3 chars
        System.out.println(str4);

        
        String s1 = "Java";
        String s2 = new String("Java");//reference string

        System.out.println(s1 == s2);
    }
}