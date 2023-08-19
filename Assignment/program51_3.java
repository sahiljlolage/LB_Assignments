/////////////////////////////////////////////////////////////////////////////////////////////////////
//Problem Statement : write java program which accept number from user and display below pattern.
/*  Output :
            7   8   4   6       
            7   8   4          
            7   8          
            7          
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
            for(int j = 0; j < str.length()-i; j++)
            {
                System.out.print(str.charAt(j)+" ");
            }
             System.out.println();
        }
    }
}
class program51_3
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
