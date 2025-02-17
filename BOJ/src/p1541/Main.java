package p1541;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] part = input.split("-");
        int result = sumOfString(part[0]);
        for(int i=1;i<part.length;i++){
            result -= sumOfString(part[i]);
        }
        System.out.println(result);
    }
    private static int sumOfString(String str){
        String []numbers=str.split("\\+");
        int sum=0;
        for(String num:numbers){
            sum+=Integer.parseInt(num);
        }
        return sum;
    }
}
