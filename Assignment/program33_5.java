////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Problem Statement : write a java program which accept string from user and display it in reverse order. 
////////////////////////////////////////////////////////////////////////////////////////////////////////////////
import java.util.*;

class StringDemo
{
    public void Reverse(String str)
    {
        char Arr[] = str.toCharArray();
        
        int iStart = 0;
        int iEnd = Arr.length - 1;

        char cTemp = ' ';

        while(iStart < iEnd)
        {
            cTemp = Arr[iStart];
            Arr[iStart] = Arr[iEnd];
            Arr[iEnd] = cTemp;

            iStart++;
            iEnd--;
        }
        // return new String(Arr);
        String ret = new String(Arr);
        System.out.println(ret);
    }
}

class program33_5
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a string : ");
        String str = sobj.nextLine();

        StringDemo dobj = new StringDemo();
        dobj.Reverse(str);
        
        sobj.close();
    }
}