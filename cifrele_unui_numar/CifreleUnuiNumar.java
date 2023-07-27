package cifrele_unui_numar;

import java.util.Scanner;

public class CifreleUnuiNumar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n = ");
		int n = sc.nextInt();
		
		System.out.println("Cifrele numărului: ");
		while (n > 0) {// Cat timp numarul meu mai are cifre
			int cifra =  n % 10;
			
			// tai cifra de la numar
			n = n / 10;
			System.out.print(cifra + " ");
		}
		sc.close();
	}
}

/*
 * Exemplu n = 123 
 * 123 > 0? adevarat 
 * 1. cifra = 123 % 10 => cifra = 12 
 * se taie cifra 3 si ramanem cu n = 12 
  
 * 12 > 0? adevarat 
 * 2. cifra = 12 % 10 => cifra = 2 
 * se taie cifra 2 si ramanem cu n = 1 
 
 * 1 > 0? adevarat 
 * 3. cifra = 1 % 10 => cifra = 0 se iese din structura repetitiva
 */
   

