///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Problem Statement : write java program which accept two arrays from user and display its even contents of each array. 
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
import java.util.*;

class MyArray
{
    public void DisplayEven(int Arr1[],int Arr2[])
    {
        for(int i = 0; i< Arr1.length; i++)
        {
            if(Arr1[i] % 2 == 0)
            {
                System.out.print(Arr1[i]+"\t");
            }
        }
        System.out.println();
        
        for(int j = 0; j< Arr2.length; j++)
        {
            if(Arr2[j] % 2 == 0)
            {
                System.out.print(Arr2[j]+"\t");
            }
        }
        System.out.println();
    }
}   

class program42_2
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
        
        System.out.println("Enter the elements in Array 1 : ");
        for(int i = 0; i< Arr1.length; i++)
        {
            Arr1[i] = sobj.nextInt();
    
        }

        System.out.println("Enter the elements in Array 2 : ");
        for(int j = 0; j< Arr2.length; j++)
        {
            Arr2[j] = sobj.nextInt();
    
        }

        mobj.DisplayEven(Arr1,Arr2);
     
        sobj.close();
    }
}
