package p11659;

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
        int[]num=new int[n];
        int[]preSum=new int[n+1];
        st=new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            num[i]=Integer.parseInt(st.nextToken());
            preSum[i+1]=preSum[i]+num[i];
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<m;i++){
            st=new StringTokenizer(br.readLine());
            int first = Integer.parseInt(st.nextToken());
            int second = Integer.parseInt(st.nextToken());
            int result=preSum[second]-preSum[first-1];
//            for(int j=first-1;j<second;j++){
//                result+=num[j];
//            }
            sb.append(result).append("\n");
        }
        System.out.println(sb);
    }
}
