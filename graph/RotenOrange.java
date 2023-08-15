package graph;

import java.util.LinkedList;
import java.util.Queue;

public class RotenOrange {

	public static void main(String[] args) {
				
		int a[][] = {
                {0,2}};
		Solution s=new Solution();
	int time=	s.orangesRotting(a);
	System.out.println(time);

	}

}
class Solution {
    static class Pair {
        int x;
        int y;
        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
	
    public int orangesRotting(int[][] grid) {
        Queue<Pair> q = new LinkedList<>();
        int total = 0, rotten = 0, time = 0;
		
       for (int x = 0; x < grid.length; x++) {
            for (int y = 0; y < grid[0].length; y++) {
                if (grid[x][y] == 1 || grid[x][y] == 2) total++;
                if (grid[x][y] == 2) q.add(new Pair(x, y));
            }
        }
		
        if (total == 0) return 0;		
        while (! q.isEmpty()) {
            int size = q.size();
            rotten += size;
            if (rotten == total) return time;
            
            time++;
			
            for (int i = 0; i < size; i++) {
                Pair p = q.poll();
				
                if (p.x + 1 < grid.length && grid[p.x + 1][p.y] == 1) {
                    grid[p.x + 1][p.y] = 2;
                    q.add(new Pair(p.x + 1, p.y));
                }
                if (p.x - 1 >= 0 && grid[p.x - 1][p.y] == 1) {
                    grid[p.x - 1][p.y] = 2;
                    q.add(new Pair(p.x - 1, p.y));
                }
                if (p.y + 1 < grid[0].length && grid[p.x][p.y + 1] == 1) {
                    grid[p.x][p.y + 1] = 2;
                    q.add(new Pair(p.x, p.y + 1));
                }
                if (p.y - 1 >= 0 && grid[p.x][p.y - 1] == 1) {
                    grid[p.x][p.y - 1] = 2;
                    q.add(new Pair(p.x, p.y - 1));
                }
            }
        }
        return -1;
    }
}