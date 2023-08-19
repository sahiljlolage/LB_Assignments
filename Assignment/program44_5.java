////////////////////////////////////////////////////////////////////////////////////////////////
//Problem Statement : write java program which accept array from user and display below pattern 
/*
        *   *   *   *   *   *   *   *
        *   *   *   *   *   *   
        *   *   *   *
        *   *       
        *   *   *   *
 */
////////////////////////////////////////////////////////////////////////////////////////////////
import java.util.*;

class MyArray
{
    public void Pattern(int arr[])
    {
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr[i]; j++)
            {
                if(arr[i] % 2 == 0)
                {
                    System.out.print("*\t");
                }
            }
            System.out.println();
        }
    }
}   
class program44_5
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the size of Array : ");
        int iSize = sobj.nextInt();

        int Arr1[] = new int[iSize];

        System.out.println("Enter numbers ");
        for(int i = 0; i< Arr1.length; i++)
        {
            Arr1[i] = sobj.nextInt();
        }
        MyArray mobj = new MyArray();
        
        mobj.Pattern(Arr1);
        
        sobj.close();
    }
}
