import java.util.Scanner;

public class input {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter any two numbers : ");
		int x = obj.nextInt();
		int y = obj.nextInt();
		int z = x + y;
		System.out.println("Sum of " + x + " and " + y + " is : " + z);
	}
}