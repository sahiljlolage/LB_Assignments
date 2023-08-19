////////////////////////////////////////////////////////////////////////////////////////////////
//Problem Statement : write java program which accept matrix and display addition of elements 
// from each column.
////////////////////////////////////////////////////////////////////////////////////////////////
import java.util.*;

class MyArray
{
    public int Arr[][];

    public MyArray(int i, int j)
    {
        Arr = new int[i][j];
    }
    
    int[] AddColumn(int Arr[][],int iRow,int iCol)
    {
        Scanner sobj = new Scanner(System.in);
        // int Arr1[][] = new int[iRow][iCol];
        int[] iSum = new int[iCol];

        System.out.println("Enter elements ");
        for(int i = 0; i < Arr.length; i++)
        {
            for(int j = 0; j < Arr[i].length; j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
        }
        sobj.close();

        for(int j = 0; j < iRow; j++)
        {
            int iAdd = 0;
            for(int i = 0; i < iCol; i++)
            {
                iAdd = iAdd + Arr[i][j];
            }          
            iSum[j] = iAdd;
        }
        return iSum;
    }

}   
class program47_4
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

        System.out.println(mobj.AddColumn(Arr,iValue1,iValue2));

        
        sobj.close();
    }
}


// Pending 