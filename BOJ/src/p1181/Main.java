package p1181;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        String[] word=new String[n];
        for(int i=0;i<n;i++){
            word[i]=br.readLine();
        }
        Arrays.sort(word, new Comparator<String>(){
            @Override
            public int compare(String o1, String o2) {
                if(o1.length()<o2.length()) return -1;
                if(o1.length()>o2.length()) return 1;
                return o1.compareTo(o2);
            }
        });
        System.out.println(word[0]);
        for(int i=1;i<n;i++){
            if(word[i]==word[i-1]){
                break;
            }else{
                System.out.println(word[i]);
            }
        }
    }
}
