package cifrele_unui_numar;

import java.util.Scanner;
public class ScazandCuOUnitate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Declar un n și îl citesc
		System.out.print("n = ");
		int n = sc.nextInt();
		int nr = 0;
		int p = 1;
		
		while(n > 0) {
			if(n % 2 == 0) {
				n = n - 1;
			}
			
			nr = nr + (n % 10) * p;
			p = p * 10;
			n = n / 10;
		}
		System.out.println("noul nr: " + nr);
		sc.close();
	}

}
