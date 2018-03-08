package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2529 {
    static int k;
    static String[] compare;

    static int N = 10;
    static int[] arr;
    static boolean last;

    public static void next_permutation() {

        int i=N-1;
        while(i>0 && arr[i-1]>=arr[i]) i-=1;

        if(i<=0) {
            last = true;
            return;
        }

        int j=N-1;
        while(arr[i-1]>=arr[j]) j-=1;

        int tmp = arr[i-1];
        arr[i-1] = arr[j];
        arr[j] = tmp;

        j=N-1;
        while(i<j) {
            tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
            i+=1;
            j-=1;
        }


    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        k = Integer.parseInt(br.readLine());
        compare = new String[k];
        arr = new int[10];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0; i<k; i++) {
            compare[i] = st.nextToken();
        }

        for(int i=0; i<10; i++) {
            arr[i]=i;
        }

        StringBuilder sb = new StringBuilder();

        long max=0L;
        long min=9999999999L;
        do {
            for(int i=0; i<k; i++) {
                if(compare[i].equals(">")) {
                    if(arr[i]<arr[i+1]) break;
                }
                else {
                    if(arr[i]>arr[i+1]) break;
                }
                sb.append(arr[i]);
                if(i==k-1) {
                    sb.append(arr[i+1]);
                }
            }

            if(sb.length()==k+1) {
                long tmp = Long.parseLong(sb.toString());
                if(max<tmp) max = tmp;
                if(min>tmp) min = tmp;
            }

            next_permutation();
            sb = new StringBuilder();

        } while (!last);

        System.out.println(max);
        if(String.valueOf(min).length()==k+1) System.out.println(min);
        else System.out.println ("0"+min);
        
    }
}
