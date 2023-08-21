import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Coordinates of apoint in a plane:");
		System.out.print("Enter two real numbers: ");
		double first = sc.nextDouble();
		double second = sc.nextDouble();

		if (first == 0.0) {
			if (second == 0.0)
				System.out.println("Origin");
			else 
				System.out.println("On the Y axis");
			
		} else if (first > 0) {
			if (second == 0)
				System.out.println("On the X axis");
			else if (second > 0)
				System.out.println("Q1");
			else
				System.out.println("Q4");
		
		} else {
			if (second == 0)
				System.out.println("On the X axis");
			else if (second > 0)
				System.out.println("Q2");
			else
				System.out.println("Q3");
		}

		sc.close();

	}

}
