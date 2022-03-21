/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Locale;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		char resp;
	    do {
    		System.out.print("Digite a temperatura em Celsius: ");
    		double C = sc.nextDouble();
    		double F = 9.0 * C / 5.0 + 32.0;
    		System.out.printf("Equivalente em Fahrenheint: %.1f%n", F);
    		System.out.print("Deseja repetir (s/n)? ");
    		 resp = sc.next().charAt(0);
    	} while (resp != 'n');
		
		sc.close();
		
	}
}
