package bozovic.ilos;

import java.util.Scanner;

public class Zadatak12 {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);	
		
		System.out.print("Unesite broj redova: ");
		int red = sc.nextInt();
		System.out.print("Unesite broj kolona: ");
		int kolona = sc.nextInt();
		
			
		int matrica[][] = new int [red][kolona];
		
		System.out.println("Unesite elemente: ");
		
		for(int i = 0; i < red; i++) {
			for(int j = 0; j < kolona; j++) {
				System.out.print("matrica[" + i + ", " + j + "]" + " = ");
				matrica[i][j] = sc.nextInt();
			}
		}  
		for(int i = 0; i < red; i++) {
			for(int j = 0; j < kolona; j++) {
				System.out.print(matrica[i][j] + " ");
			}
			System.out.println();
		}	
		System.out.println();
		int suma = 0;
		int brojac = 0;
		for(int i = 0; i < red; i++) {
			for(int j = 0; j < kolona; j++) {
				
					brojac ++;
					suma += matrica[i][j];
				
			}
			
		}	System.out.println("Aritmeticka sredina matrice iznosi: " + (double)(suma/brojac));
			sc.close();		
		
		
		

	}

}
