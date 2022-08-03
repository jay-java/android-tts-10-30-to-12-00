package basic;

import java.util.Scanner;

//1.if
//2.if else
//3.nested if
//4.else if ladder
//5.switch case
public class conditionalStatement {
	public static void main(String[] args) {
		int i = 0;
		// 1.if
		if (i > 0) {
			System.out.println("yes");
		}

		// 2.if else
		if (i > 0) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}

		// 3.nested if
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter age : ");
		age = sc.nextInt();
		if (age > 18) {
			if (age < 60) {
				System.out.println("eligible for donate blood");
			} else {
				System.out.println("age is greater than 18 but not less than 60");
			}
		} else {
			System.out.println("age is less than 18");
		}

		// 4.else if ladder
		int marks;
		System.out.println("enter marks : ");
		marks = sc.nextInt();
		if (marks < 35) {
			System.out.println("fail");
		} else if (marks >= 35 && marks <= 50) {
			System.out.println("pass class");
		} else if (marks >= 51 && marks <= 70) {
			System.out.println("C grade");
		} else if (marks >= 71 && marks <= 80) {
			System.out.println("B grade");
		} else if (marks >= 81 && marks <= 90) {
			System.out.println("A grade");
		} else if (marks >= 91 && marks <= 100) {
			System.out.println("A+ grade");
		} else {
			System.out.println("invalid input");
		}

		// 5.switch
		System.out
				.println("enter your choice : press 1 for english\n" + "press 2 for hindi\n" + "press 3 for gujarati");
		int lang = sc.nextInt();
		switch (lang) {
		case 1:
			System.out.println("You selected English");
			break;
		case 2:
			System.out.println("You selected Hindi");
			break;
		case 3:
			System.out.println("You selected Gujarati");
			break;
		default:
			System.out.println("invalid input");
		}
	}
}
