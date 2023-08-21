import java.util.Locale;
import java.util.Scanner;

public class Ex04 {
	
	public static void main (String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Employee number: ");
		int n = sc.nextInt();
		
		System.out.print("Worked hours: ");
		int h = sc.nextInt();
		
		System.out.print("Pay per hour: ");
		double p = sc.nextDouble();
		
		System.out.println();
		System.out.printf("Number: %d\n", n);
		System.out.printf("Salary: U$ %.2f", (h * p));
		
		sc.close();
	}

}
