//////////////////////////////////////////////////////////////////////////////////////////////////
//Problem Statement : write java program which accept matrix and swap the contents of consecutive 
// rows.
////////////////////////////////////////////////////////////////////////////////////////////////
import java.util.*;

class MyArray
{
    public int Arr[][];

    public MyArray(int i, int j)
    {
        Arr = new int[i][j];
    }
    
    void swapRows(int Arr[][],int iRow,int iCol)
    {
        Scanner sobj = new Scanner(System.in);
        // int Arr1[][] = new int[iRow][iCol];

        System.out.println("Enter elements ");
        for(int i = 0; i < Arr.length; i++)
        {
            for(int j = 0; j < Arr[i].length; j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
        }
        System.out.println("Elements before swapping");
        for(int i = 0; i < Arr.length; i++)
        {
            for(int j = 0; j < Arr[i].length; j++)
            {
                System.out.print(Arr[i][j]);
            }
            System.out.println();
        }
        System.out.println("Elements after swapping");
        for(int i = 0; i < Arr.length - 1; i = i+2)
        {
            int[] temp = Arr[i];
            Arr[i] = Arr[i + 1];
            Arr[i + 1] = temp;
        }
        for(int i = 0; i < Arr.length; i++)
        {
            for(int j = 0; j < Arr[i].length; j++)
            {
                System.out.print(Arr[i][j]);
            }
            System.out.println();
        }
        sobj.close();
    }
}   
class program47_5
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

        mobj.swapRows(Arr,iValue1,iValue2);
        sobj.close();
    }
}
