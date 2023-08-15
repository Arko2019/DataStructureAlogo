package recursion;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
show(3);
	}

	public static void show(int n) {
		if(n>0) {
		
		show(n-1);
		System.out.println(n);
		}
	}
}
