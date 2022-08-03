package basic;

import java.util.Scanner;

class A {
	public void show() {
		System.out.println("this is show method inside A class");
	}
}

public class Basic {
	public static void main(String[] args) {
//		System.out.print("hello java");
//		System.out.println("hello java again");
//		int i = 1, j = 3;
//		System.out.println(i);
//		int k = +j;
//		System.out.println("addition of i and j = " + k);
//		int a, b, c;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter a = ");
//		a = sc.nextInt();
//		System.out.println("enter b = ");
//		b = sc.nextInt();
//		c = a / b;
//		System.out.println(c);
//		A obj = new A();
//		obj.show();
//		c = a+b;
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[2];
		for (int index = 0; index <= 5; index++) {
			System.out.println("enter element at arr[" + index + "]" + " :");
			arr[index] = sc.nextInt();
		}
	}

}
