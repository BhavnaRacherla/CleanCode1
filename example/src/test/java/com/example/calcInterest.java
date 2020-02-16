package com.example;

import java.util.Scanner;

import org.junit.Test;

public class calcInterest {
	@Test
	public void calInterest() {
		int p,t,n;
		double r;
		double si=0;
		Scanner s=new Scanner(System.in);
		System.out.format("%s","Enter principal amount:");
		p=s.nextInt();
		System.out.format("%s","Enter time");
		t=s.nextInt();
		System.out.format("%s","Enter rate of interest");
		r=s.nextDouble();
		si=(p*t*r)/100;
		System.out.format("The simple interest is %.2f",si);
		System.out.format("%s", "\nEnter n(number of times that interest is compounded per unit t):");
		n=s.nextInt();
		double amount = p * Math.pow(1 + (r / n), n * t);
        double cinterest = amount - p;
        System.out.format("The compound interest is %.2f", cinterest);
		
	}
}
