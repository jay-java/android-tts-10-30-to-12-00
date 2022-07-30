package basic;

import java.util.Scanner;

public class StringDemo {
	public static void main(String[] args) {
		String name="tops technologies";
		System.out.println(name);
		System.out.println("size of name : "+name.length());
		System.out.println(name.charAt(0));
		String name1 ="tops technologies";
		System.out.println(name.concat(name1));
		System.out.println(name);
		System.out.println(name.compareTo(name1));
		System.out.println(name.compareToIgnoreCase(name1));
		System.out.println(name.equals(name1));
		System.out.println(name.equalsIgnoreCase(name1));
		System.out.println(name.isEmpty());
		String name2 = "		tops tech 		";
		System.out.println(name2.trim());
		String s;
		System.out.println("enter s = ");
		Scanner sc = new Scanner(System.in);
		s = sc.next();
		System.out.println(s);
	}
}
