package p1463;

import java.util.Scanner;

public class Main {
    static int input;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        input=sc.nextInt();
        int count=0;
        while (input!=1){
            if(input%3==0){
                input=input/3;
                count++;
            }else if(input%2==0){
                input=input/2;
                count++;
            } else{
                input-=1;
                count++;
            }
        }
        System.out.println(count);
    }
}
