package array;

import java.util.ArrayList;
import java.util.List;

public class MultipleDifference {

	public static void main(String[] args) {
		List<Integer>missing=new ArrayList<>();
		int a[]= {1,2,6,8,9};//0,1,2,3,4
		int diff=a[0]-0;
		for(int i=1;i<a.length;i++) {
			
			if(a[i]-i!=diff) {
				while(a[i]-i>diff) {
					missing.add(diff+i);
					diff++;
				}
				diff=a[i]-i;
			}
			
		}
System.out.println(missing);
	}

}
