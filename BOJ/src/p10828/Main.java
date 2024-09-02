package p10828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<n;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            String con=st.nextToken();
            if(con.equals("push")){
                int m=Integer.parseInt(st.nextToken());         //push : stack에 입려값 저장+ 출력 x
                stack.push(m);
            }else if(con.equals("pop")){
                if(stack.isEmpty()){                            //pop : stack 가장 위에 수를 빼고, 출력
                    System.out.println("-1");                   // stack이 비었을 때 -1 출력
                }else {
                    int m = stack.pop();
                    System.out.println(m);
                }
            }else if(con.equals("size")){
                System.out.println(stack.size());               //size : 스택에 들어있는 정수의 수 출력 = 스택의 크기 출력
            }else if(con.equals("empty")){
                if(stack.isEmpty()){
                    System.out.println("1");                    //empty : 스택이 비어있을 경우 1, 그렇지 않으면 0 출력
                }else{
                    System.out.println("0");
                }
            }else if(con.equals("top")){
                if(stack.isEmpty()){                            //top : 스택의 최상단의 값을 출력 -> peek 사용
                    System.out.println("-1");                   // 스택이 비었을 경우 -1 출력
                }else{
                    System.out.println(stack.peek());
                }
            }
        }
    }
}
