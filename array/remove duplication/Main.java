import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a); // if array is sorted then no need to use do sort or else use
        int res = 1;
        for(int i=1;i<n;i++){
            if(a[i] != a[res-1]){
                a[res] = a[i];
                res++;
            }
        }
        
        System.out.println("Size of an array: "+ res);
        System.out.print("after removing duplicate:");
        for(int i=0;i<res;i++){
        System.out.print(a[i]+" ");
        }
        
    
        
    }
}