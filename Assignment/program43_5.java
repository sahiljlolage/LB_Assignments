////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Problem Statement : write java program which accept two array from user and check whether that array 
// and its elements are pallindrome or not.
////////////////////////////////////////////////////////////////////////////////////////////////////////////
import java.util.*;

class MyArray
{
    public boolean ChkPallindrome(int arr[])
    {
        Scanner sobj = new Scanner(System.in);
        int Arr[] = new int[arr.length];

        System.out.println("Enter element in array");
        for(int i = 0; i< Arr.length; i++)
        {
            Arr[i] = sobj.nextInt();
        }
        int iStart = 0;
        int iEnd = Arr.length - 1; 
        sobj.close();
        while(iStart < iEnd)
        {
            if(Arr[iStart] != Arr[iEnd])
            {
                return false;
            }
            iStart++;
            iEnd--;
        }
        return true;
    }
}   

class program43_5
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the size of Array : ");
        int iSize = sobj.nextInt();

        int Arr1[] = new int[iSize];

        MyArray mobj = new MyArray();
        
        boolean bRet = mobj.ChkPallindrome(Arr1);
        if(bRet == true)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println(false);
        }
        sobj.close();
    }
}
