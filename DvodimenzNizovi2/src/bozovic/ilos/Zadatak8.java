package bozovic.ilos;

public class Zadatak8 {

	public static void main(String[] args) {
		
		int [][] matrica = {{1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 1, 1, 1 }, {1, 1, 1, 1, 1}, {1, 1, 1, 1, 1 }};	
		
		System.out.println("Početni elementi: ");
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.print(matrica[i][j] + " ");
			}
			System.out.println();
		}	
		
		System.out.println("Novi elementi: ");
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < (5-i); j++) {
				
				System.out.print(matrica[i][j] + " "); 
			}
			System.out.println();	
		
		}}}

	


