package p1764;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());
        Set<String>listen=new HashSet<>();
        List<String>result=new ArrayList<>();
        for(int i=0;i<n;i++){
            listen.add(br.readLine());
        }
        for(int i=0;i<m;i++){
            String see=br.readLine();
            if(listen.contains(see)){
                result.add(see);
            }
        }
        Collections.sort(result);
        System.out.println(result.size());
        for(String see:result){
            System.out.println(see);
        }

    }
}
