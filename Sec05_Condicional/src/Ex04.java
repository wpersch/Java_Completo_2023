import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How long did it game last?");
		System.out.print("Start hour (integer): ");
		int s = sc.nextInt();
		System.out.print("End hour (integer): ");
		int e = sc.nextInt();
		
		int res = (e > s) ? (e - s) : (e + 24 - s);
		System.out.printf("The game lasted %d hour(s).", res);
		
		sc.close();
	}

}
