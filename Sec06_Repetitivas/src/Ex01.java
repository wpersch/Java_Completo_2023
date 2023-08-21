import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int password = 2002;
		
		System.out.print("Enter the password: ");
		int enter = sc.nextInt();
		
		while (enter != password) {
			System.out.println("Incorret password. Access denied!");
			System.out.print("Enter the password: ");
			enter = sc.nextInt();			
		}
		
		System.out.println("Allowed access!");
		
		sc.close();
	}

}
