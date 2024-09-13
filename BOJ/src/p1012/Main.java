package p1012;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int n,m;
    static int[][]field;
    static boolean[][] visited;
    static final int[]dx={-1,1,0,0};
    static final int[]dy={0,0,-1,1};

    static int bug(int x,int y){
        Queue<int[]> q=new LinkedList<>();
        q.offer(new int[]{x,y});
        visited[x][y]=true;
        int cnt=1;

        while(!q.isEmpty()){
            int[] cur=q.poll();
            for(int i=0;i<4;i++){
                int nx=cur[0]+dx[i];
                int ny=cur[1]+dy[i];

                if(0<=nx && nx<n && 0<=ny && ny<m && !visited[nx][ny] && field[nx][ny]==1){
                    q.offer(new int[]{nx,ny});
                    visited[nx][ny]=true;
                    cnt++;
                }
            }
        }
        return cnt;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            n=Integer.parseInt(st.nextToken());
            m=Integer.parseInt(st.nextToken());
            int k=Integer.parseInt(st.nextToken());
            field=new int[n][m];
            visited=new boolean[n][m];
            for(int j=0;j<k;j++){
                StringTokenizer st2=new StringTokenizer(br.readLine());
                int x=Integer.parseInt(st2.nextToken());
                int y=Integer.parseInt(st2.nextToken());
                field[x][y]=1;
            }
            List<Integer>bugs=new ArrayList<>();
            for(int a=0;a<n;a++){
                for(int b=0;b<m;b++){
                    if(field[a][b]==1 && !visited[a][b]){
                        bugs.add(bug(a,b));
                    }
                }
            }
            System.out.println(bugs.size());
        }
    }
}
