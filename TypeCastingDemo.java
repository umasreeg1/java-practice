public class TypeCastingDemo {

    public static void main(String[] args) {

        // WIDENING (automatic)
        byte b = 5;
        short s = 120;

        int i = b;     
        long l = s;     
        float f = i;   
        double d = f;   

        System.out.println("Widening:");
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);

        // NARROWING (manual casting)
        double x = 10.75;
        float y = (float) x;
        int z = (int) y;
        short p = (short) z;
        byte q = (byte) p;

        System.out.println("Narrowing:");
        System.out.println(y);
        System.out.println(z);
        System.out.println(p);
        System.out.println(q);
    }
}