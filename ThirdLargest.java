import java.util.Scanner;

public class ThirdLargest {
    static int findThirdLargest(int[] list, int n) {
        int number = 0;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (list[i] < list[j]) {
                    number = list[j];
                    list[j] = list[i];
                    list[i] = number;
                }
            }
        }
        return list[n - 3];
    }

    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter number of elements : ");
        int num = obj.nextInt();
        int[] list = new int[num];
        System.out.print("Enter the numbers : ");
        for (int i = 0; i < num; i++) {
            list[i] = obj.nextInt();
        }
        int number = findThirdLargest(list, num);
        System.out.print("The third largest number is  : " + number);
    }
}