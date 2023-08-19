////////////////////////////////////////////////////////////////////////////////////////////////
//Problem Statement : write java program which accept matrix and one number from user and return
// frequency of that number.
////////////////////////////////////////////////////////////////////////////////////////////////
import java.util.*;

class MyArray
{
    public int Arr[][];
    public int iNo = 0;

    public MyArray(int i, int j,int iNo)
    {
        Arr = new int[i][j];
        iNo = 0;
    }
    
    int AddDiagonal(int Arr[][],int iRow,int iCol,int iNo)
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

        int iFreq = 0;

        for(int i = 0; i < Arr.length; i++)
        {
            for(int j = 0; j < Arr[i].length; j++)
            {            
                if(Arr[i][j] == iNo)
                {
                    iFreq++;
                }
            }
        }
        return iFreq;
    }

}   
class program47_2
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter number of Rows : ");
        int iValue1 = sobj.nextInt();
        
        System.out.println("Enter number of Columns : ");
        int iValue2 = sobj.nextInt();
        
        System.out.println("Enter number : ");
        int iValue3 = sobj.nextInt();
        

        int Arr[][] = new int[iValue1][iValue2];
       
        MyArray mobj = new MyArray(iValue1, iValue2,iValue3);

        int iRet = mobj.AddDiagonal(Arr,iValue1,iValue2,iValue3);
        System.out.println("Frequency of "+iValue3+" is "+iRet);
        
        sobj.close();
    }
}
