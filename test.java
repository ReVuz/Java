public class Show {
Show() { }
public void show() { System.out.println("Show"); }}
public class DiceShow extends Show {
private int sides;
DiceShow(int sideCount) { this.sides = sideCount; }
public void show(int size) { System.out.println("ONE"); }
public void show() { System.out.println(super.show()); }
public int getSidesCount() { return sides; }}
public class StudentGrades{
	public static void main(String[] args) {
        Show show = new DiceShow(8);
        show.show();
	}

}
