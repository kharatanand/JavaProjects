package practice_work;

import java.util.Scanner;

public class Even_odd 
{
	public static void main(String[] args) 
	{
		Scanner a = new Scanner( System.in);
		System.out.println("Put the number");
		int i= a.nextInt();
		
		
			if ( i%2==0)
			{
				System.out.println(i + " is even number");
			}
			else
			{
				System.out.println(i + " is odd number");
			}
		
		
	}

}
