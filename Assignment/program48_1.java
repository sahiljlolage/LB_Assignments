//////////////////////////////////////////////////////////////////////////////////////////////////
//Problem Statement : write java program which accept matrix from user and display transpose of 
// the matrix.
////////////////////////////////////////////////////////////////////////////////////////////////
import java.util.*;

class MyArray
{
    public int Arr[][];

    public MyArray(int i, int j)
    {
        Arr = new int[i][j];
    }
    
    void Transpose(int Arr[][],int iRow,int iCol)
    {
        Scanner sobj = new Scanner(System.in);
         int ArrT[][] = new int[iRow][iCol];

        System.out.println("Enter elements ");
        for(int i = 0; i < Arr.length; i++)
        {
            for(int j = 0; j < Arr[i].length; j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
        }
        System.out.println("Transpose of matrix ");
        for(int i = 0; i< Arr.length; i++)
        {
            for(int j = 0; j < Arr.length; j++)
            {
                ArrT[i][j] = Arr[j][i];
            }
        }
        
        for(int i = 0; i< Arr.length; i++)
        {
            for(int j = 0; j < Arr.length; j++)
            {
                System.out.print(ArrT[i][j] + " ");
            }
            System.out.println();
        }
        sobj.close();
    }
}   
class program48_1
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

        mobj.Transpose(Arr,iValue1,iValue2);
        sobj.close();
    }
}
