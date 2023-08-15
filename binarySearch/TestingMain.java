package binarySearch;

import java.util.function.Predicate;

public class TestingMain {
	int i=9;
	public static void main(String[] args) {
		/*
		 * Predicate<Integer> lesserthan = i -> (i < 18); // Calling Predicate method
		 * System.out.println(lesserthan.test(10)); B<Integer,Integer>test=(a,b)->a==b;
		 * System.out.println(test.test(1,2));
		 */
		A a=new A();
		a.setLesserthan(i -> (i < 18));
		System.out.println(a.getLesserthan().test(3));
	}

}

class A{
	Predicate<Integer> lesserthan;

	public Predicate<Integer> getLesserthan() {
		return lesserthan;
	}

	public void setLesserthan(Predicate<Integer> lesserthan) {
		this.lesserthan = lesserthan;
	}
	
	
}
