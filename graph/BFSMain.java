package graph;

import java.util.LinkedList;
import java.util.Queue;

public class BFSMain {
	int[][] adj={
            { 0, 1, 1, 1, 0, 0, 0},
            { 0, 0, 1, 0, 0, 0, 0},
            { 1, 1, 0, 1, 1, 0, 0},
            { 1, 0, 1, 0, 1, 0, 0},
            { 0, 0, 1, 1, 0, 1, 1},
            { 0, 0, 0, 0, 1, 0, 0},
            { 0, 0, 0, 0, 1, 0, 0}};
	int vertex=7;
	int eadge=7;
	public static void main(String[] args) {
		BFSMain main=new BFSMain();
		main.bfs(0);

	}
	void bfs(int s) {
		boolean v[]=new boolean[8];
		Queue<Integer>queue=new LinkedList<Integer>();
		queue.add(s);
		v[s]=true;
		int qV;
		while(!queue.isEmpty()) {
			qV=queue.poll();
			System.out.print(qV+" ");
			for(int i=0;i<7;i++) {
				if(adj[qV][i]!=0 && !v[i]) {
					queue.add(i);
					v[i]=true;
					
				}
			}
		}
	}

}
