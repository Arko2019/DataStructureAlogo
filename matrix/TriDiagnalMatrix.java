package matrix;

public abstract class TriDiagnalMatrix {

	public static void main(String[] args) {
		int a[][]= new int[5][5];

		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(i==j || i-j==1 ||i-j==-1) {
					a[i][j]=1;
					//System.out.print("*");
				}else {
					//System.out.print("0");
				}
			}
			//System.out.println();
		}
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
	}

}
