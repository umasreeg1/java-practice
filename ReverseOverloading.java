public class ReverseOverloading {

  
    int reverse(int n) {
        int rev = 0;

        while (n > 0) {
            rev = rev * 10 + n % 10;
            n = n / 10;
        }

        return rev;
    }

    
    int[] reverse(int[] arr) {
        int[] revArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            revArr[i] = arr[arr.length - 1 - i];
        }

        return revArr;
    }

    public static void main(String[] args) {

        ReverseOverloading obj = new ReverseOverloading();

        System.out.println("Reversed Number: " + obj.reverse(237));

        int[] a = {10, 20, 30, 40, 50};
        int[] b = obj.reverse(a);

        System.out.print("Reversed Array: ");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
    }
}