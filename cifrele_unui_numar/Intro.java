package cifrele_unui_numar;

import java.util.Scanner;

public class Intro {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// Declar un n
		System.out.print("n = ");
		// Citesc n-ul de la tastatura
		int n = sc.nextInt();
		
		//Ultima cifra
		int ultimaCifra = n % 10; //împărțire cu rest
		System.out.println("ultima cifra = " + ultimaCifra);
		
       //Taierea ultimei cifre
		int taiereaUltimeiCifre = n /10; //împărțire întreagă 
		System.out.println("ultima cifra taiata = " + taiereaUltimeiCifre);
		sc.close();
	}

}
