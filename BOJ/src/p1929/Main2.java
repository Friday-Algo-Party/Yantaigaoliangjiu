package p1929;
// 에라토스테네스의 체 활용 코드
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2 {
    public static void main(String []args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int m=Integer.parseInt(st.nextToken());
        int n=Integer.parseInt(st.nextToken());

        boolean[] isPrime = new boolean[n+1];
        for(int i=2;i<=n;i++){
            isPrime[i]=true;
        }
        for(int i=2;i*i<=n;i++){
            if(isPrime[i]){
                for(int j=i*i;j<=n;j+=i){
                    isPrime[j]=false;
                }
            }
        }
        for(int i=Math.max(m,2);i<=n;i++){
            if(isPrime[i]){
                System.out.println(i);
            }
        }
    }
}
