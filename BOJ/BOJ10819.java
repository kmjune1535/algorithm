package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ10819 {
    public static int[] A;
    public static int N;
    public static boolean last;

    public static int calculate() {
        int sum = 0;
        for(int i=1; i<N; i++) {
            sum += Math.abs(A[i-1]-A[i]);
        }
        return sum;
    }

    public static void next_permutation() {

        int i = N-1;
        while (i>0 && A[i-1] >= A[i]) i-=1;

        if (i <= 0) {
            last = true;
            return;
        }

        int j = N-1;
        while(A[j]<= A[i-1]) j-=1;

        int tmp = A[i-1];
        A[i-1] = A[j];
        A[j] = tmp;

        j = N-1;
        while(i<j) {
            tmp = A[i];
            A[i] = A[j];
            A[j] = tmp;
            i+=1;
            j-=1;
        }

    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        A = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A);

        int max = 0;
        do{
            max = Math.max(max, calculate());
            next_permutation();
        }
        while(!last);

        System.out.println(max);
    }
}
