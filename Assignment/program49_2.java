/////////////////////////////////////////////////////////////////////////////////////////////////////
//Problem Statement : write java program which accept number from user and display below pattern.
/*  Output :
            *   *   *   *   *   *
            *   *   *   *   
            *   *   *   *   *   *   *   *
            *   *   *   *   *   *   *   
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
            int no = str.charAt(i) - '0';
            for(int j = 0; j < no; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
class program49_2
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
