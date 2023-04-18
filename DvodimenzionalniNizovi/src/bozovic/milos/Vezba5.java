package bozovic.milos;

import java.util.Scanner;

public class Vezba5 {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);	
		
		System.out.print("Unesite broj redova: ");
		int red = sc.nextInt();
		System.out.print("Unesite broj kolona: ");
		int kolona = sc.nextInt();
		
		int a[][] = new int [red][kolona];
		int b[][] = new int [red][kolona];
		int c[][] = new int [red][kolona];
		
		for(int i = 0; i < red; i++) {
			for(int j = 0; j< kolona; j++) {
				System.out.print("a[" + i + ", " + j + "]" + " = ");
				a[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 0; i < red; i++) {
			for(int j = 0; j< kolona; j++) {
				System.out.print("b[" + i + ", " + j + "]" + " = ");
				b[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Proizvod dvodimen. niza a i b je: ");
		System.out.println();
		for(int i = 0; i < red; i++) {
			for(int j = 0; j < kolona; j++) {
				c[i][j] = a[i][j] * b[i][j];
					
					System.out.print(c[i][j] + " ");
			} 
			System.out.println();
		} 	
		
		
		
		
		
	}

}
