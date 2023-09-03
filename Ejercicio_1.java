/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	    
		//Ejercicio 1.1 
		
		if (6<6*5)
		System.out.println("Hello");
		System.out.println(" There");
		// resultado: Hello 
		//             There 
		
		//Ejercicio 1.2
		
		int x=1, y=2, z=3;
		if(x>y)
		if(x>z)
		    System.out.println("1111");
		else
		    System.out.println("2222");
		// No genera respuesta
		
		//Ejercicio 1.3
	
		if (x<z)
		    System.out.println("*");
		else if (x==z)
		    System.out.println("&");
        else 
            System.out.println("$");
		//resultado: *
		
		//Ejercicio 1.4
		if (x<y)
		    System.out.println("####");
        else 
            System.out.println("&&&&");
            System.out.println("****");
        // resultado: ####
        //            ****
        
        //Ejercicio 1.5
        
        	if (x>y)
		    System.out.println("####");
        else 
            System.out.println("&&&&");
            System.out.println("****");
        // resultado: ####
        //            ****
        
        //Ejercicio 1.6
        
        int a1=100 ; int a2=200;
        if (a1>100 && a2<=200)
            System.out.println(a1+" "+a2+" "+(a1+a2));
        else
            System.out.println(a1+" "+a2+" "+(2*a1-a2));
        
		// resultado: 100 200 0 (else)
		
		//Ejercicio 1.7
		if (++x > y++ || x-- > 0)
		    z++;
		else 
		    z--;
		System.out.println(x+" "+y+" "+z);
		
		//resultado: 1 3 4
		
		//Ejercicio 1.8
		
		if (x<y){
		    System.out.println("####");
            System.out.println("****");
		}
		else 
		    System.out.println("&&&&");
		//resultado: ####
		//           ****
		
		//Ejercicio 1.9
		
		if ('x'>'y' || 66> (int)('A'))
		    System.out.println("#*#");
		//resultado: #*#
		
		//Ejercicio 1.10
		
		if (x<z)
		    System.out.println("*");
		else if (x==z)
		    System.out.println("&");
        else 
            System.out.println("$");
            
        //resultado: *
		
		
	}
}
