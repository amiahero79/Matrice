package bozovic.milos;

import java.util.Scanner;

public class Zadadtak8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	

		int red, kolona;
		System.out.print("Unesite broj redova: ");
		red = sc.nextInt();
		System.out.print("Unesite broj kolona: ");
		kolona = sc.nextInt();

		int a [][] = new int [red][kolona];
		
    /*   int suma = 0;
		System.out.println("Elementi prve matrice: ");
		for(int i = 0; i < red; i++) {
			for(int j = 0; j < kolona; j++) {
				System.out.print("a[" + i + "," + j + "]" + " = ");
				a [i][j] = sc.nextInt();
			//	suma += a [i][j];
			}
			
			
		}	
		
		System.out.println("Suma = " + suma); */
	/*	int max = a [0][0];
		System.out.println("Elementi prve matrice: ");
		for(int i = 0; i < red; i++) {
			for(int j = 0; j < kolona; j++) {
				System.out.print("a[" + i + "," + j + "]" + " = ");
				a [i][j] = sc.nextInt();
				if (a [i][j] > max)
					max = a [i][j];
			}
			
		}
		System.out.println(max);  */
		
		System.out.println("Elementi prve matrice: ");
		for(int i = 0; i < red; i++) {
			for(int j = 0; j < kolona; j++) {
				System.out.print("a[" + i + "," + j + "]" + " = ");
				a [i][j] = sc.nextInt();
				if (i == j) {
					System.out.println(a[i][j]);	
				}
				
			}
			
			}
			}
	}


