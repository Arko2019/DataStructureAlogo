package recursion;

public class TaylorHonerSeries {

	public static void main(String[] args) {
		System.out.println(usingFor(2,10));
		System.out.println(usingRecursion(2,10));

	}

	/* 1+x/1+[1+x/2[1+x/3]] */
	/* 1+x+x^2/2!+x^3/3! */
	static double usingFor(int x,int n) {
		double s=1;
		for(;n>0;n--) {
			s=1+x*s/n;
		}
		return s;
	}
	static double s=1;
	static double usingRecursion(int x,int n) {
		
		if(n==0) {
			return s;
		}else {
			s=1+x*s/n;
			
		}
		return usingRecursion(x,n-1);
	}

}
