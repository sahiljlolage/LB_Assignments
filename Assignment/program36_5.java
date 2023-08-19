///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Problem Statement : write a java program which accept N numbers from user and return product of all odd elements.
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
import java.util.*;

class Number
{
    protected int Arr[];
    
    public Number(int iSize)
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

class MyArray extends Number
{
    public MyArray(int iSize)
    {
        super(iSize);
    }
    public int product(int Arr[])
    {
        int iProd = 1;
         for(int iCnt = 0; iCnt < Arr.length; iCnt++)
         {
            if(Arr[iCnt] % 2 != 0)
            {
                iProd = iProd *Arr[iCnt];
            }
         }
         return iProd;
    }
}
class program36_5
{
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of elements : ");
        int iSize = sobj.nextInt();
                     
        MyArray mobj = new MyArray(iSize);

        int Arr[] = mobj.Accept();

        int iRet = mobj.product(Arr);
        System.out.println("Product of odd elements is  : "+iRet); 

        sobj.close();
    }
}
