////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Problem Statement : write a java program which accept N numbers from user and accept range,Display all 
// elements from that range. 
////////////////////////////////////////////////////////////////////////////////////////////////////////////////
import java.util.*;

class Number
{
    protected int Arr[];
    protected int iNo1;
    protected int iNo2;
    
    public Number(int iSize,int X,int Y)
    {
        Arr = new int[iSize];
        iNo1 = X;
        iNo2 = Y;
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
    static final int ERR = -1;
    public MyArray(int iSize,int iNo1,int iNo2)
    {
        super(iSize,iNo1,iNo2);
    }
    public void Display(int Arr[],int iStart,int iEnd)
    {
         for(int iCnt = iStart; iCnt <= iEnd; iCnt++)
         {
            System.out.println(Arr[iCnt]);
         }
    }
}
class program36_4
{
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of elements : ");
        int iSize = sobj.nextInt();
       
        
        System.out.println("Enter the start number : ");
        int iValue1 = sobj.nextInt();
        
        System.out.println("Enter the end number : ");
        int iValue2 = sobj.nextInt();
        
        MyArray mobj = new MyArray(iSize,iValue1,iValue2);

        int Arr[] = mobj.Accept();

         mobj.Display(Arr, iValue1,iValue2);

        sobj.close();
    }
}
