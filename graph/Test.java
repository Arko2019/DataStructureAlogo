package graph;

public class Test {
	int grid=6;
	public static void main(String[] args) {
		Test test=new Test();
	test.dfs(0,0);
	}

	void dfs(int i,int j) {
		 if(i<0 || j<0 || i>3 || j>grid)return;
		 System.out.println("0st i"+i+"j:"+j);
		 dfs(i+1,j);
		 System.out.println("1st i"+i+"j:"+j);
	        dfs(i-1,j);
	        System.out.println("2st i"+i+"j:"+j);
	        dfs(i,j-1);
	        System.out.println("3st i"+i+"j:"+j);
	        dfs(i,j+1);
	        System.out.println("4st i"+i+"j:"+j);
		
	}
	
}
