/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner; 
public class Main
{
	public static void main(String[] args) {
	    
	   int numA ; int numB;
	   Scanner leer = new Scanner(System.in);
	   
	   System.out.println ("ingrese los numeros:");
	   numA = leer .nextInt();
	   numB = leer .nextInt();
	   
	   
	   if ((numA >= 0 && numB >= 0) || (numA < 0 && numB < 0)) 
            System.out.println("true");
	   
	   
	}
}
