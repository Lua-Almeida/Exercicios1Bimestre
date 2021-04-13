package Exercicios;

import java.util.Scanner;
public class Quadrado_ao_cubo {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int x;
        
		System.out.println("escreva a quantidade de linhas a ser exibidas:");
		x=entrada.nextInt();
		
		for(int i=1; i<=x;i++)
		{
			System.out.print(i+ " ");
			System.out.print(i*i+" ");
			System.out.println(i*i*i);
		}

	}

}
