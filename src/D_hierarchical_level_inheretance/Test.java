package D_hierarchical_level_inheretance;

// Hierarchical level inheritance
// ----------------------------------
//-> A super class having one or more than one sub class is called Hierarchical level inheritance.
//-> It recommended to create object of every child class.

class Parent {
	void pMethod() {
		System.out.println("Parent");
	}
}

class Child1 extends Parent {
	void c1Method() {
		System.out.println("Child 1");
	}
}

class Child2 extends Parent {
	void c2Method() {
		System.out.println("Child 2");
	}
}

class Child3 extends Parent {
	void c3Method() {
		System.out.println("Child 3");
	}
}

public class Test {
	public static void main(String[] args) {
		Child1 c1 = new Child1();
		c1.pMethod();
		c1.c1Method();

		Child2 c2 = new Child2();
		c2.pMethod();
		c2.c2Method();

		Child3 c3 = new Child3();
		c3.pMethod();
		c3.c3Method();
	}
}
