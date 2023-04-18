package bozovic.milos;

import java.util.Scanner;

public class Vezba14 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Unesite broj redova matrice: ");;
	int red = sc.nextInt();
	System.out.print("Unesite broj kolona matrice: ");
	int kolona = sc.nextInt();
	
	int x[][] = new int [red][kolona];
	
	System.out.println("Unesite elemente matrice: ");
	for(int i = 0; i < red; i++) {
		for(int j = 0; j < kolona; j++) {
			System.out.print("x[" + i + "," + j + "] = ");
			x[i][j] = sc.nextInt();
		}
	}
	
	
	for(int i = 0; i < red; i++) {
		for(int j = 0; j < kolona; j++) {
		System.out.print(x[j][i] + " ");
			
			
			
		}
		System.out.println();
		}
		
		

	}

}
