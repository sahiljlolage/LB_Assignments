///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Problem Statement : Accept string from user and reverse the contents of that string by toggling that the case.
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
import java.util.*;

class StringDemo
{      
    public String StrRevTogX(String str)
    {
        char Arr[] = str.toCharArray();

        int iStart = 0;
        int iEnd = Arr.length - 1;
        char cTemp = ' ';

        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {        
            if(Arr[iCnt] >= 'a' && Arr[iCnt] <= 'z')
            {
                Arr[iCnt] = (char)(Arr[iCnt] - 32);
            }
            else if(Arr[iCnt] >= 'A' && Arr[iCnt] <= 'Z')
            {
                Arr[iCnt] = (char)(Arr[iCnt] + 32);
            }
        }
        while(iStart < iEnd)
        {
            cTemp = Arr[iStart];
            Arr[iStart] = Arr[iEnd];
            Arr[iEnd] = cTemp;

            iStart++;
            iEnd--;
        }               
        return new String(Arr);
    }
}

class program37_4
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter string : ");
        String str1 = sobj.nextLine();
        
        StringDemo dobj = new StringDemo();

        String srg = dobj.StrRevTogX(str1);
        
        System.out.println(srg);
        
        sobj.close();
    }
}
