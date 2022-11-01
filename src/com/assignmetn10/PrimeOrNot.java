package com.assignmetn10;

import java.util.Scanner;

public class PrimeOrNot {

	public int getPrimeNumber(int no) {

		if (no % 1 !=0) {

			System.out.println("This is  prime no");
		}

		else {
			System.out.println("This is not prime no ");
		}

		return no;
	}

	public static void main(String[] args) {

		System.out.println("Enter the number to check the number ");
		Scanner scanner = new Scanner(System.in);
		int i = scanner.nextInt();

		PrimeOrNot primeOrNot = new PrimeOrNot();

		primeOrNot.getPrimeNumber(i);

	}

}
