package p2869;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FirstAns {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int h = 0;
        int d = 0;
        while (h <= c) {
            h += a;
            d++;
            if (h >= c) {
                break;
            } else {
                h -= b;
            }
        }
        System.out.println(d);
    }
}
//시간초과
