package recursion;

public class SumNaturalNo {

	public static void main(String[] args) {
		int sum=0;
	for(int i=1;i<=10;i++) {
		sum+=i;
	}
	System.out.println(sum
			);
System.out.println(sum(10));
	}
	static int sum(int n) {
		if(n>0) {
			return sum(n-1)+n;
		}
		return 0;
	}

}
