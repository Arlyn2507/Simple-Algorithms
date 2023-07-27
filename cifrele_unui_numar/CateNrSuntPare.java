package cifrele_unui_numar;
import java.util.Scanner;

public class CateNrSuntPare {
	static int v[], k;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("k = ");
		k = sc.nextInt();
		System.out.println("Vectorul: ");
		v = new int[k];
		int nrElem = 0;
		
		for(int i = 0; i < k; i++) {
			v[i] = sc.nextInt();
		}
		
		for(int pare : v) {
			if(pare % 2 == 0) {
				nrElem++;
			}
		}
		
		System.out.println("nr. elem pare din vector: " + nrElem);
		sc.close();
	}

}
