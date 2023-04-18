package bozovic.milos;

import java.util.Scanner;

public class Vezba2 {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);	
	
	System.out.println("Unesite broj redova dvodimenzijalnog niza: ");
	int red = sc.nextInt();
	
	System.out.println("Unesite broj kolona dvodimenzijalnog niza: ");
	int kolona = sc.nextInt();
	
	int a[][] = new int [red][kolona];
	int b[][] = new int [red][kolona];
	int c[][] = new int [red][kolona];
	
	System.out.println("Unesite elemente matrice a: ");
	for(int i = 0; i< red; i++) {
		for(int j = 0; j < kolona; j++) {
			System.out.print("a[" + i + "," + j + "] = ");
			a[i][j] = sc.nextInt();
		}
	}
	System.out.println("Unesite elemente matrice b: ");
	for(int i = 0; i< red; i++) {
		for(int j = 0; j < kolona; j++) {
			System.out.print("b[" + i + "," + j + "] = ");
			b[i][j] = sc.nextInt();
		}
	}	
	for(int i = 0; i< red; i++) {
		for(int j = 0; j < kolona; j++) {	
			c[i][j]= a[i][j]- b[i][j];
		}
		
		}
	System.out.println("Ispisivanje razlike matrice a i b: ");
	for(int i = 0; i < red; i++) {
		for(int j = 0; j < kolona; j++) {
			System.out.print(c[i][j] + " ");
		}
		System.out.println();
		sc.close();
	}
		
	}

}
