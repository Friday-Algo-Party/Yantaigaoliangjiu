package p11047;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int money = Integer.parseInt(st.nextToken());
        int result=0;
        Integer[] coin=new Integer[n];
        for(int i=0;i<n;i++){
            coin[i]=Integer.parseInt(br.readLine());
        }
        Arrays.sort(coin,Collections.reverseOrder());
        for(int i:coin){
            if(i>money){
                continue;
            }else{
                result+=money/i;
                money=money%i;
            }
        }
        System.out.println(result);
    }
}
