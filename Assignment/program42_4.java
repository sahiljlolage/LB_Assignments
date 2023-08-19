///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Problem Statement : write java program which accept two arrays from user and form a new array which is combination of 
// contents of first and second array. 
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
import java.util.*;

class MyArray
{
    public int[] ArrayConcate(int arr1[],int iSize1,int arr2[],int iSize2)
    {
        Scanner sobj = new Scanner(System.in);

        arr1 = new int[iSize1];
        arr2 = new int[iSize2];

        System.out.println("Enter elements in array1 : ");
        for(int i = 0; i < arr1.length; i++)
        {
            arr1[i] = sobj.nextInt();
        }
        
        System.out.println("Enter elements in array2 : ");
        for(int i = 0; i < arr2.length; i++)
        {
            arr2[i] = sobj.nextInt();
        }
        int iLen = arr1.length + arr2.length;
        int[] iRet = new int[iLen];
        // int iPos = 0;

        for(int i = 0; i< arr1.length; i++)     // first to iRet array
        {
            iRet[i] = arr1[i];          
        }

        for(int i = 0; i< arr2.length; i++)
        {
            iRet[arr1.length + i] = arr2[i];        // to concate second array to iRet
        }
        // for(int i : arr1)
        // {
        //     iRet[iPos] = i;
        //     iPos++;
        // }
        
        // for(int i : arr2)
        // {
        //     iRet[iPos] = i;
        //     iPos++;
        // }
        sobj.close();
        return iRet;
    }
}   

class program42_4
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
        
        MyArray mobj = new MyArray();
        
        int[] iRes = mobj.ArrayConcate(Arr1,iSize1,Arr2,iSize2);
        System.out.println(Arrays.toString(iRes));

        sobj.close();
    }
}
