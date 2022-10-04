import java.util.Scanner;

class StudentGrades {
	String[] name;
	int[] rno;
	float[][] sub;
	float[] total;
	public StudentGrades (int num) {
		String[] name = new String[num];
		int[] rno = new int[num];
		float[]sub = new float[num];
		float[] total = new float[num];
	}
	
	public void input(int num) {
		Scanner myobj = new Scanner(System.in);
		String[] name = new String[num];
		int[] rno = new int[num];
		float[] sub1 = new float[num];
		float[] sub2 = new float[num];
		float[] sub3 = new float[num];
		float[] total = new float[num];
		for(int i = 0;i<num;i++) {
		System.out.print("Enter Name : ");
		name[i] = myobj.nextLine();
		System.out.print("Enter Roll No : ");
		rno[i] = myobj.nextInt();
		System.out.print("Enter Marks of 3 subjects(out of 100) : ");
		sub1[i] = myobj.nextFloat();
		sub2[i] = myobj.nextFloat();
		sub3[i] = myobj.nextFloat();
		total[i]= sub1[i]+sub2[i]+sub3[i];
		System.out.println("total " + i+1 +" = "+total[i]);
			}
			
	}
	public void display(int num) {
		for(int i = 0;i<num;i++) {
			System.out.println("Details of Student "+i+" : ");
			System.out.println("Name : "+name[i]);
			System.out.println("Roll Number : "+rno[i]);
			System.out.println("Total Marks : "+total[i]);
		}
	}
	public static void main(String[] args) {
		Scanner newobj = new Scanner(System.in);
		System.out.print("Enter number of students : " );
		int num = newobj.nextInt(); 
		StudentGrades details = new StudentGrades(num);
		details.input(num);
		details.display(num);
	}

}
