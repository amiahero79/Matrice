package bozovic.milos;

import java.util.Scanner;

public class Vezba1 {

	public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        
        System.out.println("Broj redova: ");
        int red = sc.nextInt();
    
        System.out.println("Broj kolona: ");
        int kolona = sc.nextInt();
    
        int niz[][] = new int[red][kolona];
    
        System.out.println("Elementi matrice: ");
        for (int i = 0; i < red; i++) {
            for (int j = 0; j < kolona; j++) {
            System.out.println("a[" + i + ", " + j + "]" + " = ");
            niz[i][j] = sc.nextInt();
            }
        }
    
        // 8. Učitanom dvodimenzionalnom nizu zameniti redove i kolone.
    
        int[][] transponovaniNiz = new int[red][kolona];
        for (int i = 0; i < red; ++i) {
            for (int j = 0; j < kolona; ++j) {
            transponovaniNiz[j][i] = niz[i][j];
            }
        }
        System.out.println("Pocetni dvodimenzionalni niz: ");
        for (int i = 0; i < red; i++) {
            for (int j = 0; j < kolona; j++) {
    
            System.out.print(niz[i][j] + " ");
    
            }
            System.out.println("");
    
        }
    
        System.out.println("Transponovani elementi: ");
        for (int i = 0; i < red; i++) {
            for (int j = 0; j < kolona; j++) {
    
            System.out.print(transponovaniNiz[i][j] + " ");
    
            }
            System.out.println("");
        }
    
        sc.close();
        }
    
    } 


