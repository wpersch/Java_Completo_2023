import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y = 0;
		
		System.out.print("Digite um inteiro: ");
		x = sc.nextInt();
		
		System.out.print("Digite outro inteiro: ");
		y = sc.nextInt();
		
		System.out.printf("A soma de %d e de %d é: " + (x+y), x, y);
		
		
		sc.close();

	}

}
