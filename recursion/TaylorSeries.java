package recursion;

public class TaylorSeries {
	static double p = 1, f = 1;

	public static void main(String[] args) {
		System.out.println( e(1,2));

	}

	static double e(int x ,int n) {
		 double r;

		 if(n==0)
		 return 1;
		 r=e(x,n-1);
		 p=p*x;
		 f=f*n;
		 return r+p/f;
	}

}
