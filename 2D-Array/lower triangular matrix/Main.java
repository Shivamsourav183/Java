import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int a[][] = new int[n][n];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j] = sc.nextInt();
            }
        }
        
        boolean isLowerTriangular = true;

        
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i][j] != 0){
                    isLowerTriangular = false;
                    break;
                }
            }
            // if (!isLowerTriangular) break;
        }

        if(isLowerTriangular){
            System.out.print("Lower triangular matrix");
        }else{
            System.out.print("Not a Lower triangular matrix");
        }
    }
}
