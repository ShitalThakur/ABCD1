package one;

import java.util.Arrays;

public class Program {
	public static void main(String [] args)
	{
	int a[] ={12 , 14, 15 ,88};
	int max = a[0];

	for (int i = 0 ; i<=a.length-1 ; i++)
	{
	while (max<a[i])
	{
	max = a[i];
	}
	}
	System.out.println(max);
	}
}
