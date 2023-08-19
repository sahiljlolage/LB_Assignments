/////////////////////////////////////////////////////////////////////////////////////////////////////
//Problem Statement : write java program which accept matrix and check whether the matrix is sparse 
// matrix or not.
// sparse matrix is a matrix with majority of its elements equal to zero.
/////////////////////////////////////////////////////////////////////////////////////////////////////
import java.util.*;

class MyArray
{
    public int Arr[][];

    public MyArray(int i, int j)
    {
        Arr = new int[i][j];
    }
    
    Boolean ChkSparse(int Arr[][],int iRow,int iCol)
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
        sobj.close();
        int iCount = 0;
        for(int i = 0; i < Arr.length; i++)
        {
            for(int j = 0; j < Arr.length; j++)
            {
                if(Arr[i][j] == 0)
                {
                        iCount++;
                }
            }
        }
        if(iCount > (Arr.length) / 2)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}   
class program48_5
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

        boolean bRet = mobj.ChkSparse(Arr,iValue1,iValue2);
        if(bRet == true)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");            
        }
        sobj.close();
    }
}
