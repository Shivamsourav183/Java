import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter the value of n: ");
        int n = sc.nextInt();
        
        System.out.println("enter the value matrix:");
        int m[][] = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                m[i][j] = sc.nextInt();
            }
        }
        
        int temp[][] = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                temp[i][j] = m[j][i];
            }
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(temp[i][j]+" ");
            }
             System.out.println();
        }

        
    }
}
