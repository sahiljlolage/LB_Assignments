////////////////////////////////////////////////////////////////////////////////////////////////
//Problem Statement : write java program which accept no. of rows and no. of columns from user
// and display below pattern 
/*
        *   *   *   *   *   *
        *   #   #   #   *   *
        *   #   #   *   $   *
        *   #   *   $   $   *
        *   *   $   $   $   *
        *   *   *   *   *   *
 */
////////////////////////////////////////////////////////////////////////////////////////////////
import java.util.*;

class Pattern
{
    public void Pattern(int iRow,int iCol)
    {
        if(iRow != iCol)
        {
            System.out.println("Invalid input");
            return ;
        }

        for(int i = iRow; i >= 1; i--)
        {
            for(int j = 1; j <= iCol; j++)
            {
                if( (i == 1) || ( i == iRow) || (j == 1) || (j == iCol) ||  i == j)
                {
                    System.out.print("*\t");
                }
                else if(i < j)
                {
                    System.out.print("$\t");
                }
                else
                {
                    System.out.print("#\t");
                }
            }
            System.out.println();
        }
    }
}   
class program45_4
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter Rows : ");
        int iValue1 = sobj.nextInt();
        
        System.out.println("Enter Columns : ");
        int iValue2 = sobj.nextInt();

        
        MyArray mobj = new MyArray();
        
        mobj.Pattern(iValue1,iValue2);
        
        sobj.close();
    }
}
