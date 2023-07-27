package good_practice;

import java.util.Scanner;
public class InversulUnuiNr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n = ");
		int n = sc.nextInt();
		int inv = 0;
		
		while(n > 0) {
			int cifra = n % 10;
			n /= 10;
			inv = inv * 10 + cifra;
		}
		System.out.println("inversul: " + inv);
		sc.close();
	}

}
