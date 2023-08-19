////////////////////////////////////////////////////////////////////////////////////////////////
//Problem Statement : write java program which accept matrix and return largest number from 
// both the diagonals.
////////////////////////////////////////////////////////////////////////////////////////////////
import java.util.*;

class MyArray
{
    public int Arr[][];

    public MyArray(int i, int j)
    {
        Arr = new int[i][j];
    }
    
    int MaxDiagonal(int Arr[][],int iRow,int iCol)
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter elements ");
        for(int i = 0; i < Arr.length; i++)
        {
            for(int j = 0; j < Arr[i].length; j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
        }
        sobj.close();

        int iMax = 0;

        for(int i = 0; i < Arr.length; i++)
        {
            int j = Arr[0].length - 1 - i;
            
            if(Arr[i][i] > iMax)
            {
                iMax = Arr[i][i];
            }
            if(Arr[i][j] > iMax)
            {
                iMax = Arr[i][j];
            }
        }
        // oppsite diagonal
        // for(int i = 0; i < Arr.length; i++)
        // {
        //     int j = Arr[0].length - 1 - i;

        //     if(Arr[i][j] > iMax)
        //     {
        //         iMax = Arr[i][j];
        //     }
        // }
        return iMax;
    }

}   
class program47_3
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

        int iRet = mobj.MaxDiagonal(Arr,iValue1,iValue2);
        System.out.println("Maximum number for diagonal is "+iRet);
        
        sobj.close();
    }
}
