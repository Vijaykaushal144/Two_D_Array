import java.util.Scanner;

public class User_Input {
    public static void main(String[] args) {
        int i,j,row,column,num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of row= ");
        row =sc.nextInt();
        System.out.println("Enter the number of column=");
        column=sc.nextInt();
        int array[][]=new int[row][column];
        System.out.println("Enter the value of array=");
        for (i=0;i<row;i++)
        {
            for (j=0;j<column;j++)
            {
                array[i][j]=sc.nextInt();
            }
        }
        System.out.print(array[1][2]);
        for (i=0;i<row;i++)
       {
          for (j=0;j<column;j++)
           {
               System.out.print(array[i][j]+" ");

            }
            System.out.println();
        }
    }
}
