////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Problem Statement : write java program which accept array of characters from user and replace each capital  
// character with its corresponding small character.
////////////////////////////////////////////////////////////////////////////////////////////////////////////
import java.util.*;

class MyArray
{
    public int ArrayCountVowels(char arr[])
    {
        Scanner sobj = new Scanner(System.in);
        
        int iCount = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if((arr[i] == 'A' || arr[i] == 'E'|| arr[i] == 'I'|| arr[i] == 'O'|| arr[i] == 'U'|| arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i'|| arr[i] == 'o'|| arr[i] == 'e'))
            {
                iCount++;
            }
        }
        sobj.close();
        return iCount;
    }
}   

class program44_2
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
        
        int iRet = mobj.ArrayCountVowels(Arr1);
        System.out.println(" "+iRet);
        
        sobj.close();
    }
}
