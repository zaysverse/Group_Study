package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_24265_230313 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Long n = Long.parseLong(br.readLine());


        sb.append(n * (n-1) / 2).append("\n").append(2);
        System.out.println(sb);

    }
}
