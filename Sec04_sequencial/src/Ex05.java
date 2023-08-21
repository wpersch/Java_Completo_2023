import java.util.Locale;
import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("piece 1");
		
		sc.nextInt();
		int amount1 = sc.nextInt();
		float price1 = sc.nextFloat();

		System.out.println("piece 2");
		
		sc.nextInt();
		int amount2 = sc.nextInt();
		float price2 = sc.nextFloat();
		
		System.out.printf("Amount to pay: %.2f", (amount1 * price1 + amount2 * price2));
		
		
		sc.close();

	}

}
