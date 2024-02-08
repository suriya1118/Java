package java_basics;

@FunctionalInterface
public interface InterfaceDemo {
	public abstract void test();
	// public abstract void test3();
	
	// Functional Interface should have only one Abstract method.
	
	default void test1(){
		System.out.println("This is default method");
	}
	
	static void test2(){
		System.out.println("This is static method");
	}
}
