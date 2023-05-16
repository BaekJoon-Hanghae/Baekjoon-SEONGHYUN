package 단계별.일차원배열.Q10813;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int[] result = new int[N + 1];
        int M = Integer.parseInt(st.nextToken());

        for (int i = 1; i < N; i++) {
            result[i] = i + 1;
        }
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int changeFirst = Integer.parseInt(st.nextToken());
            int changeSecond = Integer.parseInt(st.nextToken());
            int temp = Integer.parseInt(st.nextToken());
            result[changeFirst] = result[changeSecond];
            result[changeSecond] = temp;
        }
        for (int i = 0; i < result.length; i++) {
            sb.append(result[i] + " ");
        }
        br.close();
        System.out.println(sb);
    }
}