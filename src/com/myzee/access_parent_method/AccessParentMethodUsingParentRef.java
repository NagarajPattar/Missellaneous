package com.myzee.access_parent_method;


/*
 * Variables access is always based on the reference.
 * Methods access is always based on the object created.
 * 
 * So in below case, b variable of child cannot be accessed using parent reference, throws exception.
 * 
 */
public class AccessParentMethodUsingParentRef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Using parent reference");
		Parent p = new Child();
//		System.out.println(p.b);	// child variables cannot be accessed using parent reference
		p.m1();
		
		System.out.println("\nUsing child reference");
		Child c = new Child();
		System.out.println(c.a);
		System.out.println(c.b);
		c.m1();
			
	}
}

class Parent {
	int a = 10;
	public void m1() {
		System.out.println("parent method m1");
	}
}

class Child extends Parent {
	int b = 20;
	public void m2() {
		System.out.println("child method m2" + a);
	}
}
