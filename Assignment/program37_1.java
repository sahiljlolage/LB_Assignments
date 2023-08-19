///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Problem Statement : write a java program which accept 2 strings from user and concat N characters of second 
// string after first string.Value of N should be accepted from user.
// Note : If third parameter is greater than the size of second string then concat whole string after first string.
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
import java.util.*;

class StringDemo
{      
    public String StrNCatX(String src, String dest, int iCnt)
    {
        String Output = src + " ";

        if(iCnt <= dest.length()){
            for(int iCount = 0; iCount < iCnt; iCount++)
            {
                Output = Output + dest.charAt(iCount);
            }
        }else{
            return src+ " " +dest;
        }
        return Output;
        
    }
}

class program37_1
{
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter First string : ");
        String str1 = sobj.nextLine();
        
        System.out.println("Enter Second string : ");
        String str2 = sobj.nextLine();
                     
        System.out.println("Enter the no. of letters you want to concate : ");
        int iNo = sobj.nextInt();

        StringDemo dobj = new StringDemo();
        String sRet = dobj.StrNCatX(str1, str2, iNo);
        
        System.out.println("Result is   : "+sRet); 

        sobj.close();
    }
}
