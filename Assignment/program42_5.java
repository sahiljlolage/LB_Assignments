///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Problem Statement : write java program which accept two arrays from user and display summation of each array.
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
import java.util.*;

class MyArray
{
    public void SumArray(int arr1[],int arr2[])
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
        System.out.println("Summation of array1 is "+iSum1);
        System.out.println("Summation of array2 is "+iSum2);
    }
}   

class program42_5
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
        
        mobj.SumArray(Arr1,Arr2);

        sobj.close();
    }
}
