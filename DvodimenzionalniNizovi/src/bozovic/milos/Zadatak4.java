package bozovic.milos;

import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {

	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Unesite broj redova: ");
	int red = sc.nextInt();
	System.out.print("Unesite broj kolona: ");
	int kolona = sc.nextInt();
	
	int niz[][] = new int [red][kolona];
	
	for(int i = 0; i < red; i++) {
		for(int j = 0; j < kolona; j++) {
			System.out.print("niz[" + i + ", " + j + "]" + " =");
			niz[i][j] = sc.nextInt(); 
			
		}
	
	}
	
//	System.out.println();
//	for(int i = 0; i < red; i++)  {
 //       for(int j = 0; j < kolona; j++)  {
    //    	if(niz[i][j]%2 ==0 )
    //    	System.out.println(niz[i][j] + " ");
    //    }
//	} 
//	System.out.println();
	//for(int i = 0; i < red; i++)  {
      //  for(int j = 0; j < kolona; j++)  {
        //	if(niz[i][j]%2 !=0 )
        	//System.out.println(niz[i][j] + " ");
        //}
	//} 	
	/*
	for(int i = 0; i < red; i++) {
		for( int j = 0; j < red; j++) {
			if ((i+1)%2 == 0) //za ispitivanje redova
				// if(i%2 == 0) za ispitivanje indeksa
			System.out.println(niz[i][j] + " ");
				
		}
	}
		*/
	// matrica nema nulti red
	// matrica ima nulti indeks
	
	// 0. indeks matrice je oznaka 1. reda
	
	
	
	
		
	}

}
