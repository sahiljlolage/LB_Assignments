////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Problem Statement : write java program which accept array of characters from user and accept one character. 
// Return occurrence of that character without considering case.
////////////////////////////////////////////////////////////////////////////////////////////////////////////
import java.util.*;

class MyArray
{
    public int Search(char arr[])
    {
        Scanner sobj = new Scanner(System.in);

        int iCount = 0;
        System.out.println("Enter a character that you want to search ");
        char ch = sobj.next().charAt(0);

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] >= 'A' && arr[i] <= 'Z')
            {
                arr[i] = (char)(arr[i] + 32);   
            }
            if((arr[i] >= 'a' && arr[i] <= 'z'))
            {
                arr[i] = (char)(arr[i]);
            }
            if(arr[i] == ch)
            {
                iCount++;
            }
        }
        sobj.close();
        return iCount;
    }
}   

class program44_4
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
        
        int iRet = mobj.Search(Arr1);
        System.out.println(" "+iRet);
        
        sobj.close();
    }
}
