package p2609;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());
        int min=0;
        int answer=0;
        if(n<m){
            for(int i=1; i<=n; i++){
                if(n%i==0&&m%i==0){
                    min=i;
                }
            }
        }else{
            for(int i=1;i<=m;i++){
                if(n%i==0&&m%i==0){
                    min=i;
                }
            }
        }
        answer=min*(n/min)*(m/min);
        System.out.println(min);
        System.out.println(answer);
    }
}
