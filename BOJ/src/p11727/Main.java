package p11727;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int[]num=new int[n];
        if(n==1){
            System.out.println("1");
            return;
        }
        num[0]=1;
        for(int i=1;i<n;i++){
            if(i%2==1){
                num[i]=(num[i-1]*2+1)%10007;
            }else{
                num[i]=(num[i-1]*2-1)%10007;
            }
        }
        System.out.println(num[n-1]);
    }
}
