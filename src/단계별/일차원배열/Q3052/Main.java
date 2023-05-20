package 단계별.일차원배열.Q3052;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int result = 0;

        for (int i = 0; i < 10; i++) {
            st = new StringTokenizer(br.readLine());
            int check = Integer.parseInt(st.nextToken());
            if ((check % 42) == 0){
                result++;
            }
        }
        sb.append(result);
        br.close();
        System.out.println(sb);
    }
}