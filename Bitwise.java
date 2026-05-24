public class Bitwise {

    public static void main(String[] args) {

        //swapping
        int a = 10, b = 15;
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println(b);

        //MERGING 
        byte x = 9, y = 12;
        byte c = (byte)((x << 4) | y);

        System.out.println(c);

        // MASKING
        int x1 = (c & 0b11110000) >> 4;
        int y1 = (c & 0b00001111);

        System.out.println(x1);
        System.out.println(y1);
    }
}