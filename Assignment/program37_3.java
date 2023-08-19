///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Problem Statement : write a java program which accept 2 strings from user and check whether first N contents of  
// two strings are equal or not.
// Note : If third parameter is greater than the size of second string then concat whole string after first string.
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
import java.util.*;

class StringDemo
{      
    public boolean StrNCmpX(String src, String dest, int iCnt)
    {
        int[] arr= new int[iCnt];
        boolean flag = false;

            for(int iCount = 0; iCount < iCnt; iCount++)
            {
                if(dest.charAt(iCount) == src.charAt(iCount))
                {
                    arr[iCount] = iCount;
                }
            }
            for(int iCount = 0 ; iCount < arr.length; iCount++)
            {
                if(arr[iCount] != iCount)
                {
                    flag = true;
                    break;
                }
            }
            if(flag == true)
            {
                return false;
            }
            else
            {
                return true;
            }
    }
}

class program37_3
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter First string : ");
        String str1 = sobj.nextLine();
        
        System.out.println("Enter Second string : ");
        String str2 = sobj.nextLine();
                     
        System.out.println("Enter the no. of letters you want to concate : ");
        int iNo = sobj.nextInt();

        StringDemo dobj = new StringDemo();

        if(iNo > str2.length())
        {
            System.out.println(str1 +" "+ str2);
        }
        else
        {
            boolean bRet = dobj.StrNCmpX(str1, str2, iNo);
            if(bRet == true)
            {
                 System.out.println("Found Equal");
            }
            else
            {
                 System.out.println("Found Not Equal");
            }
        }        
        sobj.close();
    }
}
