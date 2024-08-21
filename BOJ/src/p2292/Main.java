package p2292;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[]args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int a=1;
        int cnt=0;
        for(int i=1;i<n+1;i++) {
            if (n == 1) {
                cnt = 1;
                break;
            } else if (a < n) {
                a = a + 6 * i;
                cnt++;
            } else {
                cnt++;
                break;
            }
        }
        System.out.println(cnt);
    }
}
