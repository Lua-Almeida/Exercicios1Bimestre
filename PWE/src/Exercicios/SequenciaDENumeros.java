package Exercicios;

import java.util.Scanner;
public class SequenciaDENumeros {

	public static void main(String[] args) {
	
		Scanner entrada=new Scanner(System.in);
		int x,y,a=0, soma=0;
		
		x=entrada.nextInt();
		y=entrada.nextInt();
		
		while(x>0 && y>0)
		{
		   if(x>y) 
		{
			a=x;
			x=y;
			y=a;
		}
		
		   for(int i=x; i<=y;i++)
		{
			soma+=i;
		System		
		.out.print(i+" ");
			
		}
		  System.out.println("sum= "+ soma);
		
		  x=entrada.nextInt();
		   y=entrada.nextInt();
		}
	}
	}



