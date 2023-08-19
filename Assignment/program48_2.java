//////////////////////////////////////////////////////////////////////////////////////////////////
//Problem Statement : write java program which accept matrix and reverse the contents of each row. 
/////////////////////////////////////////////////////////////////////////////////////////////////
import java.util.*;

class MyArray
{
    public int Arr[][];

    public MyArray(int i, int j)
    {
        Arr = new int[i][j];
    }
    
    void ReverseRow(int Arr[][],int iRow,int iCol)
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
        System.out.println("Reverse of matrix by Row  ");
        for(int i = 0; i< Arr.length - 1; i++)
        {
            int iStart = 0;
            int iEnd = Arr.length - 1;

            while(iStart < iEnd)
            {
                int temp = Arr[i][iStart];
                Arr[i][iStart] = Arr[i][iEnd];
                Arr[i][iEnd] = temp;

                iStart++;
                iEnd--;
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
class program48_2
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

        mobj.ReverseRow(Arr,iValue1,iValue2);
        sobj.close();
    }
}
