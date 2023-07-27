package cifrele_unui_numar;
import java.util.Scanner;

public class CateNrImpareSuma {
	static int v[], k;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("k = ");
		k = sc.nextInt();
		System.out.println("Vectorul: ");
		v = new int[k];
		int nrElem = 0;
		int suma = 0;
		
		for(int i = 0;  i < k; i++) {
			v[i] = sc.nextInt();
		}
		
		for(int imp : v) {
			if(imp % 2 == 1) {
				nrElem++;
				suma = suma + imp;
			}
		}
		System.out.println("nr. elementelor impare: " + nrElem);
		System.out.println("suma = " + suma);
		sc.close();
	}

}
