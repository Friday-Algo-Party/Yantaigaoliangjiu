package p9461;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fail {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int[]set=new int[101];
        set[1]=1;
        set[2]=1;
        set[3]=1;
        set[4]=2;
        set[5]=2;
        for(int i=6;i<=100;i++){
            set[i]=set[i-1]+set[i-5];
        }
        for(int j=0;j<n;j++){
            int a= Integer.parseInt(br.readLine());
            System.out.println(set[a]);
        }
    }
}
