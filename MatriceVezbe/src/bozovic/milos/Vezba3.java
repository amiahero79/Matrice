package bozovic.milos;

import java.util.Scanner;

public class Vezba3 {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	
	System.out.println("Unesite broj članova niza: ");
	int n = sc.nextInt();
	
	int x[] = new int [n];
	
	System.out.print("Unesite elemente niza x: ");
	for(int i = 0; i < n; i++) {
		System.out.print("x[" + i + "] = ");
		x[i] = sc.nextInt();
	}
	int p = 1;
	for (int i = 0; i <n; i++) {
		if(x[i] >= 3 && x[i]<= 9) {
			p *= x[i];
		}
	}
	System.out.println(p);
	sc.close();
		
		
		
	}

}
