package com;
import java.util.*;
public class uglyNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        arr[0] = 1;
        int p2 = 0;
        int p3 = 0;
        int  p5 = 0;
        for(int i=1;i<n;i++){
            int f1 = 2* arr[p2];
            int f2 = 3* arr[p3];
            int f3 = 5* arr[p5];

            int min = Math.min(f1,Math.min(f2,f3));
            if(min == f1){
                p2++;
            }
            if(min == f2){
                p3++;
            }
            if(min == f3){
                p5++;
            }
            arr[i] = min;
        }
        System.out.println(arr[n-1]);
    }
}
