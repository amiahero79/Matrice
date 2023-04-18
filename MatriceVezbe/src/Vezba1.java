import java.util.Scanner;

public class Vezba1 {

	public static void main(String[] args) {

	//Učitavanje podataka
		
	Scanner sc = new Scanner(System.in);
	
	
	System.out.print("Unesite broj redova: ");
	int red = sc.nextInt();
	System.out.print("Unesite broj kolona: ");
	int kolona = sc.nextInt();
	
	int a[][] = new int [red][kolona];
	
	System.out.println("Inesite elemente: ");
	
	for(int i = 0; i < red; i++) {
		for(int j = 0; j < kolona; j++) {
			System.out.print("a[" + i + "," + j + "] = ");
			a[i][j] = sc.nextInt();
		}
	}
		
	System.out.println("Ispisivanje matrice: ");
	for(int i = 0; i < red; i++) {
		for(int j = 0; j < kolona; j++) {
			System.out.print(a[i][j] + " ");
			
		}
		System.out.println();
	}
		
	}

}
