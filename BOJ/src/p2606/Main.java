package p2606;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;//import java.io.BufferedReader;
import java.util.StringTokenizer;


public class Main {
    static int line, node;
    static int cnt=0;
    static int[][]arr;
    static boolean [] check;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        node = Integer.parseInt(br.readLine());                         //첫줄의 컴퓨터 수 입력받기
        line = Integer.parseInt(br.readLine());                         //이을 간선의 수 입력받기
        arr=new int[node+1][node+1];
        check=new boolean[node+1];

        for(int i=0;i< line; i++){
            StringTokenizer st=new StringTokenizer(br.readLine());      //연결되는 선의 번호 입력받기
            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());
            arr[a][b]=arr[b][a]=1;                                      //(1,2)와 (2,1)의 구분이 없으므로 한 번에 인정
        }
        dfs(1);                                                     //문제에서 1번에 바이러스를 뿌렸을 경우로 한정했으므로
        System.out.println(cnt-1);                                      //시작이 1일 때의 케이스만 보기
    }
    public static void dfs(int init){
        check[init]=true;
        cnt++;
        for(int i=0;i<=node;i++){
            if(arr[init][i]==1 && !check[i]){
                dfs(i);
            }
        }
    }
}
