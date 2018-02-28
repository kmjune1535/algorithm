package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ10974 {

    public static int N;
    public static int[] arr;
    public static boolean last;

    public static void next_permutation() {

        int i = N-1;
        while (i>0 && arr[i-1] >= arr[i]) i-=1;

        if (i <= 0) {
            last = true;
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

    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N];

        for(int i=0; i<N; i++) {
            arr[i] = i+1;
        }

        do{
            for (int i=0; i<N; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            next_permutation();
        }
        while(!last);

    }
}
