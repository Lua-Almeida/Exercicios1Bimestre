package ExercicosVetores;

import java.util.Scanner;

public class PreenchimentoDeVetorIII {

	public static void main(String[] args) {
			Scanner entrada=new Scanner(System.in);
			String resultado="";
			
			float []x = new float[10];
			
			x[0]= entrada.nextInt();
			resultado=String.format("%.4f", x[0]);
			System.out.println("n[0]=" + resultado);
			
			for(int i=1; i<x.length;i++)
			{
				x[i]=(x[0]/2);
				x[0]=x[i];
			}
			
			for(int k=1; k<x.length;k++)
			{
				resultado=String.format("%.4f", x[k]);
				System.out.println("n["+k+"]=" + resultado);
			}

	}

}
