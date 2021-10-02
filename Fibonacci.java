package fibSeries;

import java.util.*;
public class Fibonacci {
	//find fibonacci series with recursion method

	public static void main(String[] args) {
		
         Scanner in = new Scanner(System.in);
         System.out.println("Enter the number :");
         int N =in.nextInt();
         
         System.out.print("Fibonacci series of "+N +" is : "+n1 +" "+n2);
         fibonacciSeries(N-2);
         
         
	}
	static int n1=0,n2=1,n3=0;
	public static void fibonacciSeries(int N) {
		
		if(N>0) {
			n3 = n1+n2;
			System.out.print(" "+n3);
			n1 = n2;
			n2 = n3;
			fibonacciSeries(N-1);
		}
		
		
		
		
		
	}

}
