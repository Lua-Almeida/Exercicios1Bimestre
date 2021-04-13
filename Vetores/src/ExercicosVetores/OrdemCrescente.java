package ExercicosVetores;

import java.util.Scanner;
public class OrdemCrescente {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		
		int [] x = new int[5];
		int a=0;
		for(int n=0; n<x.length;n++)
		{
			x[n]=entrada.nextInt();
		}
		for(int i=0; i<x.length;i++) 
		{
			for(int k=0; k<x.length;k++) 
			{
				if(x[i]<x[k])
				{
					a=x[i];
					x[i]=x[k];
					x[k]=a;
				}
			}
		}
		
		for(int j=0; j<x.length;j++) 
		{
			System.out.println("x["+j+"]= "+x[j]);
		}

	}

}
