package bozovic.milos;

import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Broj redova: ");
		int red = sc.nextInt();
		
		System.out.print("Unesite broj kolona: ");
		int kolona = sc.nextInt();
		
		int niz [][] = new int [red][kolona];
		
		System.out.println("Elementi matrice: ");
		for(int i = 0; i < red; i++) {
			for(int j = 0; j < kolona; j++) {
				System.out.print("a[" + i + ", " + j + "]" + "= " );
				niz [i][j] = sc.nextInt();
		}
		}
			// ispisivanje elemenata
		System.out.println("Elementi dvodimenzijalnog niza su: ");
			for(int i = 0; i < red; i++) {
				for(int j = 0; j < kolona; j++); {	
		

	}
				for(int c = 0; c < red; c++) {
					for(int d = 0; d < kolona; d++) {
						if(d == 1)
							System.out.println(niz [c][d] + " ");

			}
					}}}}
