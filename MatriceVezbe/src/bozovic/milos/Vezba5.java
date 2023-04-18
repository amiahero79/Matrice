package bozovic.milos;

import java.util.Scanner;

public class Vezba5 {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	
	System.out.println("Unesite broj članova niza n: ");
	int n = sc.nextInt();
	
	int x[] = new int [n];
	
	System.out.println("Unesite elemente članova niza x: ");
	for (int i = 0; i < n; i++) {
		System.out.print("x[" + i + "] = ");
		x[i] = sc.nextInt();
	}
	int p = 1;
	for(int i = 0; i < n; i++)	{
		if(x[i] % 4 != 0) {
			p *=  x[i];
		}
	}
	System.out.println("Proizvod članova nedeljivih sa 4 je: " + p);	
sc.close();
	}

}
