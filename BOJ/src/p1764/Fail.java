package p1764;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Fail {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb=new StringBuilder();
        int n= Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        String []listen=new String[n];
        String []see=new String[m];
        int cnt=0;
        String[]res=new String[n];
        for(int i=0;i<n;i++){
            listen[i]=br.readLine();
        }
        for(int i=0;i<m;i++){
            see[i]=br.readLine();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(listen[i].equals(see[j])){
                    cnt++;
                    res[i]=listen[i];
                }
            }
        }
        Arrays.sort(res);
        for(int i=0;i<n;i++){
            if(res[i]!=null){
                sb.append(res[i]).append("\n");
            }
        }
        System.out.println(cnt);
        System.out.println(sb);
    }
}
