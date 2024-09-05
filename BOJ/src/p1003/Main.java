package p1003;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int[]a=new int[41];
        int[]b=new int[41];
        String result;
        a[0]=b[1]=1;
        a[1]=b[0]=0;
        for(int i=2;i<41;i++){
            a[i]=b[i-1];
            b[i]=a[i-1]+b[i-1];
        }
        for(int i=0;i<n;i++){
            int num=Integer.parseInt(br.readLine());
            System.out.println(a[num]+" "+b[num]);
        }
    }
}
