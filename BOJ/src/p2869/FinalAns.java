package p2869;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FinalAns {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int a=Integer.parseInt(st.nextToken());
        int b=Integer.parseInt(st.nextToken());
        int c=Integer.parseInt(st.nextToken());
        int d=(c-b)/(a-b);
        if((c-b)%(a-b)==0){
            System.out.println(d);
        }else{
            System.out.println(d+1);
        }
    }
}
