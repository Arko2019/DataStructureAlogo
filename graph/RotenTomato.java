package graph;

import java.util.LinkedList;
import java.util.Queue;



public class RotenTomato {
	
	static class Pair{
		int x;
		int y;
		Pair(int x,int y){
			this.x=x;
			this.y=y;
		}
	}
	
	int[][] adj={
			{2, 2, 2, 1},
            {1, 2, 1, 1}};
	public static void main(String[] args) {
		RotenTomato r=new RotenTomato();
	int time=	r.BFS();
		System.out.println(time);

	}
  int BFS() {
	  
	
	  
	  
	 int time=0;
	 Queue<Pair> queue=new LinkedList<>();
	 int roten=0;
	 int totalTomato=0;
	 for(int i=0;i<adj.length;i++) {
		 for(int j=0;j<adj[0].length;j++) {
			 if(adj[i][j]==1 || adj[i][j]==2) {
				++totalTomato;
			 }
			 if(adj[i][j]==2) {
				 queue.add(new Pair(i,j));
			 }
		 }
	 }
	
	 while(!queue.isEmpty()) {
		 int size=queue.size();
		  roten+=queue.size();
		 
		  if(roten==totalTomato)
			  return time;

		  time++;
		  for(int i=0;i<size;i++) {
			  Pair p=queue.poll();
			  
			  if(p.x+1<adj.length && adj[p.x+1][p.y]==1) {
				  adj[p.x+1][p.y]=2;
				  queue.add(new Pair(p.x+1,p.y));
			  }
			  if(p.x-1>=0 && adj[p.x-1][p.y]==1) {
				  adj[p.x-1][p.y]=2;
				  queue.add(new Pair(p.x-1,p.y));
			  }
			  if(p.y-1>=0 && adj[p.x][p.y-1]==1) {
				  adj[p.x][p.y-1]=2;
				  queue.add(new Pair(p.x,p.y-1));
			  }
			  if(p.y+1<adj[0].length && adj[p.x][p.y+1]==1) {
				  adj[p.x][p.y+1]=2;
				  queue.add(new Pair(p.x,p.y+1));
			  }
		  }
	 }
	 return -1;
 }
}
