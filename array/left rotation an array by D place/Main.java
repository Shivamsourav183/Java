import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();         
        int a[] = new int[n];
        
        System.out.println("Enter the array elements:");
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();      
        }
        for(int i=0;i<n;i++){
            boolean flag = false;
            for(int j=i+1;j<n;j++){
                if(a[i]<=a[j]){
                    flag = true;
                    break;
                }
            }
            if(flag == false){
            System.out.print(a[i]+" ");
        }
        
        }
    }
}
