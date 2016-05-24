import java.util.Scanner;

public class problema3 {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int n = 0;
		int n2 = 0;
		int math = 0;

		
		System.out.print("How many mathematical problem would you like to solve?" );
		math = input.nextInt();
		
		for (int a = 1; a <= math; a++) {
			System.out.print("What kind of mathematical problem would you like to solve? (ei. +,-,*,/)" );
			String problem = input.next();
			
		
			int[][]a1 = new int [4][4];   //inputs numbers into array
				for (int r = 0; r < a1.length; r++)
				{
					for (int c = 0; c < a1[r].length; c++)
					{
						System.out.print("Enter the numbers on row " + r + " column " + c );
						n = input.nextInt();
								
					}//for c
					
				}//for r
				
			System.out.println("Enter second array" );
			int[][]a2 = new int [4][4];   //inputs numbers into array2
				for (int l = 0; l < a2.length; l++)
				{
					for (int m = 0; m < a2[l].length; m++)
					{
						System.out.print("Enter the numbers on row " + l + " column " + m);
						n2 = input.nextInt();
						
						
					}//for m
					
				}//for l
				
			
				
			if (problem.equals("+")) {
				System.out.println("Suma");
				for (int r = 0; r < a1.length; r++)
				{
					System.out.print(n + n2);
					
					for (int c = 0; c < a2.length; c++)
					{
						System.out.print(n + n2);
						
					}//for c
					
					System.out.println();
				}//for r

			
			}
			else if (problem.equals("-")) {
				System.out.println("Resta");
				for (int r = 0; r < a1.length; r++)
				{
					System.out.print(n - n2);
					
					for (int c = 0; c < a2.length; c++)
					{
						System.out.print(n - n2);
						
					}//for c
					
					System.out.println();
				}//for r
			}
			else if (problem.equals("*")) {
				System.out.println("Multiplicacion");
				for (int r = 0; r < a1.length; r++)
				{
					System.out.print(n * n2);
					
					for (int c = 0; c < a2.length; c++)
					{
						System.out.print(n * n2);
						
					}//for c
					
					System.out.println();
				}//for r
			}
			else if (problem.equals("/")) {
				System.out.println("Divide");
				for (int r = 0; r < a1.length; r++)
				{
					System.out.print(n / n2);
					
					for (int c = 0; c < a2.length; c++)
					{
						System.out.print(n / n2);
						
					}//for c
					
					System.out.println();
				}//for r
			}
			
			
			
		}
		
	}//main
}//class
