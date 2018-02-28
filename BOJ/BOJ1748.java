package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1748 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int ans = 0;
        for(int len=1, start=1; start<=N; start*=10, len++) {
            int end = start*10-1;
            if(end > N) {
                end = N;
            }
            ans += (end - start +1) * len;
        }
        System.out.println(ans);

    }
}
