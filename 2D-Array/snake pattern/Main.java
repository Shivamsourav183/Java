import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int num[][] = new int[r][c];
        
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                num[i][j] = sc.nextInt();
            
            }
        }
        for(int i=0;i<r;i++){
            if(i%2==0){
                for(int j=0;j<c;j++){
                    System.out.print(num[i][j]+" ");
                }
            }else{
                    for(int j=c-1;j>=0;j--){
                        System.out.print(num[i][j]+" ");
                        
                    }
                }
        }
        
    }
}


