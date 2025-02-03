package p11650;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 케이스 수 입력
        int [][] arr = new int[n][2]; // 2차원 배열 생성
        for (int i = 0; i < n; i++) {
            String[] str = br.readLine().split(" ");
            arr[i][0] = Integer.parseInt(str[0]);
            arr[i][1] = Integer.parseInt(str[1]); // 좌표값 반복 입력
        }
        Arrays.sort(arr,(a,b)->{
            if(a[0] == b[0]){
                return a[1]-b[1];
            }else{
                return a[0]-b[0]; // 2차원 배열 정렬
            }
        });
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i][0]+" "+arr[i][1]);
        }


    }
}
