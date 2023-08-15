package recursion;

import java.util.ArrayList;

public class FibonaciSeries {
//0112358
//1234567
	static long memCache[];
	public static void main(String[] args) {
		/*
		 * for(int i=0;i<10;i++) { System.out.print(usingRecursion(i)+" "); }
		 */
		int n=50;
		memCache=new long[n+1];
		System.out.print(usingRecursion(n));
	}
	static long  usingRecursion(int n) {
		
		if(n<=1) {
			return n;
		}
		return usingRecursion(n-1)+usingRecursion(n-2);
		
	}
	//using memozation
static long  usingMemozation(int n) {
		
		if(n<=1) {
			return n;
		}
		if(memCache[n]!=0) {
			return memCache[n];
		}
			long nthCache=usingRecursion(n-1)+usingRecursion(n-2);
			memCache[n]=nthCache;
		return nthCache;
		
	}
	
}
