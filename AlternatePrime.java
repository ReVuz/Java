import java.util.Scanner;

public class AlternatePrime {
    public static int checkPrime(int end) {
        int i, flag = 0;
        for (i = 2; i <= end / 2; i++) {
            if (end % i == 0) {
                flag = 1;
                break;
            }
        }
        if (flag == 0)
            return 1;
        else
            return 0;
    }

    public static void alternatePrime(int end) {
        int alternate = 0;
        for (int i = 2; i < end; i++) {
            if (checkPrime(i) == 1) {
                if (alternate % 2 == 0) {
                    System.out.print(i + " ");
                }
                alternate++;
            }
        }
    }

    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter Range : ");
        int end = obj.nextInt();
        System.out.println("Alternate prime numbers till " + end + " are : ");
        alternatePrime(end);

    }
}