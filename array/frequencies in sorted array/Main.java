import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        
        int freq = 1, i=1;
        
        while(i<n){
            while(i<n && a[i]== a[i-1]){
                freq++;
                i++;
            }
            System.out.println(a[i-1]+" "+ freq);
            i++;
            freq= 1;
        }
        if(n==1||a[n-1]!=a[n-2]){
            System.out.println(a[n-1]+" "+ 1);
        }
    }
}