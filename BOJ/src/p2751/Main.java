package p2751;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int []lineup=new int[n];
        for(int i=0;i<n;i++){
            lineup[i]=Integer.parseInt(br.readLine());
        }
        Arrays.sort(lineup);
        for(int i=0;i<n;i++){
                System.out.println(lineup[i]);
        }

    }
}
