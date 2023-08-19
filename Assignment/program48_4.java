/////////////////////////////////////////////////////////////////////////////////////////////////////
//Problem Statement : write java program which accept matrix and check whether the matrix is identity 
// matrix or not. 
/////////////////////////////////////////////////////////////////////////////////////////////////////
import java.util.*;

class MyArray
{
    public int Arr[][];

    public MyArray(int i, int j)
    {
        Arr = new int[i][j];
    }
    
    Boolean ChkIdentity(int Arr[][],int iRow,int iCol)
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
        for(int i = 0; i < Arr.length; i++)
        {
            for(int j = 0; j < Arr[i].length; j++)
            {
                if(( i == j && Arr[i][j] != 1) || (i != j && Arr[i][j] != 0))
                {
                        return false;
                }
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
        return true;
    }
}   
class program48_4
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

        boolean bRet = mobj.ChkIdentity(Arr,iValue1,iValue2);
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
