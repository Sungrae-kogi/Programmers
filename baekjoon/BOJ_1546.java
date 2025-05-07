package baekjoon;

import java.util.Scanner;

public class BOJ_1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] score = new int[N];

        int M = score[0];
        for(int i=0; i<N; i++){
            score[i] = sc.nextInt();
            if(score[i] > M){
                M = score[i];
            }
        }

        double[] score_fix = new double[N];
        double sum=0;
        for(int i=0; i<N; i++){
            score_fix[i] = (double) score[i]/M*100;
            sum += score_fix[i];
        }

        System.out.println(sum/N);

    }
}