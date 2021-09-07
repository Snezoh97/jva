/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CrazY MediA FilM
 */
import java.util.*;
public class NewMain {
    
    static int factorial(int n){    
		if (n == 0)    
		    return 1;    
		else    
		    return(n * factorial(n-1));    
		}   
	
            int factorial1(int n1)
            {
                return (n1 == 1 || n1 == 0) ? 1 : n1 * factorial(n1 - 1);
            }
    public static void main(String[] args) {
        
        int i,fact=1;  
        int number=5; //It is the number to calculate factorial    
            for(i=1;i<=number;i++){    
		fact=fact*i;    
            }    
		System.out.println("Factorial of "+number+" is: "+fact + "\n");		  
		int i1,fact1=1;  
		int number1=4;   
		fact = factorial(number1);   
		System.out.println("Factorial of "+number1+" is: "+fact1);    
		   

    NewMain obj = new NewMain();
	int num = 5;
	System.out.println("Ternary Ooperator Factorial of " + num + " is " + obj.factorial(num));
            int number2;
	    System.out.println("Enter the number: ");
	    Scanner scanner = new Scanner(System.in);
	    number = scanner.nextInt();
	    scanner.close();
	    long fact2 = 1;
	    int i2 = 1;
	        
            while(i<=number)
	        {
	            fact = fact * i;
	            i++;
	        }
	        System.out.println("Factorial of "+number+" is: "+fact);
	}
}
