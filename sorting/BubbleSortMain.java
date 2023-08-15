package sorting;

public class BubbleSortMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BubbleSort bs=new BubbleSort();
		int []a= {9,2,8,4,5,6,7};
		bs.sort(a);
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}

}

class BubbleSort{
	
	void sort(int [] a) {
		
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-1-i;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
				System.out.println(a[j]);
			}
		}
		
		return ;
		
	}
	
	
}