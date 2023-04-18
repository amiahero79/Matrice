package bozovic.milos;

import java.util.Scanner;

public class Vezba12 {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	
	System.out.print("Unesite broj redova matrice: ");
	int red = sc.nextInt();
	
	System.out.println("Unesite broj kolona matrice: ");
	int kolona = sc.nextInt();
	
	int x [][] = new int [red][kolona];
	
	System.out.println("Unesite elemente matrice x: ");
	for(int i = 0; i < red; i++) {
		for(int j = 0; j < kolona; j++) {
			System.out.print("x[" + i + "," + j + "] = ");
			x[i][j] = sc.nextInt();
			}
	}
	int brojac = 0;
	double s = 0;
	double artSredina = 0;
	   for (int i = 0; i < red; i++) {
           s = 0;
           artSredina = 0;
           System.out.println("Aritmeticka sredina parnih elemenata na koloni " + (i + 1) + " iznosi: ");
           for (int j = 0; j < kolona; j++) {
   
           if (x[j][i] % 2 == 0) {
               s += x[j][i];
               brojac++;
               artSredina = s / brojac;
           }
           }
           brojac = 0;
           System.out.println(artSredina);
           System.out.println();
       }
		
		sc.close();
		
	}

}
