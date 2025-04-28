package p1874;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] arg) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Integer>stack=new Stack<>();
        int n=Integer.parseInt(br.readLine());
        Boolean isPossible=true;
        int current=1;

        for(int i=0;i<n;i++){
            int num=Integer.parseInt(br.readLine());
            while(current<=num){
                stack.push(current++);
                sb.append("+\n");
            }
            if(stack.peek()==num){
                stack.pop();
                sb.append("-\n");
            }else{
                isPossible=false;
                break;
            }
        }
        System.out.println(isPossible?sb.toString():"NO");
    }
}
