package bozovic.ilos;

public class Zadatak4 {

	public static void main(String[] args) {
		
		int [][] matrica = {{1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 1, 1, 1 }, {1, 1, 1, 1, 1}, {1, 1, 1, 1, 1 }};	
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j <5; j++) {
				if(j <= i)
				System.out.print(matrica[i][j] + " "); 
			}
			System.out.println();
		}	
		
		
		

	}

}
