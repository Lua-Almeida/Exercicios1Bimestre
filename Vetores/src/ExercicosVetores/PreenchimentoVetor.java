package ExercicosVetores;

import java.util.Scanner;
public class PreenchimentoVetor {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int m=0;
		
		int []x = new int [10];
		
		x[0]= entrada.nextInt();
		System.out.println("n[0]=" +x[0]);
		
		for(int i=1; i<x.length;i++)
		{
			x[i]=(x[0]*2);
			x[0]=x[i];
		}
		
		for(int k=1; k<x.length;k++)
		{
			System.out.println("n["+k+"]=" +x[0]);
		}
	}

}
