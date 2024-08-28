package p2798;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String [] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken()); // 첫줄 입력을 받음
        Integer[] input=new Integer[n];
        st=new StringTokenizer(br.readLine()); // 토큰 초기화
        for(int i=0;i<n;i++){
            input[i]=Integer.parseInt(st.nextToken()); //두번째줄 입력을 받음
        }
        Arrays.sort(input, Collections.reverseOrder()); //입력값 내림차순 정렬
        int result=0;
        int sum=0;
        for(int i=0;i<n-2;i++){
           for(int j=i+1;j<n-1;j++){
               for(int k=j+1;k<n;k++){
                    sum=input[i]+input[j]+input[k];
                    if(sum<=m&&result<sum){
                        result=sum;                     // 세 수의 합이 m보다 크면 pass, 작거나 같으면 result와 sum을 비교
                    }                                   // result가 sum보다 크면 그대로, 작으면 sum이 result가 됨
                    sum=0;                              // ex. 1,3,6번째 원소의 합보다 1,4,5번의 합이 클 경우가 있기 때문
               }                                        // sum 값은 한 경우의 수마다 초기화해줘야함
           }
        }
        System.out.println(result);
    }
}
