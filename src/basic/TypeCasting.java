package basic;

import java.util.Scanner;
//1.int->Integer 2.byte->Byte 3.short 4.long 5.float 6.double 7.char 8.boolean
public class TypeCasting {
	public static void main(String[] args) {
		float f = 12;
//		Integer i = new Integer(1);
//		System.out.println(i);
		System.out.println(f);
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a = ");
		int a = sc.nextInt();
		System.out.println("enter b = ");
		int b = sc.nextInt();
		float c = (float)a/(float)b;
		System.out.println(c);
		String j = "1";
		System.out.println(Integer.parseInt(j));
		String name= "jay";
		System.out.println(name);
		System.out.println("enter character : ");
		char s = sc.next().charAt(0);
		System.out.println(s);
	}
}
