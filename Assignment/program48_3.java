/////////////////////////////////////////////////////////////////////////////////////////////////////
//Problem Statement : write java program which accept matrix and reverse the contents of each column. 
/////////////////////////////////////////////////////////////////////////////////////////////////////
import java.util.*;

class MyArray
{
    public int Arr[][];

    public MyArray(int i, int j)
    {
        Arr = new int[i][j];
    }
    
    void ReverseCol(int Arr[][],int iRow,int iCol)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter elements ");
        for(int i = 0; i < Arr.length; i++)
        {
            for(int j = 0; j < Arr.length; j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
        }

        System.out.println("Reverse of matrix by Row  ");
        for(int i = 0; i< iRow / 2; i++)
        {
           for(int j = 0; j< iCol; j++)
           {
            int temp = Arr[i][j];
            Arr[i][j] = Arr[iRow - i - 1][j];
            Arr[iRow - i - 1][j] = temp;
           }
        }
        for(int i = 0; i< Arr.length; i++)
        {
            for(int j = 0; j < Arr.length; j++)
            {
                System.out.print(Arr[i][j] + " ");
            }
            System.out.println();
        }
        sobj.close();
    }
}   
class program48_3
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter number of Rows : ");
        int iValue1 = sobj.nextInt();
        
        System.out.println("Enter number of Columns : ");
        int iValue2 = sobj.nextInt();
        
        int Arr[][] = new int[iValue1][iValue2];

        MyArray mobj = new MyArray(iValue1, iValue2);

        mobj.ReverseCol(Arr,iValue1,iValue2);
        sobj.close();
    }
}
