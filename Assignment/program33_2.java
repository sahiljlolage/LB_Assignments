////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Problem Statement : write a java program which accept string from user and count number of small characters. 
////////////////////////////////////////////////////////////////////////////////////////////////////////////////
import java.util.*;

class StringDemo
{
    public int CountSmall(String str)
    {
        char Arr[] = str.toCharArray();
        
        int iCnt = 0,iCount = 0;

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if((Arr[iCnt] >= 'a') && (Arr[iCnt] <= 'z'))
            {
                iCount++;
            }
        }
        return iCount;
    }
}

class program33_2
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a string : ");
        String str = sobj.nextLine();

        StringDemo dobj = new StringDemo();
        int iRet = dobj.CountSmall(str);

        System.out.println("Number of small characters are : "+iRet);

        sobj.close();
    }
}