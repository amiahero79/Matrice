package bozovic.milos;

import java.util.Scanner;

public class Vezba6 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Unesite broj članova niza n: ");
	int n = sc.nextInt();
	
	int x[] = new int [n];
	
	for(int i = 0; i < n; i++) {
		System.out.print("x[" + i + "] = ");
		x[i] = sc.nextInt();
	}
	int cifra;
	for (int i = 0; i < n; i++) {
		int max = 0;
		int a = x[i];
		while(a != 0) {
			cifra = a % 10;
			if(max < cifra)
				max = cifra;
			
			a /= 10;
			
			
		}
		System.out.println("Najveća cifra člana niza " + x[i] + " je = " + max );
	}
	sc.close();
	}

}
