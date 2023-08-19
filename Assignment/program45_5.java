////////////////////////////////////////////////////////////////////////////////////////////////
//Problem Statement : write java program which accept no. of rows and no. of columns from user
// and display below pattern 
/*
        1   2   3   4   5
        1   2           5
        1       3       5
        1           4   5
        1   2   3   4   5
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

        for(int i = 1; i <= iRow; i++)
        {
            for(int j = 1; j <= iCol; j++)
            {
                if( (i == 1) || ( i == iRow) ||  i == j || (j == 1) || (j == iCol))
                {
                    System.out.print("\t"+j);
                }
                // else if(i < j)
                // {
                //     System.out.print("$\t");
                // }
                else
                {
                    System.out.print(" \t");
                }
            }
            System.out.println();
        }
    }
}   
class program45_5
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
