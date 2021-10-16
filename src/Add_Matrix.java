import java.util.Scanner;

public class Add_Matrix {
    public static void main(String[] args) {
        int i,j,row,column,num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of row= ");
        row =sc.nextInt();
        System.out.println("Enter the number of column=");
        column=sc.nextInt();
        int a[][]=new int[row][column];
        System.out.println("Enter the value of array1=");
        for (i=0;i<row;i++) {
            for (j = 0; j < column; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        int b[][]=new int[row][column];
        System.out.println("Enter the value of array2=");
       for (i=0;i<row;i++)
     {
           for (j=0;j<column;j++) {
               b[i][j] = sc.nextInt();
           }
        }
       int sum[][]= new int[row][column];
       for (i=0;i<row;i++)
       {
           for (j=0;j<column;j++)
           {
               sum[i][j]=a[i][j]+b[i][j];
           }
       }
        System.out.println("Result array is: ");
       for (i=0;i<row;i++)
       {
           for (j=0;j<column;j++)
           {
               System.out.print(sum[i][j]+" ");
           }
           System.out.println();
       }
    }
}
