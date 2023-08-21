import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Income tax");
		System.out.print("Enter the Income: ");
		double income = sc.nextDouble();
		double tax = 0.0;
		
		if(income <= 2000.00 )
			tax = 0.0;
		else if (income <= 3000.0)
			tax = (income - 2000.0) * 0.08;
		else if (income <= 4500.0)
			tax = (income - 3000.0) * 0.18 + 1000.0 * 0.08;
		else
			tax = (income - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 *0.08;
		
		if (tax == 0)
			System.out.println("Exempt from income tax.");
		else
			System.out.printf("The tax is $ %.2f", tax);
		
		sc.close();
		
	}

}
