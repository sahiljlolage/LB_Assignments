/////////////////////////////////////////////////////////////////////////////////////////////////////
//Problem Statement : write java program which accept number from user and display below pattern.
/*  Output :
            7   6   5   4   3   2   1   
            8   7   6   5   4   3   2   1
            4   3   2   1   
            6   5   4   3   2   1   
*/
/////////////////////////////////////////////////////////////////////////////////////////////////////
import java.util.*;

class MyArray
{
    public void Pattern(int iNo)
    {
        String str = String.valueOf(iNo);
        
        for(int i = 0 ; i < str.length(); i++)
        {
            int no = str.charAt(i) - '0';
            for(int j = no; j >= 1; j--)
            {
                System.out.print(" "+j);
            }
            System.out.println();
        }
    }
}
class program49_4
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
