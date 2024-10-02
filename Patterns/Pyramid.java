package com.pyramid;
import java.util.Scanner;

public class Pyramid
{
	public static void main(String[] args)
	{
		        int i,j,k;
		        
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter a no:");
				int n=sc.nextInt();
				for(i=0;i<=n;i++)
				{
					for(k=0;k<n-i;k++) 
					{
						System.out.print(" ");
					}
					for(j=0;j<=i;j++)
					{
						System.out.print(i+1+" ");
				    }
					System.out.println();
				}
	}
			

}
