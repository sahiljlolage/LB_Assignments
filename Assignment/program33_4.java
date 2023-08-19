////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Problem Statement : write a java program which accept string from user and check whether it contains vowels 
// in it or not. 
////////////////////////////////////////////////////////////////////////////////////////////////////////////////
import java.util.*;

class StringDemo
{
    public boolean ChkVowel(String str)
    {
        char Arr[] = str.toCharArray();
        
        int iCnt = 0;
        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] == 'a' || Arr[iCnt] == 'e' || Arr[iCnt] == 'i' || Arr[iCnt] == 'o' || Arr[iCnt] == 'u' )
            {
                return true;
            }
        }
        return false;
    }
}

class program33_4
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a string : ");
        String str = sobj.nextLine();

        StringDemo dobj = new StringDemo();
        boolean bRet = dobj.ChkVowel(str);
        if(bRet == true)
        {
            System.out.println("String contains vowel");
        }
        else
        {
            System.out.println("String not contains vowel");
        }
        sobj.close();
    }
}