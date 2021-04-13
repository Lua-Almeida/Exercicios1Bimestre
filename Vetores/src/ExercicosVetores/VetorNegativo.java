package ExercicosVetores;

import java.util.Scanner;

public class VetorNegativo {

	public static void main(String[] args) {
     Scanner entrada=new Scanner(System.in);
		
		double [] x = new double[10];
		
		for(int n=0; n<x.length;n++)
		{
			x[n]=entrada.nextInt();
		}
		for(int i=0; i<x.length;i++) 
		{
			if(x[i]<10)
			{
				System.out.println("x["+i+"]= "+x[i]);
			}
		}


	}

}
