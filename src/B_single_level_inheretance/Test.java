package B_single_level_inheretance;

//  1. Single level inheritance
//  ---------------------------
//  -> A sub class having one super class or vice-versa is called Single level inheritance.
//  -> It is recommended to create the object of child class.

class Parent {
	void pMethod() {
		System.out.println("Parent");
	}
}

class Child extends Parent {
	void cMethod() {
		System.out.println("Child");
	}
}

public class Test {

	public static void main(String[] args) {
		Child c = new Child();
		c.pMethod();
		c.cMethod();
	}
}
