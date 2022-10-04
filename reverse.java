import java.util.Scanner;

public class reverse {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = obj.nextInt();
		int n = num;
		int rev = 0;
		while (n != 0) {
			int r = n % 10;
			rev = rev * 10 + r;
			n = n / 10;
		}
		System.out.print("Reverse of " + num + " is : " + rev);
	}
}
