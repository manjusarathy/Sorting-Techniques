import java.io.*;
import java.util.*;
public class Bubblesort
{
	public static void main(String args[])
	{
		int n,i,j,temp;
		int a[] = new int[20];
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter N : ");
		n = sc.nextInt();
		for(i=0;i<n;i++)
		{
			System.out.print("Enter element : ");
			a[i] = sc.nextInt();
		}
		for(i=0;i<n-1;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for(i=0;i<n;i++)
		{
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
}