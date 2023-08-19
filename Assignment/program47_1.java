////////////////////////////////////////////////////////////////////////////////////////////////
//Problem Statement : write java program which accept matrix from user and return addition of
// diagonal elements.
////////////////////////////////////////////////////////////////////////////////////////////////
import java.util.*;

class MyArray
{
    public int Arr[][];

    public MyArray(int i, int j)
    {
        Arr = new int[i][j];
    }
    
    int AddDiagonal(int Arr[][],int iRow,int iCol)
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

        int iSum = 0;

        for(int i = 0; i < Arr.length; i++)
        {
            iSum = iSum + Arr[i][i];
        }
        return iSum;
    }

}   
class program47_1
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

        int iRet = mobj.AddDiagonal(Arr,iValue1,iValue2);
        System.out.println(iRet);
        
        sobj.close();
    }
}
