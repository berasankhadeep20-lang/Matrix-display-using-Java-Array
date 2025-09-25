import java.util.*;
public class Sankha
 {
    public static void main(String[] args) 
    {
        Scanner se = new Scanner(System.in);
        System.out.println("Enter the number of rows of the matrix");
        int n = se.nextInt();
        System.out.println("Enter the number of columns of the matrix");
        int m = se.nextInt();
        int a[][] = new int[n][m];
        System.out.println("Enter the elements of the matrix");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                a[i][j] = se.nextInt();
            }
        }
        System.out.println("The matrix is:");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
 }