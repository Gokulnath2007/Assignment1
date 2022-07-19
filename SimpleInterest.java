package com.prodapt.basics;

public class SimpleInterest {
static float p;
static int r;
static int t;
static float amount;
static float si;

static void SI() {
	si = (p*r*t)/100;
	System.out.println("Simple Interest = "+si);
	amount = si + p;
	System.out.println("Total Amount= "+amount);
}
}
