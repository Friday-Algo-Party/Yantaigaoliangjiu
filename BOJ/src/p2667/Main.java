package p2667;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static int[][]field;
    static boolean[][]visited;
    static int [] dx = {0,0,-1,1};
    static int [] dy = {-1,1,0,0};
    static int house=0,building=0;
    static int x,y=0;
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        List<Integer> list=new ArrayList<>();
        field=new int[n][n];
        visited=new boolean[n][n];
        for(int i=0;i<n;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            for(int j=0;j<n;j++){
                field[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(visited[i][j]==false && field[i][j]==1){
                    building++;
                    house=0;
                    DFS(i,j);
                    list.add(house);
                }
            }
        }
    }
    public static void DFS(int a,int b){
        visited[a][b]=true;
        field[a][b]=building;
        house++;
        for(int i=0;i<4;i++){
            x=a+dx[i];
            y=b+dy[i];

        }
    }
}
