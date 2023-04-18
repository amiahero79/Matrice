package bozovic.milos;

import java.util.Scanner;

public class Vezba13 {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	
	System.out.println("Unesite broj redova matrice: ");
	int red = sc.nextInt();
	System.out.println("Unesite broj kolona matrice: ");
	int kolona = sc.nextInt();
	
	int x[][] = new int [red][kolona];
	
	System.out.println("Unesite elemente matrice x: ");
	for(int i = 0; i < red; i++) {
		for(int j = 0; j < kolona; j++) {
			System.out.print("x[" + i + "," + j + "] = ");
			 x[i][j] = sc.nextInt(); 
		}
	}
	double s = 0;
	double artS = 0;
	int br = 0;
	for(int i = 0; i < red; i++) {
		artS = 0;
		s = 0;
		System.out.println("ArtSredina parnih elemenata na koloni je: ");
		for(int j = 0; j < kolona; j++) {
			if(x[j][i] % 2 == 0) {
				s += x[j][i];
				br++;
				artS = s/br;
				
			}
			
		}
		br = 0;
		System.out.println(artS);
	}
		
		
	}

}
