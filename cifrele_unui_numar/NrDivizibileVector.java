package cifrele_unui_numar;
import java.util.Scanner;

public class NrDivizibileVector {
	static int v[], k;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("k = ");
		k = sc.nextInt();
		System.out.println("Vectorul: ");
		v = new int[k];
		int nr = 0;
		
		for(int i = 0; i < k; i++) {
			v[i] = sc.nextInt();
		}
		
		for(int d : v) {
			if(d % k == 0) {
				nr++;
			}
		}
		System.out.println("Numere divizbile cu "+k+": " + nr);
		sc.close();
	}

}
