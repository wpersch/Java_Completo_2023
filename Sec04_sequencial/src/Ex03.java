import java.util.Locale;
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int a, b, c, d;
		
		System.out.println("Type four integer number: ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		
		int res = (a * b - c * d);
		
		System.out.printf("Difference = %d", res);
		
		sc.close();

	}

}
