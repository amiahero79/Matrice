package bozovic.milos;

public class Vezba9 {

	public static void main(String[] args) {
	
		
	
		
		
	int x[] = {25,31,12,-7,14,24,121,-35,42,15};
	int	x2[] = new int [10];
	int	x5[] = new int [10];
	
	int x2b = 0, x5b = 0;
	for(int i = 0; i < 10; i++) {
		if(x[i] %2 == 0) {
			x2b++;
			x2[x2b] = x[i];
		
		}
	}
	for(int i = 0; i < 10; i++) {
		if(x[i]%5 == 0){
			x5b++;
			x5[x5b] = x[i];
		
		}
	}
	System.out.println("Postojeći niz: ");
	for(int i = 0; i <10; i++)	{	
		System.out.print(x[i] + " ");
	}
	System.out.println();
	System.out.println("Niz deljivih sa dva: ");
	for(int i = 1; i <=x2b; i++)		{
		System.out.print(x2[i] + " ");
	}
	System.out.println();
	System.out.println("Niz deljivih sa 5: ");
	for(int i = 1; i <=x5b; i++)		{
		System.out.print(x5[i] + " ");
	}	

	}

}
