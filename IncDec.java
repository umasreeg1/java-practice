public class IncDec {

    public static void main(String[] args) {
        
        int x=5;
        x++;  
        System.out.println(x);
    
        // POST INCREMENT
        int a = 5, b;
        b = a++;   // b gets old value of a
        System.out.println(b);

        // PRE INCREMENT
        int c = 5, d;
        d = ++c;   // y gets new value of x
        System.out.println(d);

    }
}