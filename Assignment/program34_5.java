////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Problem Statement : write a java program which accept N numbers from user and display all such elements 
// which are multiplies of 11. 
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
    
    public int[] Display(int Arr[])
    {
        int iCnt = 0;
        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] % 11 == 0 )
            {
                System.out.print(Arr[iCnt]+"\t");
            }
        }
        return Arr;
    }
}
class program34_5
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of elements : ");
        int iSize = sobj.nextInt();
        
        MyArray mobj = new MyArray(iSize);
        int Arr[] = mobj.Accept();

        mobj.Display(Arr);

        sobj.close();
    }
}