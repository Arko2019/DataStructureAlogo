package recursion;

public class PowerRecursion {

	public static void main(String[] args) {
		
		System.out.println(power(4,2));

	}
 static int power(int c,int n) {
	
	 
	 if(c>0) {
		 return power(--c,n)*n;
	 }return 1;
 } 
}
