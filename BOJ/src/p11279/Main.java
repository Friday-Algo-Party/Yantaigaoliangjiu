package p11279;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int input=0;
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int i=0;i<n;i++){
            input=Integer.parseInt(br.readLine());
            if(input>0){
                pq.add(input);
            }else{
                if(!pq.isEmpty()){
                    System.out.println(pq.poll());
                }else{
                    System.out.println(0);
                }
            }
        }
    }
}
