////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Problem Statement : write java program which accept two array from user and copy the contents of that  
// array into another array in reverse order and return new array.
////////////////////////////////////////////////////////////////////////////////////////////////////////////
import java.util.*;

class MyArray
{
    public int[] CopyArrayRev(int arr[])
    {
        Scanner sobj = new Scanner(System.in);
        
        int Arr1[] = new int[arr.length];
        int Arr2[] = new int[Arr1.length];

        System.out.println("Enter elements in array : ");
        for(int i = 0; i < Arr1.length; i++)
        {
            Arr1[i] = sobj.nextInt();
        }
        
        for(int i = 0; i < Arr1.length; i++)
        {
            Arr2[i] = Arr1[Arr1.length - 1 - i];  
        }
        sobj.close();
        return Arr2;
    }

    public void Pattern(int iValue1, int iValue2) {
    }
}   

class program43_3
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the size of Array : ");
        int iSize = sobj.nextInt();

        int Arr1[] = new int[iSize];
        int Arr2[] = new int[Arr1.length];

        MyArray mobj = new MyArray();
        
        int[] iRet = mobj.CopyArrayRev(Arr2);

        System.out.println(Arrays.toString(iRet));
        sobj.close();
    }
}
