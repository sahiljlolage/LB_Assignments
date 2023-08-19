////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Problem Statement : write java program which accept array of characters from user and replace each capital  
// character with its corresponding small character.
////////////////////////////////////////////////////////////////////////////////////////////////////////////
import java.util.*;

class MyArray
{
    public void ArrayReplace(char arr[])
    {
        char Arr[] = new char[arr.length];
        for(int i = 0; i < arr.length; i++)
        {
            if((arr[i] >= 'A' && arr[i] <= 'Z'))
            {
                Arr[i] = (char)(arr[i] + 32);
            }
            if((arr[i] >= 'a' && arr[i] <= 'z'))
            {
                Arr[i] = (char)(arr[i]);
            }
        }
        System.out.print("\t");
        System.out.println(Arr);
    }
}   

class program44_1
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the size of Array : ");
        int iSize = sobj.nextInt();

        char Arr1[] = new char[iSize];

        System.out.println("Enter characters ");
        for(int i = 0; i< Arr1.length; i++)
        {
            Arr1[i] = sobj.next().charAt(0);
        }
        MyArray mobj = new MyArray();
        
        mobj.ArrayReplace(Arr1);
        
        sobj.close();
    }
}
