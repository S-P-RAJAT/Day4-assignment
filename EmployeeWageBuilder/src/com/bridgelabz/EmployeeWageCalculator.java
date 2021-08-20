package com.bridgelabz;

public class EmployeeWageCalculator {
	public static void main(String[] args) {
		int fullTime = 1;
		// Computation
		double empCheck = Math.floor(Math.random() * 10) % 2;
		if (empCheck == fullTime)
		System.out.println("Employee is Present");
		else
		System.out.println("Employee is Absent");
	}
}
