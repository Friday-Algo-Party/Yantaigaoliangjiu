package p4153;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        while(true){
            st=new StringTokenizer(br.readLine());
            int x=Integer.parseInt(st.nextToken());
            int y=Integer.parseInt(st.nextToken());
            int z=Integer.parseInt(st.nextToken());
            if(x==0&&y==0&&z==0){
                break;
            }
            int temp;
            if(x>y){
                temp=x;
                x=y;
                y=temp;
            }
            if(y>z){
                temp=y;
                y=z;
                z=temp;
            }
            if(x*x+y*y==z*z){
                System.out.println("right");
            }else{
                System.out.println("wrong");
            }
        }

    }
}
