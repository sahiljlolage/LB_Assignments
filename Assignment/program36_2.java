////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Problem Statement : write a java program which accept N numbers from user and accept one another number as NO
// return index of first occurrence of that NO. 
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
    static final int ERR = -1;
    public MyArray(int iSize,int iNo)
    {
        super(iSize,iNo);
    }
    public int FirstOcc(int Arr[],int iNo)
    {
        int iCnt = 0;
        int iPos = ERR;
        for(iCnt = 0 ;iCnt < Arr.length; iCnt++){
            if(Arr[iCnt] == iNo)
            {
                iPos = iCnt;
                break;
            }
        }
        return iPos;
    }   
}
class program36_2
{
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of elements : ");
        int iSize = sobj.nextInt();
       
        
        System.out.println("Enter the number : ");
        int iValue = sobj.nextInt();
        
        MyArray mobj = new MyArray(iSize,iValue);

        int Arr[] = mobj.Accept();

        int iRet = mobj.FirstOcc(Arr, iValue);
        System.out.println("First occurrence of "+iValue+" is : "+iRet);

        sobj.close();
    }
}
