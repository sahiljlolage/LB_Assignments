////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Problem Statement : write java program which accept two arrays from user and display minimum element of 
// each array.
////////////////////////////////////////////////////////////////////////////////////////////////////////////
import java.util.*;

class MyArray
{
    public void MinArray(int arr1[],int arr2[])
    {
        int iMin1 = arr1[0];
        int iMin2 = arr2[0];

        for(int i = 0; i< arr1.length;i++)
        {
            if(arr1[i] < iMin1)
            {
                iMin1 = arr1[i];
            }
        }
        System.out.print(iMin1);
        for(int i = 0; i< arr2.length;i++)
        {
            if(arr2[i] < iMin1)
            {
                iMin2 = arr2[i];
            }
        }
        System.out.print("\t"+iMin2);
    }
}   

class program43_2
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
        
        mobj.MinArray(Arr1,Arr2);
        sobj.close();
    }
}
