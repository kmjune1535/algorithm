package BOJ;

import java.util.Scanner;

public class BOJ1476 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int E = scan.nextInt(); //15
        int S = scan.nextInt(); //28
        int M = scan.nextInt(); //19
        int e=0, s=0, m=0;
        int year = 0;

        while(true) {
            if(E == e && S == s && M == m) break;

            e = e>=15 ? 1 : e+1;
            s = s>=28 ? 1 : s+1;
            m = m>=19 ? 1 : m+1;

            year++;
        }

        System.out.println(year);
    }
}
