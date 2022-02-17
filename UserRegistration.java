package com.bl.regx;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
	
	public static void main(String[] args) {
			firstName();
			lastName();
			email();
			mobileNumber();
		}
	
	public static void firstName() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first name: ");
		String firstName = sc.next();
		boolean isFirstName = Pattern.matches("[A-Z]+[a-z]{2,}", firstName);
		
		if(isFirstName) {
			System.out.println("Valid first name");
		}	
		else {
			System.out.println("Invalid first name");
		}
	}
	
	public static void lastName() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter last name: ");
		String lastName = sc.next();
		boolean isLastName = Pattern.matches("[A-Z]+[a-z]{2,}", lastName);
		
		if(isLastName) {
			System.out.println("Valid last name");
		}	
		else {
			System.out.println("Invalid last name");
		}
	}
	
	public static void email() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter email: ");
		String email = sc.next();
		boolean isEmail = Pattern.matches("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$", email);
		
		if(isEmail) {
			System.out.println("Valid email");
		}	
		else {
			System.out.println("Invalid email");
		}
	}
	
	public static void mobileNumber() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter mobile number: ");
		String number = sc.nextLine();
		boolean isNumber = Pattern.matches("^[0-9]{2}\s[0-9]{10}$", number);
		
		if(isNumber) {
			System.out.println("Valid mobile number");
		}	
		else {
			System.out.println("Invalid mobile number");
		}
	}
}
