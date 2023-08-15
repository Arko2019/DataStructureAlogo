package graph;

import java.util.LinkedList;
import java.util.Queue;

public class RotenOrannge2 {

	public static void main(String[] args) {
		int a[][] = 
		{{2,1,1},
		 {1,1,0},
		 {0,1,1}};
		
		Solution s=new Solution();
	int time=	s.orangesRotting(a);
	System.out.println(time);

	}
	 public int orangesRotting(int[][] grid) {
	        Queue<Pear> q=new LinkedList<>();
	         int time=0,rotenOrange=0, totalOrange=0;

	        for(int i=0;i<grid.length;i++){
	            for(int j=0;j<grid[0].length;j++){
	                if(grid[i][j]==1|| grid[i][j]==2 ){
	                    totalOrange++;
	                }
	                if(grid[i][j]==2 ){
	                    q.add(new Pear(i,j));
	                }
	            }
	        }
	        if(q.isEmpty()){
	            return 0;
	        }
	        while(!q.isEmpty()){
	            int size=q.size();
	            rotenOrange+=size;
	            Pear p=q.poll();
	            if(rotenOrange==totalOrange){
	                return time;
	            }
	            time++;
	            for(int i=0;i<size;i++){
	            	 if(p.x+1<grid.length && grid[p.x+1][p.y]==1){
		                    grid[p.x+1][p.y]=2;
		                    q.add(new Pear(p.x-1,p.y));
		                }
	            	 
	                if(p.x-1>=0 && grid[p.x-1][p.y]==1){
	                    grid[p.x-1][p.y]=2;
	                    q.add(new Pear(p.x-1,p.y));
	                }
	                
	                 if(p.y+ 1< grid[0].length && grid[p.x][p.y+1]==1){
	                    grid[p.x][p.y+1]=2;
	                    q.add(new Pear(p.x,p.y+1));
	                }
	                 if(p.y-1>=0 && grid[p.x][p.y-1]==1){
	                    grid[p.x][p.y-1]=2;
	                    q.add(new Pear(p.x,p.y-1));
	                }
	                 
	            }

	        }
	        return -1;

	    }

	class Pear{
	    int x;
	    int y;
	    Pear(int x,int y){
	this.x=x;
	this.y=y;
	    }
	}
}
