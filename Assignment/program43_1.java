////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Problem Statement : write java program which accept two arrays from user and return difference between 
// summation of arrays.
////////////////////////////////////////////////////////////////////////////////////////////////////////////
import java.util.*;

class MyArray
{
    public int DiffArray(int arr1[],int arr2[])
    {
        int iSum1 = 0;
        int iSum2 = 0;

        for(int i = 0; i< arr1.length;i++)
        {
            iSum1 = iSum1 + arr1[i];
        }

        for(int i = 0; i< arr2.length;i++)
        {
            iSum2 = iSum2 + arr2[i];
        }
        return iSum1 - iSum2;
    }
}   

class program43_1
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the size of Array1 : ");
        int iSize1 = sobj.nextInt();
        System.out.println("Enter the size of Array2 : ");
        int iSize2 = sobj.nextInt();
        
        int Arr1[] = new int[iSize1];
        int Arr2[] = new int[iSize2];
        
        System.out.println("Enter elements in array1 : ");
        for(int i = 0; i < Arr1.length; i++)
        {
            Arr1[i] = sobj.nextInt();
        }
        
        System.out.println("Enter elements in array2 : ");
        for(int i = 0; i < Arr2.length; i++)
        {
            Arr2[i] = sobj.nextInt();
        }
        MyArray mobj = new MyArray();
        
        int iRet = mobj.DiffArray(Arr1,Arr2);
        System.out.println("Result : "+iRet);
        sobj.close();
    }
}
