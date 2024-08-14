package p1978;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 입력 받기
        int n=Integer.parseInt(br.readLine()); // 첫줄 n으로 정수 받기
        StringTokenizer str = new StringTokenizer(br.readLine());
        int[] arr=new int[n];
        int[] count=new int[n];
        int result=0;
        for(int i=0;i<n;i++) {
            arr[i] = Integer.parseInt(str.nextToken()); // stringtokenizer와 parseint를 통해 공백으로 구분된 값을 정수 형태로
        }                                               // 배열에 받음
        for (int i=0;i<n;i++) {
            if (arr[i] == 1) {
                count[i] = 0;
            } else if (arr[i] == 2) {
                count[i]=0;
            } else {                                    //반복문을 통해 입력값을 2부터 (자기자신-1)까지의 수로 나눠서 나눠떨어지지
                for (int j = 2; j < arr[i]; j++) {      //않을 경우, count를 올림
                    if (arr[i] % j != 0) {
                        count[i]++;
                    }
                }
            }
        }
        for(int i=0;i<n;i++){                           // count연산이 끝나고 다시 한번 반복문을 통해 count값이 (입력값-2)인
            if(count[i]==arr[i]-2){                     //경우 result(소수의 개수)를 1 증가
                result++;
            }
        }
        System.out.println(result);                     //result(소수의 개수)를 출력
    }
}
