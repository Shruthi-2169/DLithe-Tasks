import java.util.*;
class setMatrixZero{

    static int setMatrixZero(int matrix,int n,int m){
        int[] row={0};
        int[] col = {0};
        for(int  i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==0){
                    row[i] = 1;
                    col[j] = 1;
               }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(row[i]==1 || col[j]==1){
                    matrix[i][j]==0;
                }
               }
            }
        }
        return matrix;
          
    }
    public static void main(String args[]){
        Scanner sc  =  new Scanner(System.in) ;    
        int  n   =  sc.nextInt();
        int m = sc.nextInt();
        int[][]  matrix = new int[n][m];
        for(int  i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j] =sc.nextInt();
            }
         }
         for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
         }
         System.out.println(setMatrixZero(matrix, n, m));
    }
}