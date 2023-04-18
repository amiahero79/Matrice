package bozovic.milos;

public class Vezba11 {

	public static void main(String[] args) {

	int x[] = {25,31,12,-7,14,24,121,-35,42,15};
	int x2[] = new int [10];
	int x5[] = new int [10];
	
	int n2 = 0;
	int n5 = 0;
	for(int i = 0; i < 10; i++) {
		if(x[i] % 2 == 0) {
			
			x2[n2] = x[i];
			n2++;
		}		
	}
	for(int i = 0; i < 10; i++) {
		if(x[i] % 5 == 0) {
			
			x5[n5] = x[i];
			n5++;
		}		
	}
	System.out.println("Ispisivanje starog niza: ");
	for(int i = 0; i < 10; i++)
		System.out.print(x[i] + " ");
	System.out.println();
	System.out.println("Ispisivanje  niza deljivih sa dva: ");
	for(int i = 0; i < n2; i++)
		System.out.print(x2[i] + " ");	
	System.out.println();
	System.out.println("Ispisivanje  niza deljivih sa pet: ");
	for(int i = 0; i < n5; i++)
		System.out.print(x5[i] + " ");
	}

}
