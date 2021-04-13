package Exercicios;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Impar {

	public static void main(String[] args) {
      
		Scanner entrada= new Scanner(System.in);
	    	int x, y, soma=0;
	    	
	    	x=entrada.nextInt();
	    	y=entrada.nextInt();
	    	
	    	for(int i=x; i<y;i++)
	    	{
	    		if(i%2!=0)
	    		{
	    		soma+=i;
	    		}
	    	}
	    	
	    	System.out.println("a soma é: " + soma);
	}
}
