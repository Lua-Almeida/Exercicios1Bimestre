package Exercicios;

import java.util.Scanner;
public class Primos {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		 int n,x,c=0;
		 
		 System.out.println("Digite a quantidade de numeros a ser digitada:");
		 n= ler.nextInt();
		 
		 for(int i=0; i<n;i++)
		 {
		 
		 System.out.println("Digite um numero:");
		 x= ler.nextInt();
		 
		     for(int k=1; k<=x; k++) 
			 {
				 if(x % k==0)
				 {
					 c++;
				 }
				 
			 }
		     
		     if (c == 2 || x==1 ) {System.out.println(x + " é primo" + "\n");}
	         else {System.out.println(x + " nao é primo"+"\n");} 
		 }
			
				 

	}

}
