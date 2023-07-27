package cifrele_unui_numar;
import java.util.Scanner;

public class SumaCifrelorUnuiNr {
	
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		
		//Declar un n și îl citesc
		System.out.print("n = ");
		int n = sc.nextInt();
		
		//Intializez suma
		int suma = 0;
		
		while(n > 0) {
			int cifra = n % 10;
			n = n / 10;
			suma = suma + cifra;
			
		}
		
		System.out.println("suma = " + suma);
		sc.close();
	}

}
