////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Problem Statement : write a java program which accept N numbers from user and accept one another number as NO
// Check whether NO is present or not.  
////////////////////////////////////////////////////////////////////////////////////////////////////////////////
import java.util.*;

class Number
{
    protected int Arr[];
    protected int iNo;
    
    public Number(int iSize,int X)
    {
        Arr = new int[iSize];
        iNo = X;
    }

    protected int[] Accept()
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the elements : ");

        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }

        sobj.close();
        return Arr;
    }
}

class MyArray extends Number
{
    public MyArray(int iSize,int iNo)
    {
        super(iSize,iNo);
    }
    boolean Check(int Arr[],int iNo)
    {
        for(int iCnt = 0; iCnt < iNo; iCnt++)
        {
            if(Arr[iCnt] == iNo)
            {
                return true;
            }
        }
        return false;
    }
    
}
class program36_1
{
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        
        System.out.println("Enter number of elements : ");
        int iSize = sobj.nextInt();
       
        
        System.out.println("Enter the number : ");
        int iValue = sobj.nextInt();
        
        MyArray mobj = new MyArray(iSize,iValue);

        int Arr[] = mobj.Accept();
        boolean bRet = mobj.Check(Arr, iValue);
        if(bRet == true)
        {
            System.out.println("The given number is present");
        }
        else
        {
            System.out.println("The given number is not present");            
        }
        sobj.close();
    }
}
