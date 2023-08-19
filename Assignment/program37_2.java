///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Problem Statement : write a java program which accept 2 strings from user and check whether contents of two 
// strings are equal or not.
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
import java.util.*;

class StringDemo
{      
    public boolean StrCmpX(String src,String dest)
    {
        while(src != " " && dest != " ")
        {
            if(src != dest)
            {
                break;
            }
        }
        if(src != " " && dest != " ")
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class program37_2
{
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter First string : ");
        String str1 = sobj.nextLine();
        
        System.out.println("Enter Second string : ");
        String str2 = sobj.nextLine();
                     
        StringDemo dobj = new StringDemo();
        boolean bRet = dobj.StrCmpX(str1, str2);
        if(bRet == true)
        {
            System.out.println("Both the strings are identical");            
        }
        else
        {
            System.out.println("Both the strings are different");
        }       

        sobj.close();
    }
}
