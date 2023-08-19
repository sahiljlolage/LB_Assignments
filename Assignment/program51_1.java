/////////////////////////////////////////////////////////////////////////////////////////////////////
//Problem Statement : write java program which accept number from user and display below pattern.
/*  Output :
            6   4   8   7       
            6   4   8   7       
            6   4   8   7       
            6   4   8   7       
*/
/////////////////////////////////////////////////////////////////////////////////////////////////////
import java.util.*;

class MyArray
{
    public void Pattern(int iNo)
    {
        int iDigit = 0, iRev = 0;
        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iRev = iRev * 10 + iDigit;
            iNo = iNo / 10;
        }
        String str = String.valueOf(iRev);

        for(int i = 0 ; i < str.length(); i++)
        {
            for(int j = 0; j < str.length(); j++)
            {
                System.out.print(str.charAt(j)+" ");
            }
             System.out.println();
        }
    }
}
class program51_1
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter number : ");
        int iValue1 = sobj.nextInt();
        
        MyArray mobj = new MyArray();
        mobj.Pattern(iValue1);
        
        sobj.close();
    }
}
