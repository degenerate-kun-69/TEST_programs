import java.util.Scanner;

public class ReverseInt32Bit {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int integer= scanner.nextInt();
        reverse(integer);
    }

    public static int reverse(int x) {
        int rev=0;
        while(x != 0) {
            int digit = x % 10;
            rev = rev * 10 + digit;
            x /= 10;
        }
        double a = Math.pow(2,31);
        if(rev>=a-1||rev<=-a){
            rev=0;
        }
        return rev;
    }
}

