package p11399;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int con=0;                                                              //sum배열을 구하기 위한 중간 매개체 변수
        int result=0;                                                           //구해야하는 시간 최솟값
        StringTokenizer st=new StringTokenizer(br.readLine());
        int[]input=new int[n];                                                  //원소가 업무보는데 걸리는 시간 배열
        int[]sum=new int[n];                                                    //원소별로 걸린 총 소요 시간 배열
        for(int i=0;i<n;i++){
            input[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(input);                                     // 문제에서 필요한 시간의 합이 최소가 되게 하려면 가장 적게 걸
        for(int i=0;i<n;i++){                                   // 리는 원소가 앞으로 가야함 >> 오름차순 정렬
            sum[i]=con+input[i];                                // con이라는 중간 매개체를 설정해서 i-1번째 반복에서의 소요시간
            con=con+input[i];                                   // 을 con에 저장해서 i번째에서 이용, con+input[i]는 sum 배열
        }                                                       // 에 보관
        for(int i=0;i<n;i++){
            result+=sum[i];                                     // 문제에서 원하는 값을 sum배열에 보관해뒀으니 이제 그것을 가져
        }                                                       // 와서 합을 result에 보관함
        System.out.println(result);
    }
}
