package bozovic.milos;

import java.util.Scanner;

public class Vezba8 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Unesite broj članova niza n: ");
	int n = sc.nextInt();
	
	int x[] = new int [n];
	
	System.out.println("Unesite elemente članova niza x: ");
	for(int i = 0; i < n; i++) {
		System.out.print("x[" + i + "] = ");
		x[i] = sc.nextInt();
	} 
	int max, min;
	max = min = x[0];
	int maxb = 0;
	int minb = 0;
	for(int i = 0; i < n; i++)	{
		
		if (max < x[i]) {
			max = x[i];
		maxb = i+1;
		}
		if(min > x[i]) {
			min = x[i];
			minb = i+1;
		}
	}
	System.out.println("Najveći član niza je: " + max + ", " + maxb + " ,a najmanji član niz je: " + min + "," + minb);	
sc.close();
	}

}
