package src.BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ2309 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] dwarf = new int[9];
        int sum = 0;
        int tmp = 0;

        for(int i=0; i<9; i++) {
            dwarf[i] = Integer.parseInt(br.readLine());
            sum += dwarf[i];
        }

        Arrays.sort(dwarf);

        for(int i=8; i>0; i--) {
            if(tmp!=0) break;
            for(int j=7; j>0; j--) {
                if(i==j) continue;
                if(sum - dwarf[i] - dwarf[j] == 100) {
                    tmp = i*101 + j;
                    break;
                }
            }
        }

        for(int i=0; i<9; i++) {
            if(tmp/101 ==i || tmp%101 ==i) continue;
            System.out.println(dwarf[i]);
        }
    }

}
