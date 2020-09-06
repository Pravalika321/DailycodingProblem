/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.*;
public class Main 
{
	public static void main(String[] args) {
		int n,i,j,k;
		int p;
		int c=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter n");
		n=s.nextInt();
		System.out.println("Enter k");
		k=s.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter array values");
		for(i=0;i<n;i++)
		{
		    arr[i]=s.nextInt();
		}
	    for(i=0;i<n;i++)
	    {
	        for(j=i+1;j<n;j++)
	        {
	            if(arr[i]+arr[j]==k)
	            c=c+1;
	            
	        }
	   }
	    if(c>0)
		{
			System.out.println("True");
	   
	}
	else
	{
		System.out.println("False");
}
	}
}