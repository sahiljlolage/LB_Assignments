////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Problem Statement : write a java program which accept N numbers from user and return difference between
// summation of even elements and summation of odd elements. 
////////////////////////////////////////////////////////////////////////////////////////////////////////////////
import java.util.*;

class ArrayDemo
{
    protected int Arr[];

    public ArrayDemo(int iSize)
    {
        Arr = new int[iSize];
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

class MyArray extends ArrayDemo
{
    public MyArray(int iSize)
    {
        super(iSize);
    }
    public int Difference(int Arr[])
    {
        int iSum = 0,iSum1 = 0;

        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] % 2 == 0)
            {
                iSum = iSum + Arr[iCnt];
            }
            else if(Arr[iCnt] != 0)
            {
                iSum1 = iSum1 + Arr[iCnt];
            }
        }
        return iSum - iSum1;
    }
}
class program34_1
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of elements : ");
        int iSize = sobj.nextInt();

        MyArray mobj = new MyArray(iSize);
        int Arr[] = mobj.Accept();
        int iRet = mobj.Difference(Arr);

        System.out.println("Difference is : "+iRet);

        sobj.close();
    }
}