import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Is this integer negative?");
		int x = sc.nextInt();
		
		String res = (x < 0) ? "Negative" : "Not negative";
		
		System.out.println(res);
		
		sc.close();

	}

}
