package bozovic.milos;

import java.util.Scanner;

public class Vezba4 {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	
	System.out.println("Unesite broj članova niza n: ");
	int n = sc.nextInt();
	
	int x[] = new int [n];
	
	for(int i = 0; i<n; i++) {
		System.out.print("x[" + i + "] = ");
		x[i] = sc.nextInt();
	}
		
	for(int i = 1; i < n; i++) {
		if((x[i-1] + x[i])%2 == 0)
			System.out.print(x[i-1] + " " + x[i]);
		System.out.println();
	}
		sc.close();
	}

}
