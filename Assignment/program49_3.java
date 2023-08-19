/////////////////////////////////////////////////////////////////////////////////////////////////////
//Problem Statement : write java program which accept number from user and display below pattern.
/*  Output :
            1   2   3   4   5   6   7   
            1   2   3   4   5   6   7   8
            1   2   3   4
            1   2   3   4   5   6   

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
            for(int j = 1; j <= no; j++)
            {
                System.out.print(" "+j);
            }
            System.out.println();
        }
    }
}
class program49_3
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
