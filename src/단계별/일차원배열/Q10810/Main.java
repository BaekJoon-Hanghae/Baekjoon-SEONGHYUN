package 단계별.일차원배열.Q10810;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int index = Integer.parseInt(st.nextToken());
        int[] arr = new int[index];
        int count = Integer.parseInt(st.nextToken());

        for (int i = 0; i < count; i++) {
            st = new StringTokenizer(br.readLine());
            int first = Integer.parseInt(st.nextToken());
            int second = Integer.parseInt(st.nextToken());
            int third = Integer.parseInt(st.nextToken());

            for (int j = first - 1; j <= second; j++) {
                arr[j] = third;
            }
        }
        for (int k = 0; k < arr.length; k++) {
            sb.append(arr[k] + " ");
        }
        br.close();
        System.out.println(sb);
    }
}