package p10989;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Fail {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int[]num=new int[n];
        for (int i = 0; i<n;i++){
            int m=Integer.parseInt(br.readLine());
            num[i]=m;
        }
        Arrays.sort(num);
        for(int i =0; i<n; i++) {
            System.out.println(num[i]);
        }
    }
}
