package cifrele_unui_numar;
import java.util.Scanner; 

public class FormareaNr {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Declar un n si il citesc
		System.out.print("n = ");
		int n = sc.nextInt();
		
		int nrNou = 0;
		int p = 1;
		
		while(n != 0) {
			int cifra = n % 10; //obtin cifra de la numar
			n = n / 10; //elimin cifra de la numar
		
			if(cifra % 2 == 0) {
				nrNou = (cifra + 1) * p + nrNou; //daca nr este par atunci îl cresc cu o unitate. Apoi il inmultesc cu o putere a lui 10 si adaug vechea valoare a numarului
				p = p * 10;
			
			} else {
				nrNou = cifra * p + nrNou;
				p = p * 10;
			}
			
		}
		
		System.out.println("noul numar: " + nrNou);
		sc.close();
	}
}