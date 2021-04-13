package ExercicosVetores;

import java.util.Scanner;
public class MenorPosicao {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n,a=0;
		
		n=entrada.nextInt();
		
		
		
		float [] x = new float[n];
		int posicao=0;
		float menor=0;
		
		for(int i=0; i<x.length;i++) 
		{
			x[i]=entrada.nextInt();
			menor = x[0];
			
			if(x[i]<menor)
			{
				menor=x[i];
				posicao=i;
				
			}
		}
		
		    
		    System.out.println("o menor valor é: "+ menor);
			System.out.println("a posição é: x["+ posicao+"]");
		
		}
		
		
	}


