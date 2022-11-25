package com.java.collections;

import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListFromUser {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> rollNo = new ArrayList<Integer>();
		System.out.println("Enter size of an array: ");
		int size = sc.nextInt();
		for(int i = 0; i< size; i++) {
			System.out.println("Enter "+ (i+1) +" value: ");
			int a= sc.nextInt();
			rollNo.add(a);
		}
		
		for (Integer number : rollNo) {
			System.out.println(number);
		}

	}

}
