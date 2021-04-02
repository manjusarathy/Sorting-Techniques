import java.io.*;
import java.util.Scanner;
public class Selectionsort
{
	public static void main(String args[])
	{
		int n,i,min_idx,j,temp;
		int a[] = new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n : ");
		n = sc.nextInt();
		for(i=0;i<n;i++)
		{
			System.out.print("Enter Element : ");
			a[i] = sc.nextInt();
		}
		for(i=0;i<n-1;i++)
		{
			min_idx=i;
			for(j=i+1;j<n;j++)
			{
				if(a[j]<a[min_idx])
					min_idx = j;
			}
			temp = a[min_idx];
			a[min_idx] = a[i];
			a[i] = temp;
		}
		for(i=0;i<n;i++)
			System.out.print(a[i]+" ");
		System.out.println();
	}
}