package p11726;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int m=Integer.parseInt(br.readLine());
        Long []num=new Long[m];
        if(m==1){
            System.out.println("1");
            return;
        }else if(m==2){
            System.out.println("2");
            return;
        }
        num[0]=1L;
        num[1]=2L;
        for(int i=2;i<m;i++){
            num[i]=(num[i-2]+num[i-1])%10007;

        }

        System.out.println(num[m-1]);

    }
}
