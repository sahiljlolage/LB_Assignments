////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Problem Statement : write a java program which accept string from user and return difference between frequency 
// of small characters and frequency of capital characters. 
////////////////////////////////////////////////////////////////////////////////////////////////////////////////
import java.util.*;

class StringDemo
{
    public int CountDiff(String str)
    {
        char Arr[] = str.toCharArray();
        
        int iCnt = 0,iCount1 = 0,iCount2 = 0;

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if((Arr[iCnt] >= 'a') && (Arr[iCnt] <= 'z'))
            {
                iCount1++;
            }
            else if((Arr[iCnt] >= 'A') && (Arr[iCnt] <= 'Z'))
            {
                iCount2++;
            }
        }
        return iCount1 - iCount2;
    }
}

class program33_3
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a string : ");
        String str = sobj.nextLine();

        StringDemo dobj = new StringDemo();
        int iRet = dobj.CountDiff(str);

        System.out.println("Difference is : "+iRet);

        sobj.close();
    }
}