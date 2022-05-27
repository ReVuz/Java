import java.util.Scanner;
public class Area {
	public int area(int l,int b) {
		return(l*b);
	}
	public int area(int a) {
		return (a*a);
	}
	public double area(float r) {
		return(3.14*r*r);
	}
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		Area a = new Area();
		char ans;
		do {
			System.out.println("Compute area of different shapes"
					+ "\nAvailable Shapes"
					+ "\n1. Rectangle"
					+ "\n2. Square"
					+ "\n3. Circle"
					+ "\n4. Exit"
					+ "\nChoose from above : ");
			int num = obj.nextInt();
				
			if (num==1) {
				System.out.println("Enter the length and breadth of rectangle : ");
				int length = obj.nextInt();
				int breadth = obj.nextInt();
				System.out.println("Area of rectangle : "+a.area(length,breadth));
			}
			else if (num==2) {
				System.out.println("Enter the side of square : ");
				int side = obj.nextInt();
				System.out.println("Area of Square : "+a.area(side));
		}
			else if (num==3) {
				System.out.println("Enter radius of circle : ");
				float radius = obj.nextFloat();
				System.out.println("Area of Circle : "+a.area(radius));
		}
			else {
				System.out.println("Thank You");
			}
			System.out.println("Do you want to continue ?(y/n) ");
			ans = obj.next().charAt(0);
		}while(ans == 'y');
			System.out.println("Thank You");
}
	}
