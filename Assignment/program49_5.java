/////////////////////////////////////////////////////////////////////////////////////////////////////
//Problem Statement : write java program which accept number from user and display below pattern.
/*  Output :
            7   #   #   #   #   #   #   #     
            8   #   #   #   #   #   #   #   #
            4   #   #   #   #      
            6   #   #   #   #   #   #      
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
            System.out.print(no+"  #  " );
            for(int j = 1; j < no; j++)
            {
                System.out.print("#  ");
            }
            System.out.println();
        }
    }
}
class program49_5
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
