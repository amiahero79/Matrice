package bozovic.milos;

import java.util.Scanner;

public class Vezba4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	
		
		System.out.print("Unesite broj redova: ");
		int red = sc.nextInt();
		System.out.print("Unesite broj kolona: ");
		int kolona = sc.nextInt();
		
		int niz[][] = new int [red][kolona];
		
		for(int i = 0; i < red; i++) {
			for(int j = 0; j< kolona; j++) {
				System.out.print("niz[" + i + ", " + j + "]" + " = ");
				niz[i][j] = sc.nextInt();
			}
		}
		System.out.println();
		for(int i = 0; i < red; i++) {
			for(int j = 0; j < kolona; j++) {
				if((i+1)%2 == 0 )
					System.out.print(niz[i][j] + " ");
			} 
		} 	
		
		
		
		

	}

}
