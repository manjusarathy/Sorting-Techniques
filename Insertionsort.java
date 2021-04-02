import java.io.*;
import java.util.*;
public class Insertionsort 
{ 
	void sort(int arr[]) 
	{ 
		int n = arr.length; 
		for (int i = 1; i < n; ++i) 
		{ 
			int key = arr[i]; 
			int j = i - 1; 
			while (j >= 0 && arr[j] > key) 
			{ 
				arr[j + 1] = arr[j]; 
				j = j - 1; 
			} 
			arr[j + 1] = key; 
		} 
	} 
	static void printArray(int arr[]) 
	{ 
		int n = arr.length; 
		for (int i = 0; i < n; ++i) 
			System.out.print(arr[i] + " "); 

		System.out.println(); 
	} 
	public static void main(String args[]) 
	{ 
		int arr[] = new int[10];
		Scanner sc = new Scanner(System.in);
		int n,i;
		System.out.print("Enter n : ");
		n = sc.nextInt();
		for(i=0;i<n;i++)
		{
			System.out.print("Enter Element : ");
			arr[i] = sc.nextInt();
		}
		Insertionsort ob = new Insertionsort(); 
		ob.sort(arr); 

		printArray(arr); 
	} 
}