package recursion;

public class BinarySearch {

	public static void main(String[] args) {
		int n[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println(isPresentUsingLoop(n, 4));
		System.out.println(isPresentUsingRec(n, 4, 0, n.length-1));

	}

	static boolean isPresentUsingLoop(int n[], int c) {
		int l = 0;
		int h = n.length - 1;
		int mid = 0;
		while (h>=l) {
			mid = (l + h) / 2;
			if (c == n[mid] ) {
				return true;
			} else if (c < n[mid]) {
				h = mid - 1;

			} else {
				l = mid + 1;
			}

		}
		return false;
	}
	static boolean isPresentUsingRec(int n[], int c,int l,int h) {
		
		int mid = (l + h) / 2;
		if(l<=h) {	if (c == n[mid]) {
			return true;
		} else if (c < n[mid]) {
			h = mid - 1;
			return isPresentUsingRec(n,c,l,h);

		} else {
			l = mid + 1;
			return isPresentUsingRec(n,c,l,h);
		}
}
		
		return false;
	}

}
