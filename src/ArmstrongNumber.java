import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;
        int temp = n;
        int numOfDigits = String.valueOf(n).length();


        while (temp > 0) {
            int digit = temp % 10;
            result += Math.pow(digit, numOfDigits);
            temp /= 10;
        }

        if (result == n) {
            System.out.println(n + " is an Armstrong number.");
        } else {
            System.out.println(n + " is not an Armstrong number.");
        }
    }
}
