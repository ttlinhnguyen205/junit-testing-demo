
import java.util.Scanner;

public class Main {

    public static String checkNumber(int n) {
        if (n % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    public static int sumUpToN(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) { 
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();

        System.out.println("Loai so: " + checkNumber(n));
        System.out.println("Tong tu 1 den n: " + sumUpToN(n));
    }
} 