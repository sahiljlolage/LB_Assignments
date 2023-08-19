////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Problem Statement : write a java program which accept string from user and count number of capital characters. 
////////////////////////////////////////////////////////////////////////////////////////////////////////////////
import java.util.*;

class StringDemo
{
    public int CountCapital(String str)
    {
        char Arr[] = str.toCharArray();
        int iCnt = 0,iCount = 0;

        for(iCnt = 0;iCnt < Arr.length; iCnt++)
        {
            if((Arr[iCnt] >= 'A') && (Arr[iCnt] <= 'Z'))
            {
                iCount++;
            }
        }
        return iCount;
    }
}

class program33_1
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter a string : ");
        String str = sobj.nextLine();

        StringDemo dobj = new StringDemo();
        int iRet = dobj.CountCapital(str);

        System.out.println("Number of Capital characters are : "+iRet);

        sobj.close();
    }
}
