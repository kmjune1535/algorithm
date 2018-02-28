package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ10972 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int i = N-1;
        while (i>0 && arr[i-1] >= arr[i]) i-=1;

        if (i <= 0) {
            System.out.println(-1);
            return;
        }

        int j = N-1;
        while(arr[j]<= arr[i-1]) j-=1;

        int tmp = arr[i-1];
        arr[i-1] = arr[j];
        arr[j] = tmp;

        j = N-1;
        while(i<j) {
            tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
            i+=1;
            j-=1;
        }

        for(int a : arr) System.out.print(a+" ");


    }

}
