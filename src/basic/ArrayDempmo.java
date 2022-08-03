package basic;

import java.util.Scanner;

public class ArrayDempmo {
	public static void main(String[] args) {
		int a[] = {1,2,3,4,5};
		for(int index=0;index<=4;index++) {
			System.out.println("value at a["+index+"] is : "+a[index]);
		}
		Scanner sc = new Scanner(System.in);
		System.out.print("enter size of array : ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		for(int i=0;i<arr.length;i++) {
			System.out.print("enter value at arr["+i+"] : ");
			arr[i] =  sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum = sum+arr[i];
			System.out.println(sum);
		}
		System.out.println("addition of elements in array : "+sum);
	}
}
