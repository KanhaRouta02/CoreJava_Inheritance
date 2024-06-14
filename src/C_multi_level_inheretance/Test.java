package C_multi_level_inheretance;

// Multi level inheritance
// --------------------------
// -> A class acting as a sub class and super class at different level is called as
//    Multi level inheritance.
// -> It is recommended to create the object of grant child class

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

class GrandChild extends Child {
	void gcMethod() {
		System.out.println("Grand Child");
	}
}

public class Test {

	public static void main(String[] args) {

		GrandChild gc = new GrandChild();
		gc.pMethod();
		gc.cMethod();
		gc.gcMethod();
	}
}
