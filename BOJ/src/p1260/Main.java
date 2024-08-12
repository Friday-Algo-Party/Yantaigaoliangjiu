package p1260;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static int[][] arr;
    static boolean[] visited;
    static int num,line,start;
    static Queue<Integer> q = new LinkedList<>();
    public static void main(String[] args) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in)); // 입력값 받기
        StringTokenizer st=new StringTokenizer(br.readLine()); // 한줄씩 받고 텍스트를 공백을 기준으로 분리
        num=Integer.parseInt(st.nextToken()); // 문자열을 int로 변환하여 저장
        line=Integer.parseInt(st.nextToken());
        start=Integer.parseInt(st.nextToken());

        arr=new int[num+1][num+1];
        visited=new boolean[num+1];
        for(int i=0;i<line;i++){
            StringTokenizer str=new StringTokenizer(br.readLine());
            int a=Integer.parseInt(str.nextToken());
            int b=Integer.parseInt(str.nextToken());
            arr[a][b]=arr[b][a]=1; // 간선을 1로 표시
        }

        dfs(start);
        sb.append("\n");
        visited = new boolean[num+1];
        bfs(start);
        System.out.println(sb);
    }
    public static void dfs(int start){

        visited[start]=true;
        sb.append(start+" ");

        for(int i=0;i<=num;i++){
            if(arr[start][i]==1 && !visited[i]){
                dfs(i);
            }
        }
    }
    public static void bfs(int start) {
        q.add(start);
        visited[start] = true;

        while(!q.isEmpty()) {

            start = q.poll();
            sb.append(start + " ");

            for(int i = 1 ; i <= num ; i++) {
                if(arr[start][i] == 1 && !visited[i]) {
                    q.add(i);
                    visited[i] = true;
                }
            }
        }
    }
}
