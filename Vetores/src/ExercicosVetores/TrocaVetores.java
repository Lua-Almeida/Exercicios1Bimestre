package ExercicosVetores;

import java.util.Scanner;
public class TrocaVetores {

	public static void main(String[] args) {
      Scanner entrada=new Scanner(System.in);
		
		int [] x = new int[5];
		int a=0;
		int p=1;
		for(int n=0; n<x.length;n++)
		{
			x[n]=entrada.nextInt();
		}
		for(int i=0; i<x.length/2;i++) 
		{
				
					a=x[i];
					x[i]=x[x.length-p];
					x[x.length-p]=a;
					p++;
				
		}
		
		for(int j=0; j<x.length;j++) 
		{
			System.out.println("x["+j+"]= "+x[j]);
		}

	}

}
