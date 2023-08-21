import java.util.Locale;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Type the circle radius: ");
		double r = sc.nextDouble();
		double area = (double) Math.PI * Math.pow(r, 2);
		
		
		System.out.printf("The circle area is: %.4f", area);
		
		sc.close();

	}

}
