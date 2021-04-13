package Exercicios;

import java.util.Scanner;
public class Gasolina {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int a=0,g=0,d=0,n=0;
		
		
		while(n != 4)
		{
			System.out.println("digite seu combustivel: ");
			n=entrada.nextInt();
			
			
			if(n==1)
			{
				a++;
			}
			
			if(n==2)
			{
				g++;
			}
			
			if(n==3)
			{
				d++;
			}
			
			
		}
		System.out.println("muito obrigado" );
		System.out.println("alcool =" + a); 
		System.out.println("gasolina =" + g);
		System.out.println("diesel =" +d );

	}

}
