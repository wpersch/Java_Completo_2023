import java.util.Scanner;

public class EX03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1. Alcohol\n2. Gasoline\n3. Diesel\n4. Exit\n");
		System.out.println("--------");
		System.out.print("Enter your favorite fuel: ");
		
		int alcohol = 0;
		int	gasoline = 0;
		int diesel = 0;
		int fuel = sc.nextInt();
		
		while(fuel != 4) {
			if (fuel == 1) alcohol += 1;
			if (fuel == 2) gasoline += 1;
			if (fuel == 3) diesel += 1;
			System.out.print("Enter your favorite fuel: ");
			fuel = sc.nextInt();
			
		}
		
		System.out.println("-------");
		System.out.println("Thank you!");
		System.out.println("Alcohol:" + alcohol);
		System.out.println("Gasoline:" + gasoline);
		System.out.println("Diesel:" + diesel);
		
		sc.close();

	}

}
