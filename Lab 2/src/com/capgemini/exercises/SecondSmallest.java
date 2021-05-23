/* Create a method which accepts an array of integer elements and return the second smallest element in the array

Method Name:-  getSecondSmallest 
Method Description:- Get the second smallest element in the array 
Argument:-  int[] 
Return Type:- int 
Logic:- 	Sort the array and return the second smallest element in the array   */

package com.capgemini.exercises;

import java.util.Scanner;

public class SecondSmallest {
	 public static int  getSecondSmallest (int Arr[])
	 {
		 int i,j,temp;
		 for (i=0;i<Arr.length;i++)
		 {
			 for(j=1;j<Arr.length-i;j++)
			 {
				 if (Arr[j-1]>Arr[j])
				 {
					 temp = Arr[j-1];
					 Arr[j-1] = Arr[j];
					 Arr[j] = temp;
				 }
			 }
		 }
		 return (Arr[1]);
	 }
      public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int i,n,B;
        System.out.println("Enter the number of elements in the array: ");
		n = sc.nextInt();
		int[] A = new int[n];
		System.out.println("Enter the array elements: ");
		for(i=0;i<n;i++)
		{
			A[i] = sc.nextInt();
		}
		B =  getSecondSmallest(A);
		System.out.println("Second smallest element: " + B);
		sc.close();
     }
}
