package bozovic.milos;

import java.util.Scanner;

public class Zadatak6 {

	public static void main(String[] args) {


Scanner sc = new Scanner(System.in);	

int red, kolona;
System.out.print("Unesite broj redova: ");
red = sc.nextInt();
System.out.print("Unesite broj kolona: ");
kolona = sc.nextInt();

int a [][] = new int [red][kolona];
int b [][] = new int [red][kolona];
int c [][] = new int [red][kolona];

System.out.println("Elementi prve matrice: ");
for(int i = 0; i < red; i++) {
	for(int j = 0; j < kolona; j++) {
		System.out.print("a[" + i + "," + j + "]" + " = ");
		a [i][j] = sc.nextInt();
		
	}
}
System.out.println("Elementi prve matrice: ");
for(int i = 0; i < red; i++) {
	for(int j = 0; j < kolona; j++) {
		System.out.print("a[" + i + "," + j + "]" + " = ");
		b [i][j] = sc.nextInt();
		
	}
}
System.out.println("Elementi dvodimenzijalnog niza su: ");
for(int i = 0; i < red; i++) {
	for(int j = 0; j < kolona; j++) {
		System.out.print(a [i][j] + " ");
	}
	System.out.println();
	}
for(int i = 0; i < red; i++) {
	for (int j = 0; j < kolona; j++) {
		c [i][j] = a [i][j] + b [i][j];
	}
	}
for(int i = 0; i < red; i++) {
	for (int j = 0; j < kolona; j++) {
		System.out.print(c [i][j] + " ");
		
	}
	System.out.println();
	}	
	}
	}
	


