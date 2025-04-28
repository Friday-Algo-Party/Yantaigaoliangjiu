package p10026;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    static int n;
    static char[][]grid;
    static boolean[][] visited;
    static int[]dx={-1,1,0,0};
    static int[]dy={0,0,-1,1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n=Integer.parseInt(br.readLine());
        grid = new char[n][n];
        for(int i=0;i<n;i++){
            grid[i]=br.readLine().toCharArray();
        }

        visited=new boolean[n][n];
        int normalCount=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(!visited[i][j]){
                    bfs(i,j,grid[i][j]);
                    normalCount++;
                }
            }
        }

        visited=new boolean[n][n];
        int colorBlindCount=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='G') {
                    grid[i][j] = 'R';
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(!visited[i][j]){
                    bfs(i,j,grid[i][j]);
                    colorBlindCount++;
                }
            }
        }
        System.out.println(normalCount+" "+colorBlindCount);
    }
    static void bfs(int x,int y,char color){
        Queue<int[]>q=new LinkedList<>();
        q.add(new int[]{x,y});
        visited[x][y]=true;
        while(!q.isEmpty()){
            int[]current=q.poll();
            for(int i=0;i<4;i++){
                int nx=current[0]+dx[i];
                int ny=current[1]+dy[i];
                if(nx>=0&&ny>=0&&nx<n&&ny<n&&!visited[nx][ny]&&grid[nx][ny]==color){
                    visited[nx][ny]=true;
                    q.add(new int[]{nx,ny});
                }
            }
        }
    }
}
