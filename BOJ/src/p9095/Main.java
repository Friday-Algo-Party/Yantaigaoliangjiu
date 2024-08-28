package p9095;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[]args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int[] ex=new int[10];
        ex[0]=1;
        ex[1]=2;
        ex[2]=4;
        for(int i=3;i<10;i++){
            ex[i]=ex[i-3]+ex[i-2]+ex[i-1];
        }
        for(int i=0;i<n;i++){
            int input=Integer.parseInt(br.readLine());
            System.out.println(ex[input-1]);
        }
    }
}
