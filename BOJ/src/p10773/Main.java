package p10773;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k=Integer.parseInt(br.readLine());
        int []a=new int[k];
        ArrayList<Integer> b = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            a[i] = Integer.parseInt(br.readLine());
            if (a[i] != 0) {
                b.add(a[i]);
            } else if(a[i]==0&&!b.isEmpty()){
                b.remove(b.size()-1);
            }
        }
        int sum=0;
        for(int num:b){
            sum+=num;
        }
        System.out.println(sum);
    }
}
