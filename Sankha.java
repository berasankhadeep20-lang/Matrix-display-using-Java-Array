import java.util.*;
public class Sankha
 {
    public static void main(String[] args) 
    {
        Scanner se = new Scanner(System.in);
        System.out.println("Enter the size of the matrix");
        int n = se.nextInt();
        int a[][] = new int[n][n];
        System.out.println("Enter the elements of the matrix");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j] = se.nextInt();
            }
        }
        System.out.println("The matrix is:");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
 }