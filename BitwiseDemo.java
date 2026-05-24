public class BitwiseDemo {

    public static void main(String[] args) {

        int x = 10, y = 6, z;
        z = x & y;
        System.out.println(z);


        int a =10, b =6, c;
        c = a | b;
        System.out.println(c);


        int p =8;
        int q = p << 1;
        System.out.println(q);

    
        int m = -10;
        int n = m >> 1;

        System.out.println(Integer.toBinaryString(m));
        System.out.println(Integer.toBinaryString(n));
    }
}