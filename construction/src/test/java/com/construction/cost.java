package com.construction;

import java.util.Scanner;

import org.junit.Test;

public class cost {
	@Test
	public void findCost() {
		Scanner s=new Scanner(System.in);
		System.out.format("%s","Menu");
		System.out.format("%s","\n1.Standard Materials");
		System.out.format("%s","\n2.Above Standard Materials");
		System.out.format("%s","\n3.High Standard Material");
		System.out.format("%s","\n4.High Standard Material and Fully Automated Home");
		int[] mc= {1200,1500,1800,2500};
		int c;
		double a,p;
		System.out.format("%s", "\nEnter your choice regarding the material of your house");
		c=s.nextInt();
		System.out.format("%s", "Enter total area of the house in square feet");
        a=s.nextDouble();
        p=mc[c-1]*a;
        System.out.format("The cost of construction is %.2f",p);
		
		
	}

}
