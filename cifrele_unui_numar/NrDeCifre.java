package cifrele_unui_numar;
import java.util.Scanner;
//pt fiecare cifra in parte vom creste nr cif cu 1

public class NrDeCifre {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n = ");
		int n = sc.nextInt();
		int nrCif = 0;
		
		while(n > 0) {
			int cifra = n % 10;
			n /= 10;
			nrCif++;
		}
		
		System.out.println("numarul de cifre: " + nrCif);
		sc.close();
	}

}
