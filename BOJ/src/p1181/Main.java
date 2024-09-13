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
            word[i]=br.readLine();                              // 문자열 입력받아서 word 배열에 저장
        }
        Arrays.sort(word, new Comparator<String>(){             // 배열을 오름차순으로 정렬
            @Override
            public int compare(String o1, String o2) {
                if(o1.length()<o2.length()) return -1;
                if(o1.length()>o2.length()) return 1;
                return o1.compareTo(o2);                        // 문자열의 길이 비교
            }
        });
        System.out.println(word[0]);
        for(int i=1;i<n;i++){
            boolean a=word[i].equals(word[i-1]);
            if(a){
                continue;
            }else{
                System.out.println(word[i]);                    // 중복된 문자열의 경우 삭제, 그렇지 않으면 출력
            }
        }
    }
}
