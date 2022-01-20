package newSecond;

import java.util.Scanner;

public class SmallerthanK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int []a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int len,lft = 0;
        int mul = 1;
        int count = 0;
        int i=0;
        for(i=0;i<n;i++){
            mul = mul*a[i];
            while(lft<i && mul >= k){
                mul/=a[lft];
                lft += 1;
            }
            if(mul < k){
                len = i-lft+1;
                count += len;
            }
        }
        System.out.println(count);

    }
}
