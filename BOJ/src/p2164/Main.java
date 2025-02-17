package p2164;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        Queue q=new LinkedList();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i=1;i<n+1;i++){
            q.offer(i);
        }
        while(q.size()>1){
            q.poll();
            q.offer(q.poll());
        }
        System.out.println(q.peek());
    }
}
