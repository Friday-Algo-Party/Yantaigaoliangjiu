package p9012;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++){
            int check=0;
            boolean isValid = true;
            String test=br.readLine();
            char[] input=test.toCharArray();
            for(char c:input){
                if(c=='('){
                    check+=1;
                }else if(c==')'){
                    check-=1;
                }
                if(check<0){
                    isValid=false;
                    break;
                }
            }
            if(isValid&&check==0){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}