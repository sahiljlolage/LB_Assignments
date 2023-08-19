/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Problem Statement : Accept string from user and check whether the string is pallindrome or not without considering
// its case.
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
import java.util.*;

class StringDemo
{      
    public boolean StrPallindrome(String str)
    {
        char Arr[] = str.toCharArray();

        int iStart = 0;
        int iEnd = Arr.length - 1;

            while(iStart < iEnd)
            {
                if(Arr[iStart] != Arr[iEnd])
                {
                    return false;       
                }
                iStart++;
                iEnd--;
            }
            return true;
        }
}

class program37_5
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter string : ");
        String str1 = sobj.nextLine();
        
        StringDemo dobj = new StringDemo();

        boolean bRet = dobj.StrPallindrome(str1);

        if(bRet == true)
        {
            System.out.println("String is Pallindrome");
        }
        else
        {
            System.out.println("String is not Pallindrome");
        }
        sobj.close();
    }
}
