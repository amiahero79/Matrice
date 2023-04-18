package bozovic.ilos;

import java.util.Scanner;

public class Zadatak11 {

	public static void main(String[] args) {
	
		
Scanner sc = new Scanner(System.in);	
		
		System.out.print("Unesite broj redova dvodimenzion. niza: ");
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
		for(int i = 0; i < red; i++) {
			for(int j = 0; j < kolona; j++) {
				if(matrica[i][j] < 0) {
					suma += matrica[i][j];
					System.out.print(matrica[i][j] + " ");
				 System.out.println();
				}
			} 
			
		}	System.out.println("Suma elemenata većih od 3: " + suma);
			sc.close();		
		
		

	}

}
