package p1929;
//시간 초과 코드
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String [] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int m=Integer.parseInt(st.nextToken());
        int n=Integer.parseInt(st.nextToken());
        if(m==1||m==2){
            System.out.println("2");
            m=3;
        }
        if(m%2==0){
            m=m+1;
        }
        if(n%2==0){
            n=n-1;
        }
        for(int i=m;i<=n;i+=2){
            int cnt=0;
            for(int j=3;j<i;j+=2){
                if(i%j==0){
                    cnt++;
                }
            }
            if(cnt==0){
                System.out.println(i);
            }
        }
    }
}
