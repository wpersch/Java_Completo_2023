import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Type the code, the amount and then Enter: ");
		int code = sc.nextInt();
		int amount = sc.nextInt();
		
		double price;
		switch (code) {
		case 1:
			price = 4.00;			
			break;			
		case 2:
			price = 4.50;			
			break;		
		case 3:
			price = 5.00;			
			break;		
		case 4:
			price = 2.00;			
			break;
		case 5:
			price = 1.50;			
			break;
		default:
			price = 0.0;
			break;
		}
		
		if (price == 0.0) {
			System.out.println("Code not found!");
		} else {
			System.out.printf("Total: $ %.2f", (amount * price));
		}
		
		sc.close();
	}

}
