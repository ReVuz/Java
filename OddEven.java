import java.util.Scanner;

public class OddEven {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = obj.nextInt();
		if (num % 2 == 0) {
			System.out.println("The given number " + num + " is even");
		} else {
			System.out.println("The given number " + num + " is odd");
		}
	}
}